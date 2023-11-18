package bw.co.roguesystems.life.config;

import java.util.Collection;
import java.util.Collections;
import java.util.Map;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configurers.AbstractHttpConfigurer;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.oauth2.client.oidc.userinfo.OidcUserRequest;
import org.springframework.security.oauth2.client.oidc.userinfo.OidcUserService;
import org.springframework.security.oauth2.client.userinfo.OAuth2UserService;
import org.springframework.security.oauth2.core.oidc.user.DefaultOidcUser;
import org.springframework.security.oauth2.core.oidc.user.OidcUser;
import org.springframework.security.oauth2.jwt.Jwt;
import org.springframework.security.oauth2.jwt.JwtClaimNames;
import org.springframework.security.oauth2.jwt.JwtDecoder;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class WebSecurityConfig {

        @Value("${jwt.auth.converter.resource-id}")
        private String resourceId;

        @Value("${jwt.auth.converter.principal-attribute}")
        private String principalAttribute;

        @Bean
        public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
                return http
                                .authorizeHttpRequests(authorizeHttpRequests -> authorizeHttpRequests
                                                .requestMatchers("/", "/css/**", "/js/**", "/images/**", "/webjars/**")
                                                .permitAll()
                                                .requestMatchers(HttpMethod.GET, "/", "/login", "/public/**")
                                                .permitAll()
                                                .requestMatchers("/oauth2/**").permitAll()
                                                .anyRequest().authenticated())
                                .oauth2Login(oauth2Login -> oauth2Login.loginPage("/oauth2/authorization/roguelife-web")
                                                .defaultSuccessUrl("/"))
                                .logout(logout -> logout.logoutSuccessUrl("/")
                                                .invalidateHttpSession(true).permitAll())
                                .csrf(AbstractHttpConfigurer::disable)
                                .build();
        }

        @Bean
        public OAuth2UserService<OidcUserRequest, OidcUser> oAuth2UserService(@Autowired JwtDecoder jwtDecoder) {
                OidcUserService delegate = new OidcUserService();
                return (userRequest) -> {
                        OidcUser oidcUser = delegate.loadUser(userRequest);

                        Jwt jwt = jwtDecoder.decode(userRequest.getAccessToken().getTokenValue());
                        System.out.println("JWT: " + userRequest.getAccessToken().getTokenValue());
                        Collection<? extends GrantedAuthority> authorities = extractRoles(jwt);

                        String nameAttributeKey = principalAttribute == null ? JwtClaimNames.SUB : principalAttribute;
                        return new DefaultOidcUser(authorities, oidcUser.getIdToken(), oidcUser.getUserInfo(),
                                        nameAttributeKey);
                };
        }

        private Collection<? extends GrantedAuthority> extractRoles(Jwt jwt) {
                Map<String, Object> resourceAccess = jwt.getClaim("resource_access");
                Map<String, Object> resource;
                Collection<String> resourceRoles;
                if (resourceAccess == null
                                || (resource = (Map<String, Object>) resourceAccess.get(resourceId)) == null
                                || (resourceRoles = (Collection<String>) resource.get("roles")) == null) {
                        return Collections.emptySet();
                }


                return resourceRoles.stream()
                                .map(role -> new SimpleGrantedAuthority("ROLE_" + role))
                                .collect(Collectors.toSet());
        }
}

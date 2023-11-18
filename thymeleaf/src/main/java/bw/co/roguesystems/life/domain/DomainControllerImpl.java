// license-header java merge-point
// Generated by andromda-thymeleaf cartridge (controllers\ControllerImpl.java.vsl)
package bw.co.roguesystems.life.domain;

import java.time.LocalDateTime;
import java.util.Locale;

import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.oauth2.client.authentication.OAuth2AuthenticationToken;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @see bw.co.roguesystems.life.domain.DomainController
 */
@Controller
@RequestMapping("/domain")
public class DomainControllerImpl
    extends DomainControllerBase 
{
    /**
     * The serial version UID of this class. Needed for serialization.
     */
    private static final long serialVersionUID = 3775531392146993789L;
    private final DomainService domainservice;

    public DomainControllerImpl(DomainService domainservice) {
        super(
        );

        this.domainservice = domainservice;
    }

    /**
     * @see bw.co.roguesystems.life.domain.DomainController#doInitialiseEditScreen(java.lang.Long id, DomainVO domain)
     */
    @Override
    public void doInitialiseEditScreen(DoInitialiseEditScreenForm form, Model model)
    {
        // populating value with dummy instance
        DomainVO domain = new DomainVO();
        domain.setKingdoms(null);
        domain.setCode(null);
        domain.setName(null);
        domain.setDescription(null);
        domain.setCreated(null);
        domain.setCreatedBy(null);
        domain.setUpdated(null);
        domain.setUpdatedBy(null);
        domain.setId(3355l);
        form.setDomain(domain);
        model.addAttribute("editDomainForm", form);
    }

    /**
     * @see bw.co.roguesystems.life.domain.DomainController#doDelete(DomainVO domain)
     */
    @Override
    public void doDelete(DoDeleteForm form, Model model)
    {
        // populating value with dummy instance
        DomainVO domain = new DomainVO();
        domain.setKingdoms(null);
        domain.setCode(null);
        domain.setName(null);
        domain.setDescription(null);
        domain.setCreated(null);
        domain.setCreatedBy(null);
        domain.setUpdated(null);
        domain.setUpdatedBy(null);
        domain.setId(3355l);
        form.setDomain(domain);
    }

    /**
     * @see bw.co.roguesystems.life.domain.DomainController#doSave(DomainVO domain)
     */
    @Override
    public void doSave(DoSaveForm form, Model model)
    {
        System.out.println(form.getDomain());
        OAuth2AuthenticationToken auth = (OAuth2AuthenticationToken) SecurityContextHolder.getContext().getAuthentication();

        if(form.getDomain().getId() == null) {
            form.getDomain().setCreatedBy(auth.getName());
            form.getDomain().setCreated(LocalDateTime.now());
        } else {
            form.getDomain().setUpdatedBy(auth.getName());
            form.getDomain().setUpdated(LocalDateTime.now());

        }
        // populating value with dummy instance
        DomainVO domain = this.domainservice.save(form.getDomain());
        form.setDomain(domain);
    }

    /**
     * @see bw.co.roguesystems.life.domain.DomainController#doInitialiseSearchScreen()
     */
    @Override
    public void doInitialiseSearchScreen(Model model)
    {
    }

    /**
     * @see bw.co.roguesystems.life.domain.DomainController#doSearch(java.lang.String criteria)
     */
    @Override
    public void doSearch(DoSearchForm form, Model model)
    {
    }

    /**
     * @see bw.co.roguesystems.life.domain.DomainController#doEdit(java.lang.Long id)
     */
    @Override
    public void doEdit(DoEditForm form, Model model)
    {
    }

}
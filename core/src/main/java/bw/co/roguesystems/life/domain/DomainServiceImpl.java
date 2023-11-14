// license-header java merge-point
/**
 * This is only generated once! It will never be overwritten.
 * You can (and have to!) safely modify it by hand.
 * TEMPLATE:    SpringServiceImpl.vsl in andromda-spring cartridge
 * MODEL CLASS: RogueLifeModel::backend::bw.co.roguesystems.life::domain::DomainService
 * STEREOTYPE:  Service
 */
package bw.co.roguesystems.life.domain;

import java.util.Collection;

import org.apache.commons.lang3.StringUtils;
import org.springframework.context.MessageSource;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import bw.co.roguesystems.life.RoguelifeSpecifications;

/**
 * @see bw.co.roguesystems.life.domain.DomainService
 */
@Service("domainService")
@Transactional(propagation = Propagation.REQUIRED, readOnly=false)
public class DomainServiceImpl
    extends DomainServiceBase
{
    public DomainServiceImpl(
        DomainDao domainDao,
        DomainRepository domainRepository,
        MessageSource messageSource
    ) {
        
        super(
            domainDao,
            domainRepository,
            messageSource
        );
    }

    /**
     * @see bw.co.roguesystems.life.domain.DomainService#findById(Long)
     */
    @Override
    protected DomainVO handleFindById(Long id)
        throws Exception
    {

        if(id == null) {
            throw new IllegalArgumentException("DomainService.findById(Long id) - 'id' can not be null");
        }

        Domain domain = this.domainRepository.getReferenceById(id);
        return this.domainDao.toDomainVO(domain);
    }

    /**
     * @see bw.co.roguesystems.life.domain.DomainService#getAll()
     */
    @Override
    protected Collection<DomainVO> handleGetAll()
        throws Exception
    {
        Collection<Domain> all = this.domainRepository.findAll();

        return this.domainDao.toDomainVOCollection(all);
    }

    /**
     * @see bw.co.roguesystems.life.domain.DomainService#getAll(Integer, Integer)
     */
    @Override
    protected Page handleGetAll(Integer pageNumber, Integer pageSize)
        throws Exception
    {

        Page<Domain> all = this.domainRepository.findAll(PageRequest.of(pageNumber, pageSize));
        return all.map(this.domainDao::toDomainVO);
    }

    /**
     * @see bw.co.roguesystems.life.domain.DomainService#remove(Long)
     */
    @Override
    protected boolean handleRemove(Long id)
        throws Exception
    {

        if(id == null) {
            throw new IllegalArgumentException("DomainService.remove(Long id) - 'id' can not be null");
        }

        this.domainRepository.deleteById(id);

        return true;
    }

    /**
     * @see bw.co.roguesystems.life.domain.DomainService#save(DomainVO)
     */
    @Override
    protected DomainVO handleSave(DomainVO domain)
        throws Exception
    {

        if(domain == null) {
            throw new IllegalArgumentException("DomainService.save(DomainVO domain) - 'domain' can not be null");
        }

        Domain domainEntity = this.domainDao.domainVOToEntity(domain);
        domainEntity = this.domainRepository.save(domainEntity);

        return this.domainDao.toDomainVO(domainEntity);
    }

    private Specification<Domain> getSpecification(String criteria) {
        Specification<Domain> spec = null;

        if(StringUtils.isNotBlank(criteria)) {
            spec = RoguelifeSpecifications.<Domain>findByAttributeContainingIgnoreCase("code", criteria)
                .or(RoguelifeSpecifications.<Domain>findByAttributeContainingIgnoreCase("name", criteria)); 
        }

        return spec;
    }

    /**
     * @see bw.co.roguesystems.life.domain.DomainService#search(String)
     */
    @Override
    protected Collection<DomainVO> handleSearch(String criteria)
        throws Exception
    {
        Specification<Domain> spec = this.getSpecification(criteria);

        Collection<Domain> all = this.domainRepository.findAll(spec);
        return this.domainDao.toDomainVOCollection(all);
    }

    /**
     * @see bw.co.roguesystems.life.domain.DomainService#search(Integer, Integer, String)
     */
    @Override
    protected Page handleSearch(Integer pageNumber, Integer pageSize, String criteria)
        throws Exception
    {
        Specification<Domain> spec = this.getSpecification(criteria);

        Page<Domain> all = this.domainRepository.findAll(spec, PageRequest.of(pageNumber, pageSize));
        return all.map(this.domainDao::toDomainVO);
    }

}
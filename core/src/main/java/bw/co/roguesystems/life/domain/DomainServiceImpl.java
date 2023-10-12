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
import org.springframework.context.MessageSource;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * @see bw.co.roguesystems.life.domain.DomainService
 */
@Service("domainService")
@Transactional(propagation = Propagation.REQUIRED, readOnly=false)
public class DomainServiceImpl
    extends DomainServiceBase
{
    public DomainServiceImpl(
        DomainDao domain,
        DomainRepository domainRepository,
        MessageSource messageSource
    ) {
        
        super(
            domain,
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
        // TODO implement protected  DomainVO handleFindById(Long id)
        throw new UnsupportedOperationException("bw.co.roguesystems.life.domain.DomainService.handleFindById(Long id) Not implemented!");
    }

    /**
     * @see bw.co.roguesystems.life.domain.DomainService#getAll()
     */
    @Override
    protected Collection<DomainVO> handleGetAll()
        throws Exception
    {
        // TODO implement protected  Collection<DomainVO> handleGetAll()
        throw new UnsupportedOperationException("bw.co.roguesystems.life.domain.DomainService.handleGetAll() Not implemented!");
    }

    /**
     * @see bw.co.roguesystems.life.domain.DomainService#getAll(Integer, Integer)
     */
    @Override
    protected Page handleGetAll(Integer pageNumber, Integer pageSize)
        throws Exception
    {
        // TODO implement protected  Page handleGetAll(Integer pageNumber, Integer pageSize)
        throw new UnsupportedOperationException("bw.co.roguesystems.life.domain.DomainService.handleGetAll(Integer pageNumber, Integer pageSize) Not implemented!");
    }

    /**
     * @see bw.co.roguesystems.life.domain.DomainService#remove(Long)
     */
    @Override
    protected boolean handleRemove(Long id)
        throws Exception
    {
        // TODO implement protected  boolean handleRemove(Long id)
        throw new UnsupportedOperationException("bw.co.roguesystems.life.domain.DomainService.handleRemove(Long id) Not implemented!");
    }

    /**
     * @see bw.co.roguesystems.life.domain.DomainService#save(DomainVO)
     */
    @Override
    protected DomainVO handleSave(DomainVO domain)
        throws Exception
    {
        // TODO implement protected  DomainVO handleSave(DomainVO domain)
        throw new UnsupportedOperationException("bw.co.roguesystems.life.domain.DomainService.handleSave(DomainVO domain) Not implemented!");
    }

    /**
     * @see bw.co.roguesystems.life.domain.DomainService#search(String)
     */
    @Override
    protected Collection<DomainVO> handleSearch(String criteria)
        throws Exception
    {
        // TODO implement protected  Collection<DomainVO> handleSearch(String criteria)
        throw new UnsupportedOperationException("bw.co.roguesystems.life.domain.DomainService.handleSearch(String criteria) Not implemented!");
    }

    /**
     * @see bw.co.roguesystems.life.domain.DomainService#search(Integer, Integer, String)
     */
    @Override
    protected Page handleSearch(Integer pageNumber, Integer pageSize, String criteria)
        throws Exception
    {
        // TODO implement protected  Page handleSearch(Integer pageNumber, Integer pageSize, String criteria)
        throw new UnsupportedOperationException("bw.co.roguesystems.life.domain.DomainService.handleSearch(Integer pageNumber, Integer pageSize, String criteria) Not implemented!");
    }

}
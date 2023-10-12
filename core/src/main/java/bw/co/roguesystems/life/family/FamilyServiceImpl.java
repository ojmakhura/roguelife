// license-header java merge-point
/**
 * This is only generated once! It will never be overwritten.
 * You can (and have to!) safely modify it by hand.
 * TEMPLATE:    SpringServiceImpl.vsl in andromda-spring cartridge
 * MODEL CLASS: RogueLifeModel::backend::bw.co.roguesystems.life::family::FamilyService
 * STEREOTYPE:  Service
 */
package bw.co.roguesystems.life.family;

import java.util.Collection;
import org.springframework.context.MessageSource;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * @see bw.co.roguesystems.life.family.FamilyService
 */
@Service("familyService")
@Transactional(propagation = Propagation.REQUIRED, readOnly=false)
public class FamilyServiceImpl
    extends FamilyServiceBase
{
    public FamilyServiceImpl(
        FamilyDao family,
        FamilyRepository familyRepository,
        MessageSource messageSource
    ) {
        
        super(
            family,
            familyRepository,
            messageSource
        );
    }

    /**
     * @see bw.co.roguesystems.life.family.FamilyService#findById(Long)
     */
    @Override
    protected FamilyVO handleFindById(Long id)
        throws Exception
    {
        // TODO implement protected  FamilyVO handleFindById(Long id)
        throw new UnsupportedOperationException("bw.co.roguesystems.life.family.FamilyService.handleFindById(Long id) Not implemented!");
    }

    /**
     * @see bw.co.roguesystems.life.family.FamilyService#getAll()
     */
    @Override
    protected Collection<FamilyVO> handleGetAll()
        throws Exception
    {
        // TODO implement protected  Collection<FamilyVO> handleGetAll()
        throw new UnsupportedOperationException("bw.co.roguesystems.life.family.FamilyService.handleGetAll() Not implemented!");
    }

    /**
     * @see bw.co.roguesystems.life.family.FamilyService#getAll(Integer, Integer)
     */
    @Override
    protected Page handleGetAll(Integer pageNumber, Integer pageSize)
        throws Exception
    {
        // TODO implement protected  Page handleGetAll(Integer pageNumber, Integer pageSize)
        throw new UnsupportedOperationException("bw.co.roguesystems.life.family.FamilyService.handleGetAll(Integer pageNumber, Integer pageSize) Not implemented!");
    }

    /**
     * @see bw.co.roguesystems.life.family.FamilyService#remove(Long)
     */
    @Override
    protected boolean handleRemove(Long id)
        throws Exception
    {
        // TODO implement protected  boolean handleRemove(Long id)
        throw new UnsupportedOperationException("bw.co.roguesystems.life.family.FamilyService.handleRemove(Long id) Not implemented!");
    }

    /**
     * @see bw.co.roguesystems.life.family.FamilyService#save(FamilyVO)
     */
    @Override
    protected FamilyVO handleSave(FamilyVO family)
        throws Exception
    {
        // TODO implement protected  FamilyVO handleSave(FamilyVO family)
        throw new UnsupportedOperationException("bw.co.roguesystems.life.family.FamilyService.handleSave(FamilyVO family) Not implemented!");
    }

    /**
     * @see bw.co.roguesystems.life.family.FamilyService#search(String)
     */
    @Override
    protected Collection<FamilyVO> handleSearch(String criteria)
        throws Exception
    {
        // TODO implement protected  Collection<FamilyVO> handleSearch(String criteria)
        throw new UnsupportedOperationException("bw.co.roguesystems.life.family.FamilyService.handleSearch(String criteria) Not implemented!");
    }

    /**
     * @see bw.co.roguesystems.life.family.FamilyService#search(Integer, Integer, String)
     */
    @Override
    protected Page handleSearch(Integer pageNumber, Integer pageSize, String criteria)
        throws Exception
    {
        // TODO implement protected  Page handleSearch(Integer pageNumber, Integer pageSize, String criteria)
        throw new UnsupportedOperationException("bw.co.roguesystems.life.family.FamilyService.handleSearch(Integer pageNumber, Integer pageSize, String criteria) Not implemented!");
    }

}
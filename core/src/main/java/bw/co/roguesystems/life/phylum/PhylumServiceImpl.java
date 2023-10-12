// license-header java merge-point
/**
 * This is only generated once! It will never be overwritten.
 * You can (and have to!) safely modify it by hand.
 * TEMPLATE:    SpringServiceImpl.vsl in andromda-spring cartridge
 * MODEL CLASS: RogueLifeModel::backend::bw.co.roguesystems.life::phylum::PhylumService
 * STEREOTYPE:  Service
 */
package bw.co.roguesystems.life.phylum;

import java.util.Collection;
import org.springframework.context.MessageSource;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * @see bw.co.roguesystems.life.phylum.PhylumService
 */
@Service("phylumService")
@Transactional(propagation = Propagation.REQUIRED, readOnly=false)
public class PhylumServiceImpl
    extends PhylumServiceBase
{
    public PhylumServiceImpl(
        PhylumDao phylum,
        PhylumRepository phylumRepository,
        MessageSource messageSource
    ) {
        
        super(
            phylum,
            phylumRepository,
            messageSource
        );
    }

    /**
     * @see bw.co.roguesystems.life.phylum.PhylumService#findById(Long)
     */
    @Override
    protected PhylumVO handleFindById(Long id)
        throws Exception
    {
        // TODO implement protected  PhylumVO handleFindById(Long id)
        throw new UnsupportedOperationException("bw.co.roguesystems.life.phylum.PhylumService.handleFindById(Long id) Not implemented!");
    }

    /**
     * @see bw.co.roguesystems.life.phylum.PhylumService#getAll()
     */
    @Override
    protected Collection<PhylumVO> handleGetAll()
        throws Exception
    {
        // TODO implement protected  Collection<PhylumVO> handleGetAll()
        throw new UnsupportedOperationException("bw.co.roguesystems.life.phylum.PhylumService.handleGetAll() Not implemented!");
    }

    /**
     * @see bw.co.roguesystems.life.phylum.PhylumService#getAll(Integer, Integer)
     */
    @Override
    protected Page handleGetAll(Integer pageNumber, Integer pageSize)
        throws Exception
    {
        // TODO implement protected  Page handleGetAll(Integer pageNumber, Integer pageSize)
        throw new UnsupportedOperationException("bw.co.roguesystems.life.phylum.PhylumService.handleGetAll(Integer pageNumber, Integer pageSize) Not implemented!");
    }

    /**
     * @see bw.co.roguesystems.life.phylum.PhylumService#remove(Long)
     */
    @Override
    protected boolean handleRemove(Long id)
        throws Exception
    {
        // TODO implement protected  boolean handleRemove(Long id)
        throw new UnsupportedOperationException("bw.co.roguesystems.life.phylum.PhylumService.handleRemove(Long id) Not implemented!");
    }

    /**
     * @see bw.co.roguesystems.life.phylum.PhylumService#save(PhylumVO)
     */
    @Override
    protected PhylumVO handleSave(PhylumVO phylum)
        throws Exception
    {
        // TODO implement protected  PhylumVO handleSave(PhylumVO phylum)
        throw new UnsupportedOperationException("bw.co.roguesystems.life.phylum.PhylumService.handleSave(PhylumVO phylum) Not implemented!");
    }

    /**
     * @see bw.co.roguesystems.life.phylum.PhylumService#search(String)
     */
    @Override
    protected Collection<PhylumVO> handleSearch(String criteria)
        throws Exception
    {
        // TODO implement protected  Collection<PhylumVO> handleSearch(String criteria)
        throw new UnsupportedOperationException("bw.co.roguesystems.life.phylum.PhylumService.handleSearch(String criteria) Not implemented!");
    }

    /**
     * @see bw.co.roguesystems.life.phylum.PhylumService#search(Integer, Integer, String)
     */
    @Override
    protected Page handleSearch(Integer pageNumber, Integer pageSize, String criteria)
        throws Exception
    {
        // TODO implement protected  Page handleSearch(Integer pageNumber, Integer pageSize, String criteria)
        throw new UnsupportedOperationException("bw.co.roguesystems.life.phylum.PhylumService.handleSearch(Integer pageNumber, Integer pageSize, String criteria) Not implemented!");
    }

}
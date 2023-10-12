// license-header java merge-point
/**
 * This is only generated once! It will never be overwritten.
 * You can (and have to!) safely modify it by hand.
 * TEMPLATE:    SpringServiceImpl.vsl in andromda-spring cartridge
 * MODEL CLASS: RogueLifeModel::backend::bw.co.roguesystems.life::genus::GenusService
 * STEREOTYPE:  Service
 */
package bw.co.roguesystems.life.genus;

import java.util.Collection;
import org.springframework.context.MessageSource;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * @see bw.co.roguesystems.life.genus.GenusService
 */
@Service("genusService")
@Transactional(propagation = Propagation.REQUIRED, readOnly=false)
public class GenusServiceImpl
    extends GenusServiceBase
{
    public GenusServiceImpl(
        GenusDao genus,
        GenusRepository genusRepository,
        MessageSource messageSource
    ) {
        
        super(
            genus,
            genusRepository,
            messageSource
        );
    }

    /**
     * @see bw.co.roguesystems.life.genus.GenusService#findById(Long)
     */
    @Override
    protected GenusVO handleFindById(Long id)
        throws Exception
    {
        // TODO implement protected  GenusVO handleFindById(Long id)
        throw new UnsupportedOperationException("bw.co.roguesystems.life.genus.GenusService.handleFindById(Long id) Not implemented!");
    }

    /**
     * @see bw.co.roguesystems.life.genus.GenusService#getAll()
     */
    @Override
    protected Collection<GenusVO> handleGetAll()
        throws Exception
    {
        // TODO implement protected  Collection<GenusVO> handleGetAll()
        throw new UnsupportedOperationException("bw.co.roguesystems.life.genus.GenusService.handleGetAll() Not implemented!");
    }

    /**
     * @see bw.co.roguesystems.life.genus.GenusService#getAll(Integer, Integer)
     */
    @Override
    protected Page handleGetAll(Integer pageNumber, Integer pageSize)
        throws Exception
    {
        // TODO implement protected  Page handleGetAll(Integer pageNumber, Integer pageSize)
        throw new UnsupportedOperationException("bw.co.roguesystems.life.genus.GenusService.handleGetAll(Integer pageNumber, Integer pageSize) Not implemented!");
    }

    /**
     * @see bw.co.roguesystems.life.genus.GenusService#remove(Long)
     */
    @Override
    protected boolean handleRemove(Long id)
        throws Exception
    {
        // TODO implement protected  boolean handleRemove(Long id)
        throw new UnsupportedOperationException("bw.co.roguesystems.life.genus.GenusService.handleRemove(Long id) Not implemented!");
    }

    /**
     * @see bw.co.roguesystems.life.genus.GenusService#save(GenusVO)
     */
    @Override
    protected GenusVO handleSave(GenusVO genus)
        throws Exception
    {
        // TODO implement protected  GenusVO handleSave(GenusVO genus)
        throw new UnsupportedOperationException("bw.co.roguesystems.life.genus.GenusService.handleSave(GenusVO genus) Not implemented!");
    }

    /**
     * @see bw.co.roguesystems.life.genus.GenusService#search(String)
     */
    @Override
    protected Collection<GenusVO> handleSearch(String criteria)
        throws Exception
    {
        // TODO implement protected  Collection<GenusVO> handleSearch(String criteria)
        throw new UnsupportedOperationException("bw.co.roguesystems.life.genus.GenusService.handleSearch(String criteria) Not implemented!");
    }

    /**
     * @see bw.co.roguesystems.life.genus.GenusService#search(Integer, Integer, String)
     */
    @Override
    protected Page handleSearch(Integer pageNumber, Integer pageSize, String criteria)
        throws Exception
    {
        // TODO implement protected  Page handleSearch(Integer pageNumber, Integer pageSize, String criteria)
        throw new UnsupportedOperationException("bw.co.roguesystems.life.genus.GenusService.handleSearch(Integer pageNumber, Integer pageSize, String criteria) Not implemented!");
    }

}
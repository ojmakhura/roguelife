// license-header java merge-point
/**
 * This is only generated once! It will never be overwritten.
 * You can (and have to!) safely modify it by hand.
 * TEMPLATE:    SpringServiceImpl.vsl in andromda-spring cartridge
 * MODEL CLASS: RogueLifeModel::backend::bw.co.roguesystems.life::kingdom::KingdomService
 * STEREOTYPE:  Service
 */
package bw.co.roguesystems.life.kingdom;

import java.util.Collection;
import org.springframework.context.MessageSource;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * @see bw.co.roguesystems.life.kingdom.KingdomService
 */
@Service("kingdomService")
@Transactional(propagation = Propagation.REQUIRED, readOnly=false)
public class KingdomServiceImpl
    extends KingdomServiceBase
{
    public KingdomServiceImpl(
        KingdomDao kingdom,
        KingdomRepository kingdomRepository,
        MessageSource messageSource
    ) {
        
        super(
            kingdom,
            kingdomRepository,
            messageSource
        );
    }

    /**
     * @see bw.co.roguesystems.life.kingdom.KingdomService#findById(Long)
     */
    @Override
    protected KingdomVO handleFindById(Long id)
        throws Exception
    {
        // TODO implement protected  KingdomVO handleFindById(Long id)
        throw new UnsupportedOperationException("bw.co.roguesystems.life.kingdom.KingdomService.handleFindById(Long id) Not implemented!");
    }

    /**
     * @see bw.co.roguesystems.life.kingdom.KingdomService#getAll()
     */
    @Override
    protected Collection<KingdomVO> handleGetAll()
        throws Exception
    {
        // TODO implement protected  Collection<KingdomVO> handleGetAll()
        throw new UnsupportedOperationException("bw.co.roguesystems.life.kingdom.KingdomService.handleGetAll() Not implemented!");
    }

    /**
     * @see bw.co.roguesystems.life.kingdom.KingdomService#getAll(Integer, Integer)
     */
    @Override
    protected Page handleGetAll(Integer pageNumber, Integer pageSize)
        throws Exception
    {
        // TODO implement protected  Page handleGetAll(Integer pageNumber, Integer pageSize)
        throw new UnsupportedOperationException("bw.co.roguesystems.life.kingdom.KingdomService.handleGetAll(Integer pageNumber, Integer pageSize) Not implemented!");
    }

    /**
     * @see bw.co.roguesystems.life.kingdom.KingdomService#remove(Long)
     */
    @Override
    protected boolean handleRemove(Long id)
        throws Exception
    {
        // TODO implement protected  boolean handleRemove(Long id)
        throw new UnsupportedOperationException("bw.co.roguesystems.life.kingdom.KingdomService.handleRemove(Long id) Not implemented!");
    }

    /**
     * @see bw.co.roguesystems.life.kingdom.KingdomService#save(KingdomVO)
     */
    @Override
    protected KingdomVO handleSave(KingdomVO kingdom)
        throws Exception
    {
        // TODO implement protected  KingdomVO handleSave(KingdomVO kingdom)
        throw new UnsupportedOperationException("bw.co.roguesystems.life.kingdom.KingdomService.handleSave(KingdomVO kingdom) Not implemented!");
    }

    /**
     * @see bw.co.roguesystems.life.kingdom.KingdomService#search(String)
     */
    @Override
    protected Collection<KingdomVO> handleSearch(String criteria)
        throws Exception
    {
        // TODO implement protected  Collection<KingdomVO> handleSearch(String criteria)
        throw new UnsupportedOperationException("bw.co.roguesystems.life.kingdom.KingdomService.handleSearch(String criteria) Not implemented!");
    }

    /**
     * @see bw.co.roguesystems.life.kingdom.KingdomService#search(Integer, Integer, String)
     */
    @Override
    protected Page handleSearch(Integer pageNumber, Integer pageSize, String criteria)
        throws Exception
    {
        // TODO implement protected  Page handleSearch(Integer pageNumber, Integer pageSize, String criteria)
        throw new UnsupportedOperationException("bw.co.roguesystems.life.kingdom.KingdomService.handleSearch(Integer pageNumber, Integer pageSize, String criteria) Not implemented!");
    }

}
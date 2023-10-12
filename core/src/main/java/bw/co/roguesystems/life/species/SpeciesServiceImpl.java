// license-header java merge-point
/**
 * This is only generated once! It will never be overwritten.
 * You can (and have to!) safely modify it by hand.
 * TEMPLATE:    SpringServiceImpl.vsl in andromda-spring cartridge
 * MODEL CLASS: RogueLifeModel::backend::bw.co.roguesystems.life::species::SpeciesService
 * STEREOTYPE:  Service
 */
package bw.co.roguesystems.life.species;

import java.util.Collection;
import org.springframework.context.MessageSource;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * @see bw.co.roguesystems.life.species.SpeciesService
 */
@Service("speciesService")
@Transactional(propagation = Propagation.REQUIRED, readOnly=false)
public class SpeciesServiceImpl
    extends SpeciesServiceBase
{
    public SpeciesServiceImpl(
        SpeciesDao species,
        SpeciesRepository speciesRepository,
        MessageSource messageSource
    ) {
        
        super(
            species,
            speciesRepository,
            messageSource
        );
    }

    /**
     * @see bw.co.roguesystems.life.species.SpeciesService#findById(Long)
     */
    @Override
    protected SpeciesVO handleFindById(Long id)
        throws Exception
    {
        // TODO implement protected  SpeciesVO handleFindById(Long id)
        throw new UnsupportedOperationException("bw.co.roguesystems.life.species.SpeciesService.handleFindById(Long id) Not implemented!");
    }

    /**
     * @see bw.co.roguesystems.life.species.SpeciesService#getAll()
     */
    @Override
    protected Collection<SpeciesVO> handleGetAll()
        throws Exception
    {
        // TODO implement protected  Collection<SpeciesVO> handleGetAll()
        throw new UnsupportedOperationException("bw.co.roguesystems.life.species.SpeciesService.handleGetAll() Not implemented!");
    }

    /**
     * @see bw.co.roguesystems.life.species.SpeciesService#getAll(Integer, Integer)
     */
    @Override
    protected Page handleGetAll(Integer pageNumber, Integer pageSize)
        throws Exception
    {
        // TODO implement protected  Page handleGetAll(Integer pageNumber, Integer pageSize)
        throw new UnsupportedOperationException("bw.co.roguesystems.life.species.SpeciesService.handleGetAll(Integer pageNumber, Integer pageSize) Not implemented!");
    }

    /**
     * @see bw.co.roguesystems.life.species.SpeciesService#remove(Long)
     */
    @Override
    protected boolean handleRemove(Long id)
        throws Exception
    {
        // TODO implement protected  boolean handleRemove(Long id)
        throw new UnsupportedOperationException("bw.co.roguesystems.life.species.SpeciesService.handleRemove(Long id) Not implemented!");
    }

    /**
     * @see bw.co.roguesystems.life.species.SpeciesService#save(SpeciesVO)
     */
    @Override
    protected SpeciesVO handleSave(SpeciesVO species)
        throws Exception
    {
        // TODO implement protected  SpeciesVO handleSave(SpeciesVO species)
        throw new UnsupportedOperationException("bw.co.roguesystems.life.species.SpeciesService.handleSave(SpeciesVO species) Not implemented!");
    }

    /**
     * @see bw.co.roguesystems.life.species.SpeciesService#search(String)
     */
    @Override
    protected Collection<SpeciesVO> handleSearch(String criteria)
        throws Exception
    {
        // TODO implement protected  Collection<SpeciesVO> handleSearch(String criteria)
        throw new UnsupportedOperationException("bw.co.roguesystems.life.species.SpeciesService.handleSearch(String criteria) Not implemented!");
    }

    /**
     * @see bw.co.roguesystems.life.species.SpeciesService#search(Integer, Integer, String)
     */
    @Override
    protected Pageable handleSearch(Integer pageNumber, Integer pageSize, String criteria)
        throws Exception
    {
        // TODO implement protected  Pageable handleSearch(Integer pageNumber, Integer pageSize, String criteria)
        throw new UnsupportedOperationException("bw.co.roguesystems.life.species.SpeciesService.handleSearch(Integer pageNumber, Integer pageSize, String criteria) Not implemented!");
    }

}
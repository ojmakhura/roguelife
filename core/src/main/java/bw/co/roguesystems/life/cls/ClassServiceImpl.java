// license-header java merge-point
/**
 * This is only generated once! It will never be overwritten.
 * You can (and have to!) safely modify it by hand.
 * TEMPLATE:    SpringServiceImpl.vsl in andromda-spring cartridge
 * MODEL CLASS: RogueLifeModel::backend::bw.co.roguesystems.life::cls::ClassService
 * STEREOTYPE:  Service
 */
package bw.co.roguesystems.life.cls;

import java.util.Collection;
import org.springframework.context.MessageSource;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * @see bw.co.roguesystems.life.cls.ClassService
 */
@Service("classService")
@Transactional(propagation = Propagation.REQUIRED, readOnly=false)
public class ClassServiceImpl
    extends ClassServiceBase
{
    public ClassServiceImpl(
        ClassEntityDao classEntity,
        ClassEntityRepository classEntityRepository,
        MessageSource messageSource
    ) {
        
        super(
            classEntity,
            classEntityRepository,
            messageSource
        );
    }

    /**
     * @see bw.co.roguesystems.life.cls.ClassService#findById(Long)
     */
    @Override
    protected ClassVO handleFindById(Long id)
        throws Exception
    {
        // TODO implement protected  ClassVO handleFindById(Long id)
        throw new UnsupportedOperationException("bw.co.roguesystems.life.cls.ClassService.handleFindById(Long id) Not implemented!");
    }

    /**
     * @see bw.co.roguesystems.life.cls.ClassService#getAll()
     */
    @Override
    protected Collection<ClassVO> handleGetAll()
        throws Exception
    {
        // TODO implement protected  Collection<ClassVO> handleGetAll()
        throw new UnsupportedOperationException("bw.co.roguesystems.life.cls.ClassService.handleGetAll() Not implemented!");
    }

    /**
     * @see bw.co.roguesystems.life.cls.ClassService#getAll(Integer, Integer)
     */
    @Override
    protected Page handleGetAll(Integer pageNumber, Integer pageSize)
        throws Exception
    {
        // TODO implement protected  Page handleGetAll(Integer pageNumber, Integer pageSize)
        throw new UnsupportedOperationException("bw.co.roguesystems.life.cls.ClassService.handleGetAll(Integer pageNumber, Integer pageSize) Not implemented!");
    }

    /**
     * @see bw.co.roguesystems.life.cls.ClassService#remove(Long)
     */
    @Override
    protected boolean handleRemove(Long id)
        throws Exception
    {
        // TODO implement protected  boolean handleRemove(Long id)
        throw new UnsupportedOperationException("bw.co.roguesystems.life.cls.ClassService.handleRemove(Long id) Not implemented!");
    }

    /**
     * @see bw.co.roguesystems.life.cls.ClassService#save(ClassVO)
     */
    @Override
    protected ClassVO handleSave(ClassVO cls)
        throws Exception
    {
        // TODO implement protected  ClassVO handleSave(ClassVO cls)
        throw new UnsupportedOperationException("bw.co.roguesystems.life.cls.ClassService.handleSave(ClassVO cls) Not implemented!");
    }

    /**
     * @see bw.co.roguesystems.life.cls.ClassService#search(String)
     */
    @Override
    protected Collection<ClassVO> handleSearch(String criteria)
        throws Exception
    {
        // TODO implement protected  Collection<ClassVO> handleSearch(String criteria)
        throw new UnsupportedOperationException("bw.co.roguesystems.life.cls.ClassService.handleSearch(String criteria) Not implemented!");
    }

    /**
     * @see bw.co.roguesystems.life.cls.ClassService#search(Integer, Integer, String)
     */
    @Override
    protected Page handleSearch(Integer pageNumber, Integer pageSize, String criteria)
        throws Exception
    {
        // TODO implement protected  Page handleSearch(Integer pageNumber, Integer pageSize, String criteria)
        throw new UnsupportedOperationException("bw.co.roguesystems.life.cls.ClassService.handleSearch(Integer pageNumber, Integer pageSize, String criteria) Not implemented!");
    }

}
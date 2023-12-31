// Generated by hibernate/SpringHibernateDaoImpl.vsl in andromda-spring-cartridge on $springUtils.date.
// license-header java merge-point
/**
 * This is only generated once! It will never be overwritten.
 * You can (and have to!) safely modify it by hand.
 */
package bw.co.roguesystems.life.cls;

import bw.co.roguesystems.life.order.OrderRepository;
import bw.co.roguesystems.life.phylum.PhylumRepository;
import org.springframework.stereotype.Repository;

/**
 * @see ClassEntity
 */
@Repository("classEntityDao")
public class ClassEntityDaoImpl
    extends ClassEntityDaoBase
{
    
    public ClassEntityDaoImpl(
        PhylumRepository phylumRepository,
        OrderRepository orderRepository,
        ClassEntityRepository classEntityRepository
    ) {

        super(
            phylumRepository,
            orderRepository,
            classEntityRepository
        );
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void toClassVO(
        ClassEntity source,
        ClassVO target)
    {
        // TODO verify behavior of toClassVO
        super.toClassVO(source, target);
        // WARNING! No conversion for target.phylum (can't convert source.getPhylum():bw.co.roguesystems.life.phylum.Phylum to bw.co.roguesystems.life.phylum.PhylumVO
        // WARNING! No conversion for target.orders (can't convert source.getOrders():bw.co.roguesystems.life.order.Order to bw.co.roguesystems.life.order.OrderVO
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ClassVO toClassVO(final ClassEntity entity)
    {
        // TODO verify behavior of toClassVO
        return super.toClassVO(entity);
    }

    /**
     * Retrieves the entity object that is associated with the specified value object
     * from the object store. If no such entity object exists in the object store,
     * a new, blank entity is created
     */
    private ClassEntity loadClassEntityFromClassVO(ClassVO classVO)
    {
        // TODO implement loadClassEntityFromClassVO
        throw new UnsupportedOperationException("bw.co.roguesystems.life.cls.loadClassEntityFromClassVO(ClassVO) not yet implemented.");

        /* A typical implementation looks like this:
        if (classVO.getId() == null)
        {
            return  ClassEntity.Factory.newInstance();
        }
        else
        {
            return this.load(classVO.getId());
        }
        */
    }

    /**
     * {@inheritDoc}
     */
    public ClassEntity classVOToEntity(ClassVO classVO)
    {
        // TODO verify behavior of classVOToEntity
        ClassEntity entity = this.loadClassEntityFromClassVO(classVO);
        this.classVOToEntity(classVO, entity, true);
        return entity;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void classVOToEntity(
        ClassVO source,
        ClassEntity target,
        boolean copyIfNull)
    {
        // TODO verify behavior of classVOToEntity
        super.classVOToEntity(source, target, copyIfNull);
    }
}
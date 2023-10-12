// Generated by hibernate/SpringHibernateDaoImpl.vsl in andromda-spring-cartridge on $springUtils.date.
// license-header java merge-point
/**
 * This is only generated once! It will never be overwritten.
 * You can (and have to!) safely modify it by hand.
 */
package bw.co.roguesystems.life.order;

import bw.co.roguesystems.life.cls.ClassEntityRepository;
import bw.co.roguesystems.life.family.FamilyRepository;
import org.springframework.stereotype.Repository;

/**
 * @see Order
 */
@Repository("orderDao")
public class OrderDaoImpl
    extends OrderDaoBase
{
    
    public OrderDaoImpl(
        ClassEntityRepository classEntityRepository,
        FamilyRepository familyRepository,
        OrderRepository orderRepository
    ) {

        super(
            classEntityRepository,
            familyRepository,
            orderRepository
        );
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void toOrderVO(
        Order source,
        OrderVO target)
    {
        // TODO verify behavior of toOrderVO
        super.toOrderVO(source, target);
        // WARNING! No conversion for target.families (can't convert source.getFamilies():bw.co.roguesystems.life.family.Family to bw.co.roguesystems.life.family.FamilyVO
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OrderVO toOrderVO(final Order entity)
    {
        // TODO verify behavior of toOrderVO
        return super.toOrderVO(entity);
    }

    /**
     * Retrieves the entity object that is associated with the specified value object
     * from the object store. If no such entity object exists in the object store,
     * a new, blank entity is created
     */
    private Order loadOrderFromOrderVO(OrderVO orderVO)
    {
        // TODO implement loadOrderFromOrderVO
        throw new UnsupportedOperationException("bw.co.roguesystems.life.order.loadOrderFromOrderVO(OrderVO) not yet implemented.");

        /* A typical implementation looks like this:
        if (orderVO.getId() == null)
        {
            return  Order.Factory.newInstance();
        }
        else
        {
            return this.load(orderVO.getId());
        }
        */
    }

    /**
     * {@inheritDoc}
     */
    public Order orderVOToEntity(OrderVO orderVO)
    {
        // TODO verify behavior of orderVOToEntity
        Order entity = this.loadOrderFromOrderVO(orderVO);
        this.orderVOToEntity(orderVO, entity, true);
        return entity;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void orderVOToEntity(
        OrderVO source,
        Order target,
        boolean copyIfNull)
    {
        // TODO verify behavior of orderVOToEntity
        super.orderVOToEntity(source, target, copyIfNull);
    }
}
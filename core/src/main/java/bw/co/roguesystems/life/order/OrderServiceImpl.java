// license-header java merge-point
/**
 * This is only generated once! It will never be overwritten.
 * You can (and have to!) safely modify it by hand.
 * TEMPLATE:    SpringServiceImpl.vsl in andromda-spring cartridge
 * MODEL CLASS: RogueLifeModel::backend::bw.co.roguesystems.life::order::OrderService
 * STEREOTYPE:  Service
 */
package bw.co.roguesystems.life.order;

import java.util.Collection;
import org.springframework.context.MessageSource;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * @see bw.co.roguesystems.life.order.OrderService
 */
@Service("orderService")
@Transactional(propagation = Propagation.REQUIRED, readOnly=false)
public class OrderServiceImpl
    extends OrderServiceBase
{
    public OrderServiceImpl(
        OrderDao order,
        OrderRepository orderRepository,
        MessageSource messageSource
    ) {
        
        super(
            order,
            orderRepository,
            messageSource
        );
    }

    /**
     * @see bw.co.roguesystems.life.order.OrderService#findById(Long)
     */
    @Override
    protected OrderVO handleFindById(Long id)
        throws Exception
    {
        // TODO implement protected  OrderVO handleFindById(Long id)
        throw new UnsupportedOperationException("bw.co.roguesystems.life.order.OrderService.handleFindById(Long id) Not implemented!");
    }

    /**
     * @see bw.co.roguesystems.life.order.OrderService#getAll()
     */
    @Override
    protected Collection<OrderVO> handleGetAll()
        throws Exception
    {
        // TODO implement protected  Collection<OrderVO> handleGetAll()
        throw new UnsupportedOperationException("bw.co.roguesystems.life.order.OrderService.handleGetAll() Not implemented!");
    }

    /**
     * @see bw.co.roguesystems.life.order.OrderService#getAll(Integer, Integer)
     */
    @Override
    protected Page handleGetAll(Integer pageNumber, Integer pageSize)
        throws Exception
    {
        // TODO implement protected  Page handleGetAll(Integer pageNumber, Integer pageSize)
        throw new UnsupportedOperationException("bw.co.roguesystems.life.order.OrderService.handleGetAll(Integer pageNumber, Integer pageSize) Not implemented!");
    }

    /**
     * @see bw.co.roguesystems.life.order.OrderService#remove(Long)
     */
    @Override
    protected boolean handleRemove(Long id)
        throws Exception
    {
        // TODO implement protected  boolean handleRemove(Long id)
        throw new UnsupportedOperationException("bw.co.roguesystems.life.order.OrderService.handleRemove(Long id) Not implemented!");
    }

    /**
     * @see bw.co.roguesystems.life.order.OrderService#save(OrderVO)
     */
    @Override
    protected OrderVO handleSave(OrderVO order)
        throws Exception
    {
        // TODO implement protected  OrderVO handleSave(OrderVO order)
        throw new UnsupportedOperationException("bw.co.roguesystems.life.order.OrderService.handleSave(OrderVO order) Not implemented!");
    }

    /**
     * @see bw.co.roguesystems.life.order.OrderService#search(String)
     */
    @Override
    protected Collection<OrderVO> handleSearch(String criteria)
        throws Exception
    {
        // TODO implement protected  Collection<OrderVO> handleSearch(String criteria)
        throw new UnsupportedOperationException("bw.co.roguesystems.life.order.OrderService.handleSearch(String criteria) Not implemented!");
    }

    /**
     * @see bw.co.roguesystems.life.order.OrderService#search(Integer, Integer, String)
     */
    @Override
    protected Page handleSearch(Integer pageNumber, Integer pageSize, String criteria)
        throws Exception
    {
        // TODO implement protected  Page handleSearch(Integer pageNumber, Integer pageSize, String criteria)
        throw new UnsupportedOperationException("bw.co.roguesystems.life.order.OrderService.handleSearch(Integer pageNumber, Integer pageSize, String criteria) Not implemented!");
    }

}
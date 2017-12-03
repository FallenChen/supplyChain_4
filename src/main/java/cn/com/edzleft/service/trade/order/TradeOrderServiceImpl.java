package cn.com.edzleft.service.trade.order;

import cn.com.edzleft.dao.trade.order.OrderMapper;
import cn.com.edzleft.entity.Order;
import cn.com.edzleft.util.page.PageUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;

/**
 * Created by ibmtech on 2017/11/28.
 */
@Service
@Transactional
public class TradeOrderServiceImpl  implements TradeOrderService{

    @Autowired
    private OrderMapper orderMapper;

    @Override
    public PageUtil<Order> queryAllOrder(PageUtil<Order> pageUtil) {
       //查询所有的总条数
        Integer orderCount = orderMapper.selectTotalOrderCount(pageUtil);
        //条件查询+分页显示
        List<Order> orders = orderMapper.selectOrderByPage(pageUtil);
        pageUtil.setTotalCount(orderCount);
        pageUtil.setList(orders);
        return pageUtil;
    }

    /**
     * 根据id查询订单详细信息
     * @param id
     * @return
     */
    @Override
    public Order queryOrderById(Integer id) {
        Order order = orderMapper.selectOrderById(id);
        return order;
    }

    /**
     * 设置订单状态
     * @param id
     */
    @Override
    public Order setOrderStatus(Integer id,Integer flag) {
        //根据id查询当前的订单
        Order order = orderMapper.selectOrderById(id);
        //Integer orderStatus = order.getOrderStatus();
        if(flag==1) {   //待确认--领取订单
           //领取订单（0---1）
           order.setOrderId(id);
           order.setOrderStatus(1);
           order.setOrderConfirmationTime(new Date());
           order.setOrderCreatorTrade("贸易方名称");
       } else if (flag == 2) { //待确认--驳回
           //驳回（0--6）
            order.setOrderId(id);
            order.setOrderStatus(6);
           //order.setOrderState("信息不完整");
        }else if(flag==4){  //待付款 2 --3配置发货
            order.setOrderId(id);
            order.setOrderStatus(3);
        }
        orderMapper.updateStatus(order);
        System.out.println("状态修改完毕");
        return order;
    }
    /**
     * 添加货运订单
     * @param order
     */
        public void updateOrder(Order order){
            orderMapper.updateStatus(order);
        }



}

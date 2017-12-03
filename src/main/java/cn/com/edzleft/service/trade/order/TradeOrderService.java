package cn.com.edzleft.service.trade.order;

import cn.com.edzleft.entity.Order;
import cn.com.edzleft.util.page.PageUtil;

import java.util.List;

/**
 * Created by ibmtech on 2017/11/28.
 */
public interface TradeOrderService {

    /**
     * 分页查询，展示所有
     */
    public PageUtil<Order> queryAllOrder(PageUtil<Order> pageUtil);


    /**
     * 根据合同id查询订单详情
     */
    public Order queryOrderById(Integer id);

    /**
     * 设置订单状态
     * @param id
     * @param flag
     */
    public Order setOrderStatus(Integer id,Integer flag);


    /**
     * 添加配置发货信息
     */
    public void updateOrder(Order order);





}

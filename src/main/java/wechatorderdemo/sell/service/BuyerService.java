package wechatorderdemo.sell.service;

import wechatorderdemo.sell.dto.OrderDTO;

/**
 * @author yinywf
 * Created on 2017/10/17
 */
public interface BuyerService {

    //查询一个订单
    OrderDTO findOrderOne(String openid, String orderId);

    //取消订单
    OrderDTO cancelOrder(String openid,String orderId);

}

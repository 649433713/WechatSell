package wechatorderdemo.sell.service.impl;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import wechatorderdemo.sell.dto.OrderDTO;
import wechatorderdemo.sell.service.OrderService;
import wechatorderdemo.sell.service.PayWithoutMoneyService;

/**
 * @author yinywf
 * Created on 2017/10/20
 */
@Service
@Slf4j
public class PayWithoutMoneyServiceImpl implements PayWithoutMoneyService {


    @Autowired
    private OrderService orderService;

    @Override
    public String create(OrderDTO orderDTO) {
        orderService.paid(orderDTO);
        return null;
    }

    @Override
    public String notify(String notifyData) {
        return null;
    }

    @Override
    public String refund(OrderDTO orderDTO) {
        return null;
    }
}

package wechatorderdemo.sell.service;

import com.lly835.bestpay.model.PayResponse;
import com.lly835.bestpay.model.RefundResponse;
import wechatorderdemo.sell.dto.OrderDTO;

/**
 * @author yinywf
 * Created on 2017/10/20
 */
public interface PayWithoutMoneyService {

    String create(OrderDTO orderDTO);

    String notify(String notifyData);

    String refund(OrderDTO orderDTO);
}

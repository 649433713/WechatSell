package wechatorderdemo.sell.service;

import com.lly835.bestpay.model.PayResponse;
import com.lly835.bestpay.model.RefundResponse;
import wechatorderdemo.sell.dto.OrderDTO;

/**
 * @author yinywf
 * Created on 2017/10/19
 */
public interface PayService {

    PayResponse create(OrderDTO orderDTO);

    PayResponse notify(String notifyData);

    public RefundResponse refund(OrderDTO orderDTO);
}

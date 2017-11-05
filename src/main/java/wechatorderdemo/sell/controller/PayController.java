package wechatorderdemo.sell.controller;

import com.lly835.bestpay.model.PayResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import wechatorderdemo.sell.dto.OrderDTO;
import wechatorderdemo.sell.enums.ResultEnum;
import wechatorderdemo.sell.exceptions.SellException;
import wechatorderdemo.sell.service.OrderService;
import wechatorderdemo.sell.service.PayService;
import wechatorderdemo.sell.service.PayWithoutMoneyService;

import java.util.HashMap;
import java.util.Map;

/**
 * @author yinywf
 * Created on 2017/10/19
 */
@Controller
@RequestMapping("/pay")
public class PayController {

    @Autowired
    private PayService payService;
    @Autowired
    private OrderService orderService;
    @Autowired
    private PayWithoutMoneyService payWithoutMoneyService;
    @GetMapping("/create")
    public ModelAndView create(@RequestParam("orderId") String orderId,
                       @RequestParam("returnUrl") String returnUrl) {
        //1.查询订单
        OrderDTO orderDTO = orderService.findOne(orderId);
        if (orderDTO == null) {
            throw new SellException(ResultEnum.ORDER_NOT_EXIST);
        }

        //2.发起支付
        PayResponse payResponse = payService.create(orderDTO);



        Map<String, Object> map = new HashMap<>();
        map.put("payResponse", payResponse);
        map.put("returnUrl",returnUrl);
        return new ModelAndView("pay/create",map);

    }

    @PostMapping("/notify")
    public ModelAndView notify(@RequestBody String notifyData) {
        payService.notify(notifyData);

        //返回给微信处理结果
        return new ModelAndView("pay/success");
    }

    @GetMapping("/createwithoutmoney")
    public ModelAndView createWithoutMoney(@RequestParam("orderId") String orderId,
                               @RequestParam("returnUrl") String returnUrl) {
        //1.查询订单
        OrderDTO orderDTO = orderService.findOne(orderId);
        if (orderDTO == null) {
            throw new SellException(ResultEnum.ORDER_NOT_EXIST);
        }

        payWithoutMoneyService.create(orderDTO);
        return new ModelAndView("redirect:"+returnUrl);

    }

}

package wechatorderdemo.sell.converter;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import lombok.extern.slf4j.Slf4j;
import wechatorderdemo.sell.dataobject.OrderDetail;
import wechatorderdemo.sell.dto.OrderDTO;
import wechatorderdemo.sell.enums.ResultEnum;
import wechatorderdemo.sell.exceptions.SellException;
import wechatorderdemo.sell.form.OrderForm;

import java.util.ArrayList;
import java.util.List;

/**
 * @author yinywf
 * Created on 2017/10/16
 */
@Slf4j
public class OrderForm2OrderDTOConverter {

    public static OrderDTO convert(OrderForm orderForm){
        Gson gson = new Gson();

        OrderDTO orderDTO = new OrderDTO();

        orderDTO.setBuyerName(orderForm.getName());
        orderDTO.setBuyerAddress(orderForm.getAddress());
        orderDTO.setBuyerPhone(orderForm.getPhone());
        orderDTO.setBuyerOpenid(orderForm.getOpenid());

        List<OrderDetail> orderDetailList;
        try {
            orderDetailList = gson.fromJson(orderForm.getItems(),new TypeToken<List<OrderDetail>>(){}.getType());

        }catch (Exception e){
            log.error("【对象转换】错误，string={}",orderForm.getItems());
            throw new SellException(ResultEnum.PARAM_ERROR);
        }

        orderDTO.setOrderDetailList(orderDetailList);

        return orderDTO;

    }
}

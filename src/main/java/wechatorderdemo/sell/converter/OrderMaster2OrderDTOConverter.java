package wechatorderdemo.sell.converter;

import org.springframework.beans.BeanUtils;
import wechatorderdemo.sell.dataobject.OrderMaster;
import wechatorderdemo.sell.dto.OrderDTO;

import java.util.List;
import java.util.stream.Collectors;

/**
 * @author yinywf
 * Created on 2017/10/15
 */
public class OrderMaster2OrderDTOConverter {

    public static OrderDTO convert(OrderMaster orderMaster) {

        OrderDTO orderDTO = new OrderDTO();
        BeanUtils.copyProperties(orderMaster, orderDTO);
        return orderDTO;
    }

    public static List<OrderDTO> convert(List<OrderMaster> orderMasterList) {

        return orderMasterList.stream().map(e -> convert(e)).collect(Collectors.toList());
    }

}

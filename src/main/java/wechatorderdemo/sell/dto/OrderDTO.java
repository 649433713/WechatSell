package wechatorderdemo.sell.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import lombok.Data;
import wechatorderdemo.sell.dataobject.OrderDetail;
import wechatorderdemo.sell.enums.OrderStatusEnum;
import wechatorderdemo.sell.enums.PayStatusEnum;
import wechatorderdemo.sell.utils.EnumUtil;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

/**
 * @author yinywf
 * Created on 2017/10/15
 */
@Data
//@JsonInclude(JsonInclude.Include.NON_NULL)
public class OrderDTO{

    private String orderId;
    private String buyerName;
    private String buyerPhone;
    private String buyerAddress;
    private String buyerOpenid;
    private BigDecimal orderAmount;
    private Integer orderStatus;
    private Integer payStatus ;
    private LocalDateTime createTime;
    private LocalDateTime updateTime;

    List<OrderDetail> orderDetailList;

    @JsonIgnore
    public OrderStatusEnum getOrderStatusEnum(){
        return EnumUtil.getByCode(orderStatus, OrderStatusEnum.class);
    }

    @JsonIgnore
    public PayStatusEnum getPayStatusEnum() {
        return EnumUtil.getByCode(payStatus, PayStatusEnum.class);
    }
}

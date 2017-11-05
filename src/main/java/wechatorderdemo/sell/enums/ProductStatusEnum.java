package wechatorderdemo.sell.enums;

import lombok.Getter;

/**
 * 商品状态
 * Created by yinywf on 2017/10/13
 */
@Getter
public enum ProductStatusEnum implements CodeEnum{

    UP(0,"在架"),
    Down(1,"下架")
    ;


    private Integer code;

    private String message;

    ProductStatusEnum(Integer code,String message){
        this.code=code;
        this.message=message;
    }
}

package wechatorderdemo.sell.exceptions;

import lombok.Getter;
import wechatorderdemo.sell.enums.ResultEnum;

/**
 * @author yinywf
 * Created on 2017/10/15
 */
@Getter
public class SellException extends RuntimeException{

    private Integer code;

    public SellException(ResultEnum resultEnum){
        super(resultEnum.getMessage());

        this.code = resultEnum.getCode();
    }

    public SellException(Integer code, String defaultMessage) {
        super(defaultMessage);
        this.code = code;
    }
}

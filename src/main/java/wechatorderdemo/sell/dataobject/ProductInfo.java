package wechatorderdemo.sell.dataobject;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;
import wechatorderdemo.sell.enums.ProductStatusEnum;
import wechatorderdemo.sell.utils.EnumUtil;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

/**
 * @author yinywf
 * Created on 2017/10/11
 */
@Entity
@Table(name = "product_info", schema = "sell")
@DynamicUpdate
@DynamicInsert
@Data
public class ProductInfo implements Serializable {
    private static final long serialVersionUID = -2675449228143028895L;
    @Id
    private String productId;
    private String productName;
    private BigDecimal productPrice;
    private int productStock;
    private String productDescription;
    private String productIcon;
    private int category;
    private LocalDateTime createTime;
    private LocalDateTime updateTime;
    private int productStatus;

    @JsonIgnore
    public ProductStatusEnum getProductStatusEnum(){
        return EnumUtil.getByCode(productStatus, ProductStatusEnum.class);
    }



}

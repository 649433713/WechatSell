package wechatorderdemo.sell.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import wechatorderdemo.sell.dataobject.ProductInfo;
import wechatorderdemo.sell.dto.CartDTO;

import java.util.List;

/**
 * @author yinywf
 * Created on 2017/10/13
 */
public interface ProductService {

    ProductInfo findOne(String productId);

    /**
     * function:查询所有上架商品列表
     * parameters:
     * throw:
     * Created by yinywf
     */
    List<ProductInfo> findUpAll();

    Page<ProductInfo> findAll(Pageable pageable);

    ProductInfo save(ProductInfo productInfo);

    //库存操作
    void increaseStock(List<CartDTO> cartDTOList);

    void decreaseStock(List<CartDTO> cartDTOList);

    ProductInfo onSale(String productId);

    ProductInfo offSale(String productId);

}

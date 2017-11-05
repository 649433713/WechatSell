package wechatorderdemo.sell.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import wechatorderdemo.sell.dataobject.ProductInfo;

import java.util.List;

/**
 * @author yinywf
 * Created on 2017/10/12
 */
public interface ProductInfoRepository extends JpaRepository<ProductInfo,String> {

    List<ProductInfo> findByProductStatus(int productStatus);
}

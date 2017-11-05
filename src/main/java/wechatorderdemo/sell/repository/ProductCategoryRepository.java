package wechatorderdemo.sell.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import wechatorderdemo.sell.dataobject.ProductCategory;

import java.util.List;

/**
 * @author yinywf
 * Created on 2017/10/11
 */
public interface ProductCategoryRepository extends JpaRepository<ProductCategory,Integer> {

    List<ProductCategory> findByCategoryTypeIn(List<Integer> categoryTypeList);
}

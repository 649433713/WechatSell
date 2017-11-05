package wechatorderdemo.sell.service;

import wechatorderdemo.sell.dataobject.ProductCategory;

import java.util.List;

/**
 * @author yinywf
 * Created on 2017/10/11
 */
public interface CategoryService {

    ProductCategory findOne(Integer categoryId);

    List<ProductCategory> findAll();

    List<ProductCategory> findByCategoryTypeIn(List<Integer> categoryTypeList);

    ProductCategory save(ProductCategory productCategory);
}

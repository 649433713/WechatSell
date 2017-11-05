package wechatorderdemo.sell.repository;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import wechatorderdemo.sell.SellApplicationTests;
import wechatorderdemo.sell.dataobject.ProductCategory;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

/**
 * @author yinywf
 * Created on 2017/10/11
 */
public class ProductCategoryRepositoryTest extends SellApplicationTests {

    @Autowired
    private ProductCategoryRepository productCategoryRepository;

    @Test
    public void findOneTest(){
        System.out.println(productCategoryRepository.findOne(1));
    }

    @Test
    @Transactional
    public void saveTest(){
        ProductCategory productCategory = new ProductCategory("女生最爱",3);
        System.out.println(productCategoryRepository.save(productCategory));
    }

    @Test
    public void findByCategoryTypeIn(){
        List<Integer> list = Arrays.asList(2,3,4);

        System.out.println(productCategoryRepository.findByCategoryTypeIn(list));
    }
}
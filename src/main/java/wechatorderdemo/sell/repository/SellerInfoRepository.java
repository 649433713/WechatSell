package wechatorderdemo.sell.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import wechatorderdemo.sell.dataobject.SellerInfo;

/**
 * @author yinywf
 * Created on 2017/10/26
 */
public interface SellerInfoRepository extends JpaRepository<SellerInfo, String> {

    SellerInfo findOneByOpenid(String openid);


}

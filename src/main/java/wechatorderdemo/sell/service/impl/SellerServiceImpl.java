package wechatorderdemo.sell.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import wechatorderdemo.sell.dataobject.SellerInfo;
import wechatorderdemo.sell.repository.SellerInfoRepository;
import wechatorderdemo.sell.service.SellerService;

/**
 * @author yinywf
 * Created on 2017/10/26
 */
@Service
public class SellerServiceImpl implements SellerService {

    @Autowired
    SellerInfoRepository repository;

    @Override
    public SellerInfo findSellerInfoByOpenid(String openid) {
        return  repository.findOneByOpenid(openid);
    }
}

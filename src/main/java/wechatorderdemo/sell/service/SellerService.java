package wechatorderdemo.sell.service;

import wechatorderdemo.sell.dataobject.SellerInfo;

/**
 * @author yinywf
 * Created on 2017/10/26
 */
public interface SellerService {

    SellerInfo findSellerInfoByOpenid(String openid);
}

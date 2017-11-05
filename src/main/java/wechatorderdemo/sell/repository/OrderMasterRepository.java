package wechatorderdemo.sell.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import wechatorderdemo.sell.dataobject.OrderMaster;

/**
 * @author yinywf
 * Created on 2017/10/15
 */
public interface OrderMasterRepository extends JpaRepository<OrderMaster, String> {

    Page<OrderMaster> findByBuyerOpenid(String buyerOpenid, Pageable pageable);


}

package wechatorderdemo.sell.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import wechatorderdemo.sell.dataobject.OrderDetail;

import java.util.List;

/**
 * @author yinywf
 * Created on 2017/10/15
 */
public interface OrderDetailRepository extends JpaRepository<OrderDetail, String> {

    List<OrderDetail> findByOrderId(String orderId);
}

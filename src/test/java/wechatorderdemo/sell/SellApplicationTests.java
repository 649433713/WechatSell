package wechatorderdemo.sell;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import wechatorderdemo.sell.dataobject.OrderDetail;
import wechatorderdemo.sell.dto.OrderDTO;
import wechatorderdemo.sell.service.OrderService;

import java.util.ArrayList;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SellApplicationTests {

	@Autowired
	OrderService orderService;

	@Test
	public void contextLoads() {
		List<OrderDetail> orderDetailList = new ArrayList<>();
		OrderDTO orderDTO = new OrderDTO();
		orderDTO.setBuyerOpenid("1234567dsgg");

		orderService.create(orderDTO);
	}

}

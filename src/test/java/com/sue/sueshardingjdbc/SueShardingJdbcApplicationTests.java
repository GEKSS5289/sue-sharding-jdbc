package com.sue.sueshardingjdbc;


import com.sue.mapper.AreaMapper;
import com.sue.mapper.OrderItemMapper;
import com.sue.mapper.OrderMapper;
import com.sue.pojo.Order;
import com.sue.pojo.OrderItem;
import org.aspectj.weaver.ast.Or;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.math.BigDecimal;

@SpringBootTest
@RunWith(SpringRunner.class)
public class SueShardingJdbcApplicationTests {

    @Resource
    private OrderMapper orderMapper;

    @Resource
    private OrderItemMapper orderItemMapper;

    @Resource
    private AreaMapper areaMapper;

    @Test
    public void contextLoads() {
    }

    @Test
    public void testOrder(){
        Order order = new Order();
        order.setUserId(19);
        order.setOrderId(1);
        order.setOrderAmount(BigDecimal.TEN);
        order.setOrderStatus(1);
        orderMapper.insert(order);
    }


}

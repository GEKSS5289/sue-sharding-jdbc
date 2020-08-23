package com.sue.sueshardingjdbc;


import com.sue.mapper.OrderMapper;
import com.sue.pojo.Order;
import org.aspectj.weaver.ast.Or;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;

@SpringBootTest
@RunWith(SpringRunner.class)
public class SueShardingJdbcApplicationTests {

    @Autowired
    private OrderMapper orderMapper;


    @Test
    public void contextLoads() {
    }

    @Test
    public void testOrder(){
        Order order = new Order();
        order.setUserId(19);
        order.setId(1);
        order.setOrderAmount(BigDecimal.TEN);
        order.setOrderStatus(1);
        orderMapper.insert(order);
    }
}

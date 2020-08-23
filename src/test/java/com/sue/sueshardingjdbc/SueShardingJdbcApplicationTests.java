package com.sue.sueshardingjdbc;


import com.sue.mapper.AreaMapper;
import com.sue.mapper.OrderMapper;
import com.sue.pojo.Area;
import com.sue.pojo.Order;
import org.aspectj.weaver.ast.Or;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestExecutionListeners;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;

@SpringBootTest
@RunWith(SpringRunner.class)
public class SueShardingJdbcApplicationTests {

    @Autowired
    private OrderMapper orderMapper;

    @Autowired
    private AreaMapper areaMapp;

    @Test
    public void contextLoads() {
    }

    @Test
    public void testOrder(){
        Order order = new Order();
        order.setUserId(20);
        order.setId(1);
        order.setOrderAmount(BigDecimal.TEN);
        order.setOrderStatus(4);
        orderMapper.insert(order);
    }

    @Test
    public void testGlobal(){
        Area area = new Area();
        area.setId(1);
        area.setName("北京");
        areaMapp.insert(area);
    }
}

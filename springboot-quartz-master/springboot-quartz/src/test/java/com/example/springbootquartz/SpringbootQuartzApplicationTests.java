package com.example.springbootquartz;

import com.example.springbootquartz.dao.OrderMapper;
import com.example.springbootquartz.model.Order;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;
import java.util.Date;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringbootQuartzApplicationTests {
    @Autowired
    private OrderMapper orderMapper;

    @Test
    public void contextLoads() {
    }

    @Test
    public void insertOrder(){
        Order order = new Order();
        order.setAmount(BigDecimal.TEN);
        order.setStatus(1);
        order.setReceiveName("xxxx");
        order.setReceiveAddress("XXXXX");
        order.setReceiveMobile("13811112222");
        order.setCreateTime(new Date());
        order.setCreateUser("test");
        order.setUpdateTime(new Date());
        order.setUpdateUser("test");
        orderMapper.insertSelective(order);
    }

}

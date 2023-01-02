package com.example.demostruct.mapperTest;

import com.example.demostruct.practice5.entity.Orders;
import com.example.demostruct.practice5.entity.mapper.OrderMapper;
import com.example.demostruct.practice5.entity.model.OrderDTO;
import org.junit.jupiter.api.Test;
import org.mapstruct.factory.Mappers;

import java.util.ArrayList;
import java.util.List;

public class OrderTest {

    OrderMapper orderMapper = Mappers.getMapper(OrderMapper.class);
    @Test
    public void testOrder(){

        List<Orders> ordersList = new ArrayList<>();
        Orders orders = new Orders();
        orders.setId(100);
        orders.setOrName("Books");
        orders.setNoOrders("10");
        Orders orders1 = new Orders();
        orders1.setId(200);
        orders1.setOrName("Pens");
        orders1.setNoOrders("150");
        ordersList.add(orders);
        ordersList.add(orders1);

      List<OrderDTO> orderDTOS =   orderMapper.ORDER_DTO(ordersList);

        for (OrderDTO orderDTO : orderDTOS) {
            System.out.println(orderDTO.getOrderId());
            System.out.println(orderDTO.getOrderName());
            System.out.println(orderDTO.getNumberOfOrders());
        }
    }
}

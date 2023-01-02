package com.example.demostruct.practice5.entity.mapper;

import com.example.demostruct.practice5.entity.Orders;
import com.example.demostruct.practice5.entity.model.OrderDTO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper
public interface OrderMapper {


   List<OrderDTO> ORDER_DTO(List<Orders> orders);

    @Mapping(source = "id", target = "orderId")
    @Mapping(source = "orName", target = "orderName")
    //@Mapping(source = "noOrders", target = "numberOfOrders")
    OrderDTO entityToDTO(Orders orders);

    List<OrderDTO> ORDER_DTOS(List<Orders> list);
}

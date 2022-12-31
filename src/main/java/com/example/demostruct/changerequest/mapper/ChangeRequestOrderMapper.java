package com.example.demostruct.changerequest.mapper;

import com.example.demostruct.changerequest.dto.ChangeRequestOrderDTO;
import com.example.demostruct.changerequest.entity.ChangeRequestOrder;
import com.example.demostruct.changerequest.entity.CurrencyCode;
import com.example.demostruct.changerequest.entity.SalesOrder;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper
public interface ChangeRequestOrderMapper {

    @Mapping(source = "order.id", target ="id" )
    ChangeRequestOrderDTO CHANGE_REQUEST_ORDER_DTO(ChangeRequestOrder order, CurrencyCode currencyCode, List<SalesOrder> salesOrder);
}

package com.example.demostruct.changerequest.mapper;

import com.example.demostruct.changerequest.dto.AddressDTO;
import com.example.demostruct.changerequest.entity.Address;
import com.example.demostruct.changerequest.entity.Country;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper
public interface AddressListMapper {

   @Mapping(source = "countries", target = "countryDTOS")
    List<AddressDTO> ADDRESS_DTOS(List<Address> address);
}

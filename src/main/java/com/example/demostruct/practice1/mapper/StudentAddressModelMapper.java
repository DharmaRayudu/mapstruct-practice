package com.example.demostruct.practice1.mapper;

import com.example.demostruct.practice1.entity.AddressEntity;
import com.example.demostruct.practice1.entity.StudentEntity;
import com.example.demostruct.practice1.model.StudentAddressModel;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

@Mapper
public interface StudentAddressModelMapper {


    @Mapping(source = "studentEntity.sname", target = "name")
    @Mapping(source = "addressEntity.houseNo", target ="houseNumber")
    StudentAddressModel toaddressModel(StudentEntity studentEntity, AddressEntity addressEntity);
}

package com.example.demostruct.changerequest.mapper;

import com.example.demostruct.changerequest.dto.EmployeeViewDetailsDTO;
import com.example.demostruct.changerequest.entity.Address;
import com.example.demostruct.changerequest.entity.Country;
import com.example.demostruct.changerequest.entity.Employee;
import com.example.demostruct.employee.dto.EmployeeDetailsDTO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.factory.Mappers;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@Mapper
public interface EmployeeDetailsMapper {


    AddressListMapper ADDRESS_LIST_MAPPER=  Mappers.getMapper(AddressListMapper.class);
    @Mapping(source = "employee.id", target = "id")
    @Mapping(source = "address", target = "addressDTOS")
    EmployeeViewDetailsDTO EMPLOYEE_VIEW_DETAILS_DTO(Employee employee, List<Address> address, Country country);

    @Mapping(source = "employee.id", target = "id")
   // @Mapping(source = "countryName", target = "")
    EmployeeViewDetailsDTO employeeViewDetailsWithExistingMapper(Employee employee, AddressListMapper addressListMapper);
}

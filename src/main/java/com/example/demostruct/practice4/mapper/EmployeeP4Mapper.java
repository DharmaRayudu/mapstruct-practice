package com.example.demostruct.practice4.mapper;

import com.example.demostruct.practice4.dto.DepartmentP4DTO;
import com.example.demostruct.practice4.dto.EmployeeP4DTO;
import com.example.demostruct.practice4.entity.EmployeeP4;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(uses = {DepartmentP4DTOMapper.class})
public interface EmployeeP4Mapper {

    //@Mapping(source = "departmentP4.name", target = "departmentName")
   // @Mapping(source = "employeeP4.id", target = "id")
    //@Mapping(source = "employeeP4.name", target = "name")
    //EmployeeP4DTO EMPLOYEE_P_4_DTO(EmployeeP4 employeeP4, DepartmentP4DTO departmentName);

    @Mapping(source = "departmentP4", target = "departmentName")
    EmployeeP4DTO empDTO(EmployeeP4 employeeP4);
}

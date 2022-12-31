package com.example.demostruct.employee.mapper;

import com.example.demostruct.employee.dto.DepartmentDTO;
import com.example.demostruct.employee.dto.EmployeeDTO;
import com.example.demostruct.employee.dto.EmployeeDetailsDTO;
import com.example.demostruct.employee.entity.DepartmentEntity;
import com.example.demostruct.employee.entity.EmployeeEntity;
import org.mapstruct.Mapper;

@Mapper
public interface EmployeeMapper {

    EmployeeDTO toemployeeDTO(EmployeeEntity emp);

    DepartmentDTO toDepartmentDTO(DepartmentEntity entity);

    EmployeeDetailsDTO employeeDetailsDto(EmployeeEntity emp, DepartmentEntity department);
}

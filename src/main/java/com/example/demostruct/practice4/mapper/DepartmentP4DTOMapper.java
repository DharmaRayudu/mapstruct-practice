package com.example.demostruct.practice4.mapper;

import com.example.demostruct.practice4.dto.DepartmentP4DTO;
import com.example.demostruct.practice4.entity.DepartmentP4;
import org.mapstruct.Mapper;

@Mapper
public interface DepartmentP4DTOMapper {

    DepartmentP4DTO DEPARTMENT_P_4_DTO(DepartmentP4 departmentP4);
}

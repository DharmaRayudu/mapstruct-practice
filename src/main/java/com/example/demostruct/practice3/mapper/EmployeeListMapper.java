package com.example.demostruct.practice3.mapper;

import com.example.demostruct.practice3.entity.EmployeeEntityTest;
import com.example.demostruct.practice3.model.EmployeeEntityTestModel;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper
public interface EmployeeListMapper {

    List<EmployeeEntityTestModel> EMPLOYEE_ENTITY_TEST_MODELS(List<EmployeeEntityTest> entityTests);
}

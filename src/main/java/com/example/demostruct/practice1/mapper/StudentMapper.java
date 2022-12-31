package com.example.demostruct.practice1.mapper;

import com.example.demostruct.practice1.entity.StudentEntity;
import com.example.demostruct.practice1.model.StudentModel;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;


@Mapper
public interface StudentMapper {

    StudentMapper intandce=  Mappers.getMapper(StudentMapper.class);
    @Mapping(source = "sname", target = "studentName")
    StudentModel toStudemtModel(StudentEntity studentEntity);
}

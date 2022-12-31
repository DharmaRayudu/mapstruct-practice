package com.example.demostruct.practice1.mapper;

import com.example.demostruct.practice1.entity.StudentEntity;
import com.example.demostruct.practice1.model.StudentModel;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper
public interface StudentMapperManual {

    default StudentModel STUDENT_MODEL(StudentEntity studentEntity){
        StudentModel studentModel = new StudentModel();
        studentModel.setId(studentEntity.getId());
        studentModel.setStudentName(studentEntity.getSname());
        return studentModel;
    };

    @Mapping(source = "studentName", target = "sname")
    StudentEntity STUDENT_ENTITY(StudentModel model);
}

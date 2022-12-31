package com.example.demostruct.practice2.entity.mapper;

import com.example.demostruct.practice2.entity.Student;
import com.example.demostruct.practice2.entity.model.StudentModel;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper
public interface StudentNestedMapper {

    @Mapping(source = "stubject.subjectName", target = "subject")
    StudentModel STUDENT_MODEL(Student student);

    @InheritInverseConfiguration
    Student STUDENT(StudentModel studentModel);
}

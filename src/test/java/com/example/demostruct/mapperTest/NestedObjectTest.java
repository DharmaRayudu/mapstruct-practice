package com.example.demostruct.mapperTest;

import com.example.demostruct.practice2.entity.Student;
import com.example.demostruct.practice2.entity.Subject;
import com.example.demostruct.practice2.entity.mapper.StudentNestedMapper;
import com.example.demostruct.practice2.entity.model.StudentModel;
import org.junit.jupiter.api.Test;
import org.mapstruct.factory.Mappers;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NestedObjectTest {

    StudentNestedMapper studentNestedMapper = Mappers.getMapper(StudentNestedMapper.class);

    @Test
    public void testNestedObject(){
        Student student = new Student();
        student.setId(1);
        student.setName("Dharma");
        Subject subject = new Subject();
        subject.setSubjectName("Coding");
        subject.setId(100);
        student.setStubject(subject);

       StudentModel studentModel =  studentNestedMapper.STUDENT_MODEL(student);
        System.out.println(student.getId());
       assertEquals(studentModel.getId(), student.getId());
       assertEquals(studentModel.getName(), student.getName());
       assertEquals(studentModel.getSubject(), student.getStubject().getSubjectName());
    }
}

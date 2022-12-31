package com.example.demostruct.mapperTest;

import com.example.demostruct.practice1.entity.AddressEntity;
import com.example.demostruct.practice1.entity.StudentEntity;
import com.example.demostruct.practice1.mapper.StudentAddressModelMapper;
import com.example.demostruct.practice1.mapper.StudentMapper;
import com.example.demostruct.practice1.mapper.StudentMapperManual;
import com.example.demostruct.practice1.model.StudentAddressModel;
import com.example.demostruct.practice1.model.StudentModel;
import org.junit.jupiter.api.Test;
import org.mapstruct.factory.Mappers;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StudentMapperTest {

    StudentMapper studentMapper= Mappers.getMapper(StudentMapper.class);
    StudentMapperManual studentMapperManual = Mappers.getMapper(StudentMapperManual.class);

    StudentAddressModelMapper studentAddressModelMapper = Mappers.getMapper(StudentAddressModelMapper .class);

    @Test
    public void toEntityToModel(){

        StudentEntity studentEntity = new StudentEntity();
        studentEntity.setId("1");
        studentEntity.setSname("Dharma");

    StudentModel  modle = studentMapper.toStudemtModel(studentEntity);
        assertEquals(modle.getId(), studentEntity.getId());
        assertEquals(modle.getStudentName(), studentEntity.getSname());
    }
    @Test
    public void toStudntModel(){
        StudentEntity studentEntity = new StudentEntity();
        studentEntity.setId("1");
        studentEntity.setSname("Dharma");

       StudentModel studentModel =  studentMapperManual.STUDENT_MODEL(studentEntity);

       assertEquals(studentModel.getStudentName(), studentEntity.getSname());
       assertEquals(studentModel.getId(), studentEntity.getId());

    }

    @Test
    public void testStudentAddress(){
        StudentEntity studentEntity = new StudentEntity();
        studentEntity.setSname("Dharma");
        studentEntity.setId("1");

        AddressEntity addressEntity = new AddressEntity();
        addressEntity.setCity("Hyd");
        addressEntity.setState("Telangana");
        addressEntity.setHouseNo(440);

       StudentAddressModel studentAddressModel=  studentAddressModelMapper.toaddressModel(studentEntity, addressEntity);

       assertEquals(studentAddressModel.getCity(), addressEntity.getCity());
       assertEquals(studentAddressModel.getName(), studentEntity.getSname());
    }
}

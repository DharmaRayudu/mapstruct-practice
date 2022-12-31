package com.example.demostruct.practice3.mapper;

import com.example.demostruct.practice3.entity.CarEntity;
import com.example.demostruct.practice3.model.Car;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper
public interface CarMapper {

    List<Car> CARSModel(List<CarEntity> entities);
}

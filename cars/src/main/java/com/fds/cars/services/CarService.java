package com.fds.cars.services;

import com.fds.cars.repositories.ICar;
import com.fds.cars.models.CarModel;

import org.springframework.stereotype.Service;

import antlr.collections.List;

@Service
public class CarService {
    private ICar carRepo;

    public CarService (ICar carRepo){
        this.carRepo = carRepo;
    }

    // public List<CarModel> findAllCars(){
    //     return carRepo.findAll();
    // }

    public CarModel addCar(CarModel newCar){
        return this.carRepo.save(newCar);

    }
}
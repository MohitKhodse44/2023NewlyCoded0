package com.jspiders.CarDekhoProject.operations;

import java.util.ArrayList;
import java.util.List;

public class CarOperations {
    private List<Car> carList;

    public CarOperations() {
        carList = new ArrayList<>();
    }

   
    public void addCar(Car car) {
        carList.add(car);
    }

    
    public void updateCar(int carId, Car updatedCar) {
        for (int i = 0; i < carList.size(); i++) {
            Car car = carList.get(i);
            if (car.getId() == carId) {
                carList.set(i, updatedCar);
                return; 
            }
        }
    }

    
    public void removeCar(int carId) {
        carList.removeIf(car -> car.getId() == carId);
    }

   
    public Car retrieveCar(int carId) {
        for (Car car : carList) {
            if (car.getId() == carId) {
                return car; 
            }
        }
        return null; 
    }

    
    public List<Car> getAllCars() {
        return new ArrayList<>(carList);
    }
}


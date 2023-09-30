package com.jspiders.CarDekhoProject.operations;

import java.util.ArrayList;
import java.util.List;

public class CarOperations {
    private List<Car> carList;

    public CarOperations() {
        carList = new ArrayList<>();
    }

    // Add a new car to the list
    public void addCar(Car car) {
        carList.add(car);
    }

    // Update an existing car's details
    public void updateCar(int carId, Car updatedCar) {
        for (int i = 0; i < carList.size(); i++) {
            Car car = carList.get(i);
            if (car.getId() == carId) {
                carList.set(i, updatedCar);
                return; // Exit the loop after updating
            }
        }
    }

    // Remove a car from the list by ID
    public void removeCar(int carId) {
        carList.removeIf(car -> car.getId() == carId);
    }

    // Retrieve a car by ID
    public Car retrieveCar(int carId) {
        for (Car car : carList) {
            if (car.getId() == carId) {
                return car; // Return the car if found
            }
        }
        return null; // Return null if not found
    }

    // Get a list of all cars
    public List<Car> getAllCars() {
        return new ArrayList<>(carList);
    }
}


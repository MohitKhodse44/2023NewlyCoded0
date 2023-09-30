package com.jspiders.CarDekhoProject.operations;
import java.util.Scanner;
import java.util.List;

public class CarMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CarOperations carOperations = new CarOperations();

        while (true) {
            System.out.println("\nCar Management Menu:");
            System.out.println("1. Add a Car");
            System.out.println("2. Update a Car");
            System.out.println("3. Remove a Car");
            System.out.println("4. Retrieve a Car");
            System.out.println("5. List All Cars");
            System.out.println("6. Exit");

            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter Car ID: ");
                    int id = scanner.nextInt();
                    scanner.nextLine(); // Consume newline
                    System.out.print("Enter Car Name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter Car Brand: ");
                    String brand = scanner.nextLine();
                    System.out.print("Enter Car Price: ");
                    double price = scanner.nextDouble();
                    carOperations.addCar(new Car(id, name, brand, price));
                    System.out.println("Car added successfully.");
                    break;
                case 2:
                    System.out.print("Enter Car ID to Update: ");
                    int updateId = scanner.nextInt();
                    scanner.nextLine(); // Consume newline
                    Car updatedCar = carOperations.retrieveCar(updateId);
                    if (updatedCar != null) {
                        System.out.print("Enter New Car Name: ");
                        updatedCar.setName(scanner.nextLine());
                        System.out.print("Enter New Car Brand: ");
                        updatedCar.setBrand(scanner.nextLine());
                        System.out.print("Enter New Car Price: ");
                        updatedCar.setPrice(scanner.nextDouble());
                        carOperations.updateCar(updateId, updatedCar);
                        System.out.println("Car updated successfully.");
                    } else {
                        System.out.println("Car not found.");
                    }
                    break;
                case 3:
                    System.out.print("Enter Car ID to Remove: ");
                    int removeId = scanner.nextInt();
                    carOperations.removeCar(removeId);
                    System.out.println("Car removed successfully.");
                    break;
                case 4:
                    System.out.print("Enter Car ID to Retrieve: ");
                    int retrieveId = scanner.nextInt();
                    Car retrievedCar = carOperations.retrieveCar(retrieveId);
                    if (retrievedCar != null) {
                        System.out.println("Retrieved Car Details:");
                        System.out.println("ID: " + retrievedCar.getId());
                        System.out.println("Name: " + retrievedCar.getName());
                        System.out.println("Brand: " + retrievedCar.getBrand());
                        System.out.println("Price: $" + retrievedCar.getPrice());
                    } else {
                        System.out.println("Car not found.");
                    }
                    break;
                case 5:
                    List<Car> allCars = carOperations.getAllCars();
                    System.out.println("All Cars:");
                    for (Car car : allCars) {
                        System.out.println("ID: " + car.getId());
                        System.out.println("Name: " + car.getName());
                        System.out.println("Brand: " + car.getBrand());
                        System.out.println("Price: $" + car.getPrice());
                        System.out.println("--------------");
                    }
                    break;
                case 6:
                    System.out.println("Exiting the program.");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}

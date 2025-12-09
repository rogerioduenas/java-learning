package module09.exercises.ex_7.application;

import module09.exercises.ex_7.vehiclesA.Car;
import module09.exercises.ex_7.vehiclesA.Vehicle;
import module09.exercises.ex_7.vehiclesB.Truck;

public class Program {
  public static void main(String[] args) {

    Vehicle vehicle = new Vehicle("Honda", "Civic", 2021, "myFakeSecretCode");
    System.out.println("---------- Vehicle Class ----------");
    System.out.println(vehicle);

    System.out.println("---------- Car Class ----------");
    Car car = new Car("Toyota", "Corolla", 2024, "myFakeSecretCode");
    System.out.println(car);

    System.out.println("---------- Truck Class ----------");
    Truck truck = new Truck("Ford", "F-150", 2008, "myFakeSecretCode");
    System.out.println(truck);

  }
}

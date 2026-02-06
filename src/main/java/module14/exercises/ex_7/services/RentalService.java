package module14.exercises.ex_7.services;

import module14.exercises.ex_7.domain.entities.Car;
import module14.exercises.ex_7.domain.entities.Rental;
import module14.exercises.ex_7.domain.exceptions.DomainException;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class RentalService {

  private List<Car> activeCars = new ArrayList<>(List.of(
      new Car("1"), new Car("2"), new Car("3")
  ));
  private List<Rental> activeRentals = new ArrayList<>();

  public void rent(String carId, LocalDate startDate, LocalDate endDate) {
    validateDate(startDate, endDate);
    Car car = findCar(carId);

    if (car.isRented()) {
      throw new DomainException("Car " + carId + " is already rented.");
    }

    try {
      car.setRented(true);
      System.out.println("[LOG] Locking car " + carId + " for processing...");


      activeRentals.add(new Rental(car, startDate, endDate));
      System.out.println("Rental confirmed for car " + carId);

    } catch (RuntimeException e) {
      car.setRented(false);
      System.out.println("[LOG] Error detected. Rolling back car status to 'available'.");
      throw e;
    }
  }

  private Car findCar(String id) {
    for (Car car : activeCars) {
      if (car.getId().equals(id)) {
        return car;
      }
    }
    throw new DomainException("Car ID " + id + " not found.");
  }

  private void validateDate(LocalDate startDate, LocalDate endDate) {
    if (!startDate.isBefore(endDate)) {
      throw new DomainException("Invalid dates: Start must be before end.");
    }
  }

  @Override
  public String toString() {
    return "RentalService{" +
        "activeCars=" + activeCars +
        ", activeRentals=" + activeRentals +
        '}';
  }
}
package module13.exercises.ex_6.application;

import module13.exercises.ex_6.entities.Delivery;
import module13.exercises.ex_6.entities.ExpressDelivery;
import module13.exercises.ex_6.entities.PromotionalDelivery;

public class Program {
  public static void main(String[] args) {

    Delivery express = new ExpressDelivery(111, "NY", 50.0);
    Delivery promotional = new PromotionalDelivery(222, "NY", 50.0);

    System.out.printf("Express: %.2f%n", express.calculateTotalCost());
    System.out.printf("Promotional: %.2f%n", promotional.calculateTotalCost());
  }
}

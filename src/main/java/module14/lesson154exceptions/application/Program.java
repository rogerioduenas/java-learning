package module14.lesson154exceptions.application;

import module14.lesson154exceptions.model.DomainException.DomainException;
import module14.lesson154exceptions.model.entities.Reservation;

public class Program {
  public static void main(String[] args) {

    try {
      Reservation reservation = new Reservation(0001, "23/09/2026", "26/09/2026");
      System.out.println(reservation);
      reservation.updateDates("24/09/2026", "29/09/2026");
      System.out.println(reservation);
    } catch (DomainException | IllegalArgumentException e) {
      System.out.println(e.getMessage());
    }
  }
}

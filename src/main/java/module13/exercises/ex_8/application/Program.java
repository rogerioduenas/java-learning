package module13.exercises.ex_8.application;

import module13.exercises.ex_8.entities.CommonReservation;
import module13.exercises.ex_8.entities.PriorityReservation;
import module13.exercises.ex_8.entities.Reservation;

import java.util.ArrayList;
import java.util.List;

public class Program {
  public static void main(String[] args) {

    List<Reservation> reservations = new ArrayList<>();

    Reservation priorityReservation1 = new PriorityReservation(100.0, "Mike", 2, 20.0);
    Reservation priorityReservation2 = new PriorityReservation(200.0, "Maria", 3, 40.0);
    Reservation commonReservation1 = new CommonReservation(100.0, "Anna", 3);
    Reservation commonReservation2 = new CommonReservation(200.0, "Joe", 3);

    reservations.add(priorityReservation1);
    reservations.add(priorityReservation2);
    reservations.add(commonReservation1);
    reservations.add(commonReservation2);

    for (Reservation reservation : reservations) {
      System.out.println(reservation.totalCost());
    }

  }
}

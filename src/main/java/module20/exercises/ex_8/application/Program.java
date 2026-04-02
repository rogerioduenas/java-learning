package module20.exercises.ex_8.application;

import module20.exercises.ex_8.model.Dao.DaoFactory;
import module20.exercises.ex_8.model.Dao.ReservationDao;
import module20.exercises.ex_8.model.entities.Reservation;

import java.time.LocalDateTime;

public class Program {
  public static void main(String[] args) {

    Reservation reservation = new Reservation(9L, "Mike", 1, LocalDateTime.now(), LocalDateTime.now().plusDays(3));
    ReservationDao reservationDao = DaoFactory.createReservationDao();

    reservationDao.createReservation(reservation);

    reservationDao.cancelReservationById(reservation.getId());

    reservationDao.getAllReservations().forEach(System.out::println);
  }
}

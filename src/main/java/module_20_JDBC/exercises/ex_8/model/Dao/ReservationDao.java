package module_20_JDBC.exercises.ex_8.model.Dao;

import module_20_JDBC.exercises.ex_8.model.entities.Reservation;

import java.util.List;

public interface ReservationDao {

  Reservation createReservation(Reservation reservation);
  boolean cancelReservationById(Long reservationId);
  List<Reservation> getAllReservations();

}

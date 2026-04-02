package module20.exercises.ex_8.model.Dao.impl;

import module20.exercises.ex_8.db.DB;
import module20.exercises.ex_8.db.DBException;
import module20.exercises.ex_8.model.Dao.ReservationDao;
import module20.exercises.ex_8.model.entities.Reservation;

import java.sql.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class ReservationDaoJDBC implements ReservationDao {

  private Connection connection;

  public ReservationDaoJDBC(Connection connection) {
    this.connection = connection;
  }

  @Override
  public Reservation createReservation(Reservation reservation) {

    PreparedStatement ps = null;
    ResultSet rs = null;

    Integer roomNumber = reservation.getRoomNumber();
    LocalDateTime start = reservation.getCheckIn();
    LocalDateTime end = reservation.getCheckOut();

    if (!isRoomAvailable(roomNumber, start, end)) {
      throw new DBException("Room number not available");
    }

    try {
      ps = connection.prepareStatement("INSERT INTO reservation (guest_name, room_number, check_in, check_out) VALUES (?, ?, ?, ?)", Statement.RETURN_GENERATED_KEYS);
      ps.setString(1, reservation.getGuestName());
      ps.setInt(2, reservation.getRoomNumber());
      ps.setObject(3, reservation.getCheckIn());
      ps.setObject(4, reservation.getCheckOut());

      int affectedRows = ps.executeUpdate();

      if (affectedRows > 0) {
        rs = ps.getGeneratedKeys();
        if (rs.next()) {
          Long id = rs.getLong(1);
          reservation.setId(id);
        }
      }
    } catch (SQLException e) {
      throw new DBException(e.getMessage());
    } finally {
      DB.closeResultSet(rs);
      DB.closeStatement(ps);
    }
    return reservation;
  }

  @Override
  public boolean cancelReservationById(Long reservationId) {
    PreparedStatement ps = null;
    try {
      ps = connection.prepareStatement("DELETE FROM reservation WHERE id = ?");
      ps.setLong(1, reservationId);
      int affectedRows = ps.executeUpdate();
      if (affectedRows > 0) {
        return true;
      }
    } catch (SQLException e) {
      throw new DBException(e.getMessage());
    } finally {
      DB.closeStatement(ps);
    }
    return false;
  }

  @Override
  public List<Reservation> getAllReservations() {
    List<Reservation> reservations = new ArrayList<>();
    PreparedStatement ps = null;
    ResultSet rs = null;
    try {
      ps = connection.prepareStatement("SELECT * FROM reservation");
      rs = ps.executeQuery();
      while (rs.next()) {
        Long id = rs.getLong("id");
        String guestName = rs.getString("guest_name");
        Integer roomNumber = rs.getInt("room_number");
        LocalDateTime checkIn = rs.getObject("check_in", LocalDateTime.class);
        LocalDateTime checkOut = rs.getObject("check_out", LocalDateTime.class);
        reservations.add(new Reservation(id, guestName, roomNumber, checkIn, checkOut));
      }
    } catch (SQLException e) {
      throw new DBException(e.getMessage());
    } finally {
      DB.closeResultSet(rs);
      DB.closeStatement(ps);
    }
    return reservations;
  }

  private boolean isRoomAvailable(Integer roomNumber, LocalDateTime start, LocalDateTime end) {
    PreparedStatement ps = null;
    ResultSet rs = null;
    try {
      ps = connection.prepareStatement("SELECT COUNT(*) FROM reservation WHERE room_number = ? AND ? < check_out AND ? > check_in");
      ps.setInt(1, roomNumber);
      ps.setObject(2, start);
      ps.setObject(3, end);
      rs = ps.executeQuery();
      if (rs.next()) {
        int countConflictLines = rs.getInt(1);
        if (countConflictLines == 0) {
          return true;
        }
      }
    } catch (SQLException e) {
      throw new DBException(e.getMessage());
    } finally {
      DB.closeResultSet(rs);
      DB.closeStatement(ps);
    }
    return false;
  }
}

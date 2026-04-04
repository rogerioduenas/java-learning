package module_20_JDBC.exercises.ex_8.model.entities;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Reservation {

  private Long id;
  private String guestName;
  private Integer roomNumber;
  private LocalDateTime checkIn;
  private LocalDateTime checkOut;

  public Reservation(Long id, String guestName, Integer roomNumber, LocalDateTime checkIn, LocalDateTime checkOut) {
    this.id = id;
    this.guestName = guestName;
    this.roomNumber = roomNumber;
    this.checkIn = checkIn;
    this.checkOut = checkOut;
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getGuestName() {
    return guestName;
  }

  public Integer getRoomNumber() {
    return roomNumber;
  }

  public LocalDateTime getCheckIn() {
    return checkIn;
  }

  public LocalDateTime getCheckOut() {
    return checkOut;
  }

  private String fmt(LocalDateTime date) {
    return DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").format(date);
  }

  @Override
  public String toString() {
    return String.format("%d - %s - %d - %s - %s", id, guestName, roomNumber, fmt(checkIn), fmt(checkOut));
  }
}

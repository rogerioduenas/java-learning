package module14.lesson154exceptions.model.entities;

import module14.lesson154exceptions.model.DomainException.DomainException;

import java.time.Duration;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Reservation {

  private final Integer roomNumber;
  private LocalDate checkIn;
  private LocalDate checkOut;

  public Reservation(Integer roomNumber, String checkIn, String checkOut) throws DomainException {
    this.roomNumber = roomNumber;
    validateDates(textToLocalDate(checkIn), textToLocalDate(checkOut));
    this.checkIn = textToLocalDate(checkIn);
    this.checkOut = textToLocalDate(checkOut);
  }

  public long duration() {
    return Duration.between(checkIn.atStartOfDay(), checkOut.atStartOfDay()).toDays();
  }

  public void updateDates(String checkIn, String checkOut) throws DomainException {
    LocalDate checkInDate = textToLocalDate(checkIn);
    LocalDate checkOutDate = textToLocalDate(checkOut);
    validateDates(checkInDate, checkOutDate);
    this.checkIn = checkInDate;
    this.checkOut = checkOutDate;
  }

  public LocalDate textToLocalDate(String text) {
    return LocalDate.parse(text, fmt);
  }

  DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");

  public void validateDates(LocalDate checkIn, LocalDate checkOut) throws DomainException {
    LocalDate now = LocalDate.now();
    if (now.isAfter(checkIn) || now.isAfter(checkOut)) {
      throw new DomainException("Reservation dates for update must be future dates");
    }
    if (checkOut.isBefore(checkIn)) {
      throw new IllegalArgumentException("CheckOut date must be after checkIn date");
    }
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("Reservation: ")
        .append("Room: ").append(this.roomNumber)
        .append(", CheckIn: ").append(fmt.format(checkIn))
        .append(", CheckOut: ").append(fmt.format(checkOut))
        .append(", Duration: ").append(this.duration());
    return sb.toString();
  }
}

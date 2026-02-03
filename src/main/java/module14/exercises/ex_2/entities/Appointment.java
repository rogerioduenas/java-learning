package module14.exercises.ex_2.entities;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Appointment {

  private final String name;
  private final LocalDateTime startTime;
  private final LocalDateTime endTime;
  public static final DateTimeFormatter FMT = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

  public Appointment(String name, LocalDateTime startTime, LocalDateTime endTime) {
    validateDate(startTime, endTime);
    this.name = name;
    this.startTime = startTime;
    this.endTime = endTime;
  }

  public String calcDuration() {
    return Duration.between(startTime, endTime).toMinutes() + " minutes";
  }

  private void validateDate(LocalDateTime startTime, LocalDateTime endTime) {
    if (!startTime.isBefore(endTime)) {
      throw new IllegalArgumentException("Start time must be before end time");
    }
  }

  @Override
  public String toString() {
    return String.format("Name: %s - Start: %s - End: %s - Duration: %s",
        name,
        FMT.format(startTime),
        FMT.format(endTime),
        calcDuration());
  }
}

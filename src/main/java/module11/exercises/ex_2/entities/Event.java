package module11.exercises.ex_2.entities;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Event {
  private String name;
  private LocalDateTime eventDateTime;

  public Event(String name) {
    this.name = name;
  }

  public void createEvent() {
    eventDateTime = LocalDateTime.now();
  }

  public String toString() {
    String formattedData = eventDateTime.format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss"));
    return name + ": " + formattedData;
  }
}

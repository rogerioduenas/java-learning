package module15.exercises.ex_2.model;

import java.time.LocalDate;

public class Contract {

  private final String id;
  private final String clientName;
  private final LocalDate startDate;
  private final LocalDate endDate;

  public Contract(String id, String clientName, LocalDate startDate, LocalDate endDate) {
    this.id = id;
    this.clientName = clientName;
    this.startDate = startDate;
    this.endDate = endDate;
  }

  @Override
  public String toString() {
    return String.format("Id:%s - Name:%s - Start:%s - End:%s", id, clientName, startDate, endDate);
  }
}

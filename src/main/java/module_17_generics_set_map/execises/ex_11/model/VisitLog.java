package module_17_generics_set_map.execises.ex_11.model;

import java.time.Instant;
import java.util.Objects;

public class VisitLog {

  private final String participantId;
  private Instant timestamp;

  public VisitLog(String participantId, Instant timestamp) {
    this.participantId = participantId;
    this.timestamp = timestamp;
  }

  @Override
  public boolean equals(Object o) {
    if (o == null || getClass() != o.getClass()) return false;
    VisitLog visitLog = (VisitLog) o;
    return Objects.equals(participantId, visitLog.participantId);
  }

  @Override
  public int hashCode() {
    return Objects.hashCode(participantId);
  }

  @Override
  public String toString() {
    return participantId;
  }
}

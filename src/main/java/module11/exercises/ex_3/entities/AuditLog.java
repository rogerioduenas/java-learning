package module11.exercises.ex_3.entities;

import java.time.Instant;

public class AuditLog {
  private final String action;
  private final Instant timestamp;

  private AuditLog(String action) {
    this.action = action;
    this.timestamp = Instant.now();
  }

  public static AuditLog register(String action) {
    return new AuditLog(action);
  }

  public String getTimestampIso() {
    return timestamp.toString();
  }
}

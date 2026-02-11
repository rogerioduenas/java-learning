package module15.exercises.ex_1.model;

import java.time.LocalDateTime;

public class AccessLog {

  private final LocalDateTime timestamp;
  private final String userId;
  private final String resourceAccessed;

  public AccessLog(LocalDateTime timestamp, String userId, String resourceAccessed) {
    this.timestamp = timestamp;
    this.userId = userId;
    this.resourceAccessed = resourceAccessed;
  }

  @Override
  public String toString() {
    return String.format("[LOG] Time:%s, Id:%s, Resource:%s", timestamp, userId, resourceAccessed);
  }
}

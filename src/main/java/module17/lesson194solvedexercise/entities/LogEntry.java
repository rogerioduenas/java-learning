package module17.lesson194solvedexercise.entities;

import java.time.Instant;
import java.util.Objects;

  public class LogEntry {
    private final String username;
    private final Instant moment;

    public LogEntry(String username, Instant moment) {
      this.username = username;
      this.moment = moment;
    }

    @Override
    public boolean equals(Object o) {
      if (o == null || getClass() != o.getClass()) return false;
      LogEntry logEntry = (LogEntry) o;
      return Objects.equals(username, logEntry.username);
    }

    @Override
    public int hashCode() {
      return Objects.hashCode(username);
    }
  }


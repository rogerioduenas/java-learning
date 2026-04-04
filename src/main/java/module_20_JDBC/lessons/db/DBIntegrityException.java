package module_20_JDBC.lessons.db;

public class DBIntegrityException extends RuntimeException {
  public DBIntegrityException(String message) {
    super(message);
  }
}

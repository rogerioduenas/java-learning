package module_20_JDBC.exercises.ex_2.db;

public class DBIntegrityException extends RuntimeException {
  public DBIntegrityException(String message) {
    super(message);
  }
}

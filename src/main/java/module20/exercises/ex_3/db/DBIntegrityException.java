package module20.exercises.ex_3.db;

public class DBIntegrityException extends RuntimeException {
  public DBIntegrityException(String message) {
		super(message);
  }
}

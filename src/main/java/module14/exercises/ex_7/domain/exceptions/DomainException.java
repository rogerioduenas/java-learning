package module14.exercises.ex_7.domain.exceptions;

public class DomainException extends RuntimeException {
  public DomainException(String message) {
    super(message);
  }
}

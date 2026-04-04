package module_14_exception_handling.exercises.ex_7.domain.exceptions;

public class DomainException extends RuntimeException {
  public DomainException(String message) {
    super(message);
  }
}

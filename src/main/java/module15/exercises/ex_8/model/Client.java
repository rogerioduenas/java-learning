package module15.exercises.ex_8.model;

public class Client {

  private final String name;
  private final String email;

  public Client(String name, String email) {
    this.name = name;
    this.email = email;
  }

  @Override
  public String toString() {
    return String.format("Name: %s, Email: %s", this.name, this.email);
  }
}

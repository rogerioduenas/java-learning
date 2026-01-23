package module12.exercises.ex_8.entities;

public class Client {
  private String name;
  private String email;

  public Client(String name, String email) {
    this.name = name;
    this.email = email;
  }

  public String getName() {
    return name;
  }

  public String getEmail() {
    return email;
  }
}

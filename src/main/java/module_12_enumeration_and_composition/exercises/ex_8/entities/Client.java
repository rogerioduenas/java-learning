package module_12_enumeration_and_composition.exercises.ex_8.entities;

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

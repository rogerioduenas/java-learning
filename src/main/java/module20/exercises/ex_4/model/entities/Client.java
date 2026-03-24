package module20.exercises.ex_4.model.entities;

public class Client {

  private Long id;
  private String name;
  private String email;

  public Client(Long id, String name, String email) {
    this.id = id;
    this.name = name;
    this.email = email;
  }

  public String getName() {
    return name;
  }

  public String getEmail() {
    return email;
  }

  public Long getId() {
    return id;
  }

  @Override
  public String toString() {
    return String.format("id: %s, name: %s, email: %s", id, name, email);
  }
}

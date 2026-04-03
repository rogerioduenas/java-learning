package module20.exercises.ex_10.model.entities;

public class Client {

  private Long id;
  private String name;

  public Client(Long id, String name) {
    this.id = id;
    this.name = name;
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  @Override
  public String toString() {
    return String.format("Client: %d, %s", id, name);
  }
}

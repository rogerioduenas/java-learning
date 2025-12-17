package module10.exercises.ex_2.entities;

public class Rent {

  private String name;
  private String email;

  public Rent(String name, String email) {
    this.name = name;
    this.email = email;
  }

  @Override
  public String toString() {
    return name + ", " + email;
  }
}

package module_12_enumeration_and_composition.exercises.ex_4.entities;

public class Department {

  private String name;

  public Department(String name) {
    this.name = name;
  }

  @Override
  public String toString() {
    return "{" +
        "name='" + name + '\'' +
        '}';
  }
}

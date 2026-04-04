package module_10_memory_behavior_of_arrays_and_lists.exercises.ex_2.entities;

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

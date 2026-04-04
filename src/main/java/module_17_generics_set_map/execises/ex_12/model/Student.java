package module_17_generics_set_map.execises.ex_12.model;

import java.util.Objects;

public class Student {
  private final Integer id;

  public Student(Integer id) {
    this.id = id;
  }

  @Override
  public boolean equals(Object o) {
    if (o == null || getClass() != o.getClass()) return false;
    Student student = (Student) o;
    return Objects.equals(id, student.id);
  }

  @Override
  public int hashCode() {
    return Objects.hashCode(id);
  }

  @Override
  public String toString() {
    return id.toString();
  }
}

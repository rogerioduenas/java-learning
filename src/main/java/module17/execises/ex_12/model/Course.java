package module17.execises.ex_12.model;

import java.util.HashSet;
import java.util.Set;

public class Course {

  private final String name;

  private Set<Student> students = new HashSet<>();

  public Course(String name) {
    this.name = name;
  }

  public Set<Student> getStudents() {
    return students;
  }

  public String getName() {
    return name;
  }

  public void addStudent(Student student) {
    this.students.add(student);
  }

  @Override
  public String toString() {
    return String.format("Course: %s -> Students: %s", name, students);
  }
}

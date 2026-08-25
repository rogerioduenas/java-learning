package module_09_constructors_this_overloading_encapsulation.exercises.ex_3.entities;

public class Student {
  private final String name;
  private double score;

  public Student(String name, double score) {
    validateData(name, score);
    this.name = name;
    this.score = score;
  }

  public Student(String name) {
    this(name, 0.0);
  }

  public Student() {
    this("Undefined", 0.0);
  }

  private void validateData(String name, double score) {
    if (name == null || name.isBlank()) {
      throw new IllegalArgumentException("Student name cannot be null or blank");
    }

    if (score < 0) {
      throw new IllegalArgumentException("Student score cannot be negative");
    }
  }

  public String getName() {
    return name;
  }

  public double getScore() {
    return score;
  }

  public void updateScore(double value) {
    if (value < 0) throw new IllegalArgumentException("Student score cannot be negative");
    this.score = value;
  }

  public String toString() {
    return String.format("Name= %s - score= %.2f", name, score);
  }
}

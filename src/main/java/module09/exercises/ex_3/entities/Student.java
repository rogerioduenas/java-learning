package module09.exercises.ex_3.entities;

public class Student {
  private final String name;
  private double score;

  public Student(String name, double score) {
    this.name = name;
    this.score = score;
  }

  public Student(String name) {
    this.name = name;
    this.score = 0.0;
  }

  public Student() {
    this.name = "Undefined";
    this.score = 0.0;
  }

  public void updateScore(double value) {
    this.score = value;
  }

  public String toString() {
    return String.format("Name= %s - score= %.2f", name, score);
  }
}

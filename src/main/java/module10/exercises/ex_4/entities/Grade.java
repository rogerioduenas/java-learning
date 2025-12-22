package module10.exercises.ex_4.entities;

public class Grade {
  private final Double grade1;
  private final Double grade2;

  public Grade(Double grade1, Double grade2) {
    this.grade1 = grade1;
    this.grade2 = grade2;
  }

  public Double[] getValue() {
    return new Double[]{ this.grade1, this.grade2 };
  }
}

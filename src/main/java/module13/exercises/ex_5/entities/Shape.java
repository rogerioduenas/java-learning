package module13.exercises.ex_5.entities;

public abstract class Shape {

  private String color;

  public Shape(String color) {
    this.color = color;
  }

  public abstract double area();
}

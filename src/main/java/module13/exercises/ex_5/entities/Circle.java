package module13.exercises.ex_5.entities;

public class Circle extends Shape {

  private double radius;

  public Circle(String color, double radius) {
    super(color);
    this.radius = radius;
  }

  @Override
  public double area() {
    return Math.PI * Math.pow(radius, 2);
  }
}

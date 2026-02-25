package module17.lesson189_1delimitedwildcard.entities;

public class Circle implements Shape {

  private double radius;

  public Circle(double radius) {
    super();
    this.radius = radius;
  }

  @Override
  public double area() {
    return Math.PI * radius * radius;
  }
}

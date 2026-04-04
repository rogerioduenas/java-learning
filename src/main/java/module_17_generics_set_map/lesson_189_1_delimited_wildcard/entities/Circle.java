package module_17_generics_set_map.lesson_189_1_delimited_wildcard.entities;

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

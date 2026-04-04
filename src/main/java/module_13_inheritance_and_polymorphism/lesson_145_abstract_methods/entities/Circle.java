package module_13_inheritance_and_polymorphism.lesson_145_abstract_methods.entities;

public class Circle extends Shape {

  private Double radius;

  public Circle(Color color, Double radius) {
    super(color);
    this.radius = radius;
  }

  @Override
  public Double area() {
    return Math.PI * radius * radius;
  }
}

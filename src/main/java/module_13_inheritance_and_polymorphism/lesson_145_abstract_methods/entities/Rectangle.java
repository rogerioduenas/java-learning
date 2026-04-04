package module_13_inheritance_and_polymorphism.lesson_145_abstract_methods.entities;

public class Rectangle extends Shape {

  private Double width;
  private Double height;

  public Rectangle(Color color, Double width, Double height) {
    super(color);
    this.width = width;
    this.height = height;
  }

  @Override
  public Double area() {
    return width * height;
  }
}

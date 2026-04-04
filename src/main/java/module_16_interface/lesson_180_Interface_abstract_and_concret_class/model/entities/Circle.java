package module_16_interface.lesson_180_Interface_abstract_and_concret_class.model.entities;

import module_16_interface.lesson_180_Interface_abstract_and_concret_class.model.entities.enums.Color;

public class Circle extends AbstractShape {

  private Double radius;

  public Circle(Color color, Double radius) {
    super(color);
    this.radius = radius;
  }

  @Override
  public double area() {
    return Math.PI * radius * radius;
  }
}

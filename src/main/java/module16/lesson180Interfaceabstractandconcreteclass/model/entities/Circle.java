package module16.lesson180Interfaceabstractandconcreteclass.model.entities;

import module16.lesson180Interfaceabstractandconcreteclass.model.entities.enums.Color;

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

package module16.lesson180Interfaceabstractandconcreteclass.model.entities;

import module16.lesson180Interfaceabstractandconcreteclass.model.entities.enums.Color;

public class Rectangle extends AbstractShape {

  private final Double width;
  private final Double height;

  public Rectangle(Color color, Double width, Double height) {
    super(color);
    this.width = width;
    this.height = height;
  }

  @Override
  public double area() {
    return width * height;
  }
}

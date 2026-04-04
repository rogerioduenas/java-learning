package module_16_interface.lesson_180_Interface_abstract_and_concret_class.model.entities;

import module_16_interface.lesson_180_Interface_abstract_and_concret_class.model.entities.enums.Color;

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

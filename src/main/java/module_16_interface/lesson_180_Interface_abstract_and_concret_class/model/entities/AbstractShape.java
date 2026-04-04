package module_16_interface.lesson_180_Interface_abstract_and_concret_class.model.entities;

import module_16_interface.lesson_180_Interface_abstract_and_concret_class.model.entities.enums.Color;

public abstract class AbstractShape implements Shape {

  private Color color;

  public AbstractShape(Color color) {
    this.color = color;
  }

  public Color getColor() {
    return color;
  }

  public void setColor(Color color) {
    this.color = color;
  }
}

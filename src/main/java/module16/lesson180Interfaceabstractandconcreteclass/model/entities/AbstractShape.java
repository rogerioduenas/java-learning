package module16.lesson180Interfaceabstractandconcreteclass.model.entities;

import module16.lesson180Interfaceabstractandconcreteclass.model.entities.enums.Color;

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

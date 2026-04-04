package module_13_inheritance_and_polymorphism.lesson_145_abstract_methods.entities;

public abstract class Shape {

  private Color color;

  public Shape(Color color) {
    this.color = color;
  }

  public abstract Double area();
}

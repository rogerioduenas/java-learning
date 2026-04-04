package module_17_generics_set_map.lesson_189_1_delimited_wildcard.entities;

public class Rectangle implements Shape {

  private double width;
  private double height;

  public Rectangle(double width, double height) {
    this.width = width;
    this.height = height;
  }

  @Override
  public double area() {
    return width * height;
  }
}

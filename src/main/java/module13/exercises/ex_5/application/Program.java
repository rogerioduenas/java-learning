package module13.exercises.ex_5.application;

import module13.exercises.ex_5.entities.Circle;
import module13.exercises.ex_5.entities.Rectangle;
import module13.exercises.ex_5.entities.Shape;

import java.util.ArrayList;
import java.util.List;

public class Program {
  public static void main(String[] args) {

    List<Shape> listOfShapes = new ArrayList<>();

    Shape circle1 = new Circle("Red", 3.0);
    Shape circle2 = new Circle("Blue", 4.0);
    Shape rectangle1 = new Rectangle("Green", 3.0, 4.0);
    Shape rectangle2 = new Rectangle("Magenta", 8.0, 3.0);

    listOfShapes.add(circle1);
    listOfShapes.add(circle2);
    listOfShapes.add(rectangle1);
    listOfShapes.add(rectangle2);

    for (Shape shape : listOfShapes) {
      System.out.printf("Area: %.2f%n", shape.area());
    }
  }
}

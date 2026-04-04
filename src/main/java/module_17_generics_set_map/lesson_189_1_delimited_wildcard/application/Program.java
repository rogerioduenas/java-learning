package module_17_generics_set_map.lesson_189_1_delimited_wildcard.application;

import module_17_generics_set_map.lesson_189_1_delimited_wildcard.entities.Circle;
import module_17_generics_set_map.lesson_189_1_delimited_wildcard.entities.Rectangle;
import module_17_generics_set_map.lesson_189_1_delimited_wildcard.entities.Shape;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Program {

  public static void main(String[] args) {

    List<Shape> myShapes = new ArrayList<>(Arrays.asList(
        new Rectangle(3.0, 2.0),
        new Circle(2.0)));

    List<Circle> myCircles = new ArrayList<>(Arrays.asList(
        new Circle(2.0),
        new Circle(3.0)));

    System.out.printf("Total area (Shapes): %.2f%nTotal area (Circles): %.2f%n",
        totalArea(myShapes), totalArea(myCircles));
  }

  public static double totalArea(List<? extends Shape> list) {
    double sum = 0.0;
    for (Shape s : list) {
      sum += s.area();
    }
    return sum;
  }
}

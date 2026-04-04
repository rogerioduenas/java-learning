package module_08_Introduction_to_OOP.lesson_64_without_and_with_oop.with.entities;

public class Triangle {

  public double a, b, c;

  public double area(){
    double p = (a + b + c) / 2;
    double result = Math.sqrt(p * (p - a) * (p - b) * (p - c));
    return result;
  }
}

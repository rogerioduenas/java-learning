package lesson25casting;

public class Casting {

  static void main() {

    int n1, n2;
    double result;

    n1 = 5;
    n2 = 2;

    result = (double) n1 / n2;

    System.out.println(result);

    //------------------- example 2

    double n3;
    int n4;

    n3 = 5.0;
    n4 = (int) n3;

    System.out.println(n4);
  }
}

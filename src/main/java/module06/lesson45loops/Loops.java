package module06.lesson45loops;

public class Loops {

  static void main() {
    loopFor();
    loopWhile();
    loopDoWhile();
    loopForEach();
  }

  static void loopFor() {
    System.out.println("---------- Loop for ----------");
    for (int i = 1; i <= 10; i++) {
      System.out.println(i);
    }
  }

  static void loopWhile() {
    System.out.println("---------- Loop While ----------");
    int number = 1;
    while (number <= 10) {
      System.out.println(number);
      number++;
    }
  }

  static void loopDoWhile() {
    System.out.println("---------- Loop do While ----------");
    int number = 1;
    do {
      System.out.println(number);
      number++;
    } while (number <= 10);
  }

  static void loopForEach() {
    System.out.println("----------Loop forEach ----------");
    String[] vect = new String[]{"Mike", "Anna", "Caio"};
    for (String value : vect) {
      System.out.println(value);
    }
  }
}

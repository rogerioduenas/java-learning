package module06.lesson45loops;

public class Loops {

  static void main() {
    loopFor();
    loopWhile();
    loopDoWhile();
  }

  static void loopFor() {
    for (int i = 1; i <= 10; i++) {
      System.out.println(i);
    }
  }

  static void loopWhile() {
    int number = 1;
    while (number <= 10) {
      System.out.println(number);
      number++;
    }
  }

  static void loopDoWhile() {
    int number = 1;
    do {
      System.out.println(number);
      number++;
    } while (number <= 10);
  }
}

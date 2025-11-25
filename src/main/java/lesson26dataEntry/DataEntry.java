package lesson26dataEntry;

import java.util.Scanner;

public class DataEntry {

  static void main() {
    Scanner sc = new Scanner(System.in);

    readFirstWord(sc);
    readNumber(sc);
    readFloat(sc);
    readFirstLetter(sc);
    readMultiple(sc);
    readMultipleTexts(sc);
    readLinesSafely(sc);

    sc.close();
  }

  static void readFirstWord(Scanner sc) {
    String name = sc.next();
    System.out.printf("The name is: %s%n", name);
  }

  static void readNumber(Scanner sc) {
    int number = sc.nextInt();
    System.out.printf("The number is: %d%n", number);
  }

  static void readFloat(Scanner sc) {
    double number = sc.nextDouble();
    System.out.printf("The float number is: %.2f%n", number);
  }

  static void readFirstLetter(Scanner sc) {
    char ch = sc.next().charAt(0);
    System.out.printf("The char is %s%n", ch);
  }

  static void readMultiple(Scanner sc) {
    String word = sc.next();
    int number = sc.nextInt();
    double floatNumber = sc.nextDouble();

    System.out.printf(
        "word: %s%n number: %d%n floatNumber: %.2f%n",
        word, number, floatNumber
    );
  }

  static void readMultipleTexts(Scanner sc) {
    String text1, text2, text3;
    text1 = sc.nextLine();
    text2 = sc.nextLine();
    text3 = sc.nextLine();

    System.out.printf(
        "text1: %s%n text2: %s%n text3: %s%n",
        text1, text2, text3
    );
  }

  static void readLinesSafely(Scanner sc) {
    String text1, text2, text3;
    int number;
    number = sc.nextInt();
    sc.nextLine(); // clear the \n pending
    text1 = sc.nextLine();
    text2 = sc.nextLine();
    text3 = sc.nextLine();

    System.out.printf(
        "number: %d text1: %s%n text2: %s%n text3: %s%n",
        number, text1, text2, text3
    );
  }
}

package module10.exercises.ex_5;

public class Program {
  public static void main(String[] args) {

    System.out.println("---------- int / Integer ----------");

    int number1 = 10;

    // Boxing implicit
    Integer boxing1 = number1;
    System.out.printf("Boxing (implicit): %s%n",
        boxing1.getClass().getSimpleName());

    // Boxing explicit
    Integer boxing1Explicit = Integer.valueOf(number1);
    System.out.printf("Boxing (explicit): %s%n",
        boxing1Explicit.getClass().getSimpleName());

    // Unboxing implicit
    int unboxing1 = boxing1;
    System.out.printf("Unboxing (implicit): %s%n",
        ((Object) unboxing1).getClass().getSimpleName());

    // Unboxing explicit
    int unboxing1Explicit = boxing1.intValue();
    System.out.printf("Unboxing (explicit): %s%n",
        ((Object) unboxing1Explicit).getClass().getSimpleName());

    System.out.println("---------- double / Double ----------");

    double number2 = 10.5;

    // Boxing implicit
    Double boxing2 = number2;
    System.out.printf("Boxing (implicit): %s%n",
        boxing2.getClass().getSimpleName());

    // Boxing explicit
    Double boxing2Explicit = Double.valueOf(number2);
    System.out.printf("Boxing (explicit): %s%n",
        boxing2Explicit.getClass().getSimpleName());

    // Unboxing implicit
    double unboxing2 = boxing2;
    System.out.printf("Unboxing (implicit): %s%n",
        ((Object) unboxing2).getClass().getSimpleName());

    // Unboxing explicit
    double unboxing2Explicit = boxing2.doubleValue();
    System.out.printf("Unboxing (explicit): %s%n",
        ((Object) unboxing2Explicit).getClass().getSimpleName());
  }
}

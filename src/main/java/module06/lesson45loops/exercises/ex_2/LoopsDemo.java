//Crie uma funcionalidade que receba um valor numérico fornecido pelo usuário e apresente uma contagem regressiva partindo do valor fornecido até alcançar um limite mínimo pré-definido, repetindo a operação enquanto a condição continuar válida.
package module06.lesson45loops.exercises.ex_2;

import java.util.Scanner;

public class LoopsDemo {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter a number: ");
    int minLimit = 0;
    int num = sc.nextInt();

    for (int i = num; i >= minLimit; i--) {
      System.out.println(i);
    }
  }
}

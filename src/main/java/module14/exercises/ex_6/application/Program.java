package module14.exercises.ex_6.application;

import module14.exercises.ex_6.domain.exceptions.DomainException;
import module14.exercises.ex_6.domain.entities.User;
import module14.exercises.ex_6.services.AuthenticateService;

import java.util.Scanner;

public class Program {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    AuthenticateService authenticateService = new AuthenticateService();
    authenticateService.addUser(new User("anna@anna.com", "1"));
    authenticateService.addUser(new User("mike@mike.com", "2"));

    while (true) {
      try {
        System.out.print("Enter your email: ");
        String email = sc.nextLine();

        System.out.print("Enter your password: ");
        String password = sc.nextLine();

        authenticateService.authenticate(email, password);
        break;

      } catch (DomainException e) {
        System.out.println(e.getMessage());

      } catch (Exception e) {
        System.out.println("----- Something went wrong. -----");
      }

      System.out.print("Do you want to try again? (y/n): ");
      char again = sc.next().charAt(0);
      sc.nextLine();

      if (again != 'y') {
        System.out.println("Thank you for using our application.");
        break;
      }
    }

    sc.close();

  }
}

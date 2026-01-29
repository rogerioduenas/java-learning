package module13.exercises.ex_7.application;

import module13.exercises.ex_7.entities.EmailNotification;
import module13.exercises.ex_7.entities.Notification;
import module13.exercises.ex_7.entities.SmsNotification;

public class Program {
  public static void main(String[] args) {

    Notification smsNotification = new SmsNotification("Mike", "999-9999");
    System.out.println(smsNotification.sendNotification("Any message"));

    Notification emailNotification = new EmailNotification("Anna", "anna@anna");
    System.out.println(emailNotification.sendNotification("Any message"));
  }
}

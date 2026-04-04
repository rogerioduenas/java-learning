package module_11_date_and_time.exercises.ex_2.application;

import module_11_date_and_time.exercises.ex_2.entities.Event;

public class Program {
  public static void main(String[] args) {

    Event event = new Event("Birthday");
    event.createEvent();
    System.out.println(event);
  }
}

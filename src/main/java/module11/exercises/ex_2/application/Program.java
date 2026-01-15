package module11.exercises.ex_2.application;

import module11.exercises.ex_2.entities.Event;

public class Program {
  public static void main(String[] args) {

    Event event = new Event("Birthday");
    event.createEvent();
    System.out.println(event);
  }
}

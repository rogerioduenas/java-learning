package module13.exercises.ex_10.application;

import module13.exercises.ex_10.entities.Event;
import module13.exercises.ex_10.entities.InPersonEvent;
import module13.exercises.ex_10.entities.OnlineEvent;

import java.util.ArrayList;
import java.util.List;

public class Program {
  public static void main(String[] args) {

    List<Event> events = new ArrayList<>();

    Event online1 = new OnlineEvent("Race", 100.0, 10.0);
    Event online2 = new OnlineEvent("Race", 100.0, 10.0);
    Event inPerson1 = new InPersonEvent("Fight", 500.0, 100.0);
    Event inPerson2 = new InPersonEvent("Fight", 500.0, 100.0);

    events.add(online1);
    events.add(online2);
    events.add(inPerson1);
    events.add(inPerson2);

    Double sum = 0.0;
    for (Event event : events) {
      Double cost = event.totalCost();
      System.out.printf("Event cost: %.2f%n", cost);
      sum += cost;
    }

    System.out.printf("Total cost: %.2f", sum);
  }
}

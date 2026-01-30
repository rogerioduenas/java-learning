package module13.exercises.ex_9.application;

import module13.exercises.ex_9.entities.BasicSubscription;
import module13.exercises.ex_9.entities.PremiumSubscription;
import module13.exercises.ex_9.entities.Subscription;
import module13.exercises.ex_9.entities.TrialSubscription;

import java.util.ArrayList;
import java.util.List;

public class Program {
  public static void main(String[] args) {

    List<Subscription> subscriptions = new ArrayList<>();

    Subscription trial = new TrialSubscription("Mike", 7);
    Subscription basic = new BasicSubscription("Mike", 10.90);
    Subscription premium = new PremiumSubscription("Anna", 10.9, 5.0);

    subscriptions.add(basic);
    subscriptions.add(premium);
    subscriptions.add(trial);

    for (Subscription subscription : subscriptions) {
      System.out.printf("Type: %s - Total fee: %.2f%n", subscription.getClass().getSimpleName(), subscription.totalMonthlyFee());
    }
  }
}

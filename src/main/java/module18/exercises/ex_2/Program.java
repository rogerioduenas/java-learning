package module18.exercises.ex_2;

import module18.exercises.ex_2.model.DeliveryOrder;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Program {
  public static void main(String[] args) {

    List<DeliveryOrder> deliveryOrders = new ArrayList<>(Arrays.asList(
        new DeliveryOrder("Alice Thompson", "New York", 2500.50, 5),
        new DeliveryOrder("Bob Smith", "Chicago", 450.00, 3),
        new DeliveryOrder("Charlie Davis", "Seattle", 15.25, 2),
        new DeliveryOrder("Diana Prince", "Detroit", 800.00, 4),
        new DeliveryOrder("Edward Norton", "Boston", 1200.00, 1),
        new DeliveryOrder("Fiona Gallagher", "Miami", 5.00, 1),
        new DeliveryOrder("George Miller", "Miami", 110.00, 5),
        new DeliveryOrder("Hannah Abbott", "Denver", 3000.00, 3),
        new DeliveryOrder("Ian Wright", "Denver", 5600.00, 4),
        new DeliveryOrder("Jack Sparrow", "Detroit", 101.00, 2)
    ));

    Predicate<DeliveryOrder> isLowValue = p -> p.getOrderValue() < 1000.0;
    Predicate<DeliveryOrder> isForbiddenCity = p -> Arrays.asList("Miami", "Denver").contains(p.getDestinationCity());
    Predicate<DeliveryOrder> isLowPriority = p -> p.getPriorityLevel() < 3;

    deliveryOrders.removeIf(isLowValue.or(isForbiddenCity).or(isLowPriority));

    System.out.println("--- Remaining Orders ---");
    deliveryOrders.forEach(System.out::println);
  }
}

package module18.exercises.ex_1.application;

import module18.exercises.ex_1.model.Proposal;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Program {
  public static void main(String[] args) {
    List<Proposal> proposals = new ArrayList<>(Arrays.asList(
        new Proposal("Apex Solutions Group", 15400.50, 5),
        new Proposal("Global Logistics Corp", 8900.00, 12),
        new Proposal("Alpha Supplies & Co", 12750.75, 3),
        new Proposal("Pinnacle Industries", 21000.00, 15),
        new Proposal("Phoenix Commercial", 9200.20, 7),
        new Proposal("Elite Office Systems", 18300.00, 10),
        new Proposal("Nexus Distribution", 11150.90, 4),
        new Proposal("Prime Supply Partners", 25600.00, 20),
        new Proposal("Master Equipment Ltd", 7800.45, 8),
        new Proposal("Inova Tech Express", 14200.00, 2)
    ));

    Comparator<Proposal> comparatorByTotalPrice = Comparator.comparing(Proposal::getTotalPrice).reversed();
    Comparator<Proposal> comparatorByDeliveryDays = Comparator.comparing(Proposal::getDeliveryDays);
    Comparator<Proposal> comparatorByCostBenefit = Comparator.comparing(p -> p.getTotalPrice() / p.getDeliveryDays());

    proposals.stream()
        .sorted((comparatorByCostBenefit))
        .forEach(System.out::println);
  }
}

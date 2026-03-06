package module17.execises.ex_20;

import module17.execises.ex_20.model.Customer;
import module17.execises.ex_20.model.CustomerRanking;
import module17.execises.ex_20.model.Order;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;

public class Program {
  public static void main(String[] args) throws IOException {
    Path path = Path.of("src/main/java/module17/execises/ex_20/customers_orders.csv");
    List<String> lines = Files.readAllLines(path);

    List<Order> allOrders = new ArrayList<>();
    Set<Customer> allCustomers = new HashSet<>();
    Map<Customer, Double> ordersAmount = new HashMap<>();

    for (String line : lines.subList(1, lines.size())) {
      String[] fields = line.split(",");
      Integer id = Integer.parseInt(fields[0]);
      String name = fields[1];
      Double amount = Double.parseDouble(fields[2]);

      Customer customer = new Customer(id, name);
      Order order = new Order(customer, amount);

      allOrders.add(order);
      allCustomers.add(customer);
      ordersAmount.merge(customer, amount, Double::sum);
    }

    TreeSet<CustomerRanking> ranking = new TreeSet<>();
    for (Customer key : ordersAmount.keySet()) {
      ranking.add(new CustomerRanking(key, ordersAmount.get(key)));
    }

    System.out.println("--- CUSTOMER EXPENDITURE RANKING ---");
    ranking.forEach(System.out::println);
  }
}
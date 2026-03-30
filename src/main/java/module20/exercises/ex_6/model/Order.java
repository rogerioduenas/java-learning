package module20.exercises.ex_6.model;

import java.util.ArrayList;
import java.util.List;

public class Order {

  private Long id;
  private String customerName;

  private List<Item> listItens = new ArrayList<>();

  public Order(Long id, String customerName) {
    this.id = id;
    this.customerName = customerName;
  }

  public String getCustomerName() {
    return customerName;
  }

  public List<Item> getListItens() {
    return listItens;
  }

  public void addItem(Item item) {
    this.listItens.add(item);
  }

  @Override
  public String toString() {
    return String.format("----- %s's Order - id: %d -----%n%s", customerName, id, listItens);
  }
}

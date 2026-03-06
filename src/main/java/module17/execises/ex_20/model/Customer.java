package module17.execises.ex_20.model;

import java.util.Objects;

public class Customer implements Comparable<Customer> {

  private Integer id;
  private String name;

  public Customer(Integer id, String name) {
    this.id = id;
    this.name = name;
  }

  @Override
  public boolean equals(Object o) {
    if (o == null || getClass() != o.getClass()) return false;
    Customer customer = (Customer) o;
    return Objects.equals(id, customer.id);
  }

  @Override
  public int hashCode() {
    return Objects.hashCode(id);
  }

  @Override
  public String toString() {
    return String.format("id: %d, name: %s", id, name);
  }

  @Override
  public int compareTo(Customer other) {
    return name.compareTo(other.name);
  }
}

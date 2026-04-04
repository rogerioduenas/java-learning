package module_17_generics_set_map.execises.ex_16.model;

import java.util.Objects;

public class Customer {

  private final Integer id;
  private final String name;

  public Customer(Integer id, String name) {
    this.id = id;
    this.name = name;
  }

  @Override
  public boolean equals(Object o) {
    if (o == null || getClass() != o.getClass()) return false;
    Customer cortumer = (Customer) o;
    return Objects.equals(id, cortumer.id);
  }

  @Override
  public int hashCode() {
    return Objects.hashCode(id);
  }

  @Override
  public String toString() {
    return String.format("id: %d - name: %s", id, name);
  }
}

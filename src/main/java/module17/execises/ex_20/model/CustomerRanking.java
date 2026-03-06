package module17.execises.ex_20.model;

public class CustomerRanking implements Comparable<CustomerRanking>{

  private Customer customer;
  private Double totalSpent;

  public CustomerRanking(Customer customer, Double totalSpent) {
    this.customer = customer;
    this.totalSpent = totalSpent;
  }

  @Override
  public int compareTo(CustomerRanking other) {
    int res = other.totalSpent.compareTo(totalSpent);
    if (res == 0) {
      return customer.compareTo(other.customer);
    }
    return res;
  }

  @Override
  public String toString() {
    return String.format("%s - %.2f", customer, totalSpent);
  }
}

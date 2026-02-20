package module16.exercises.ex_5.model;

public class Client implements Comparable<Client>{

  private String firstName;
  private String lastName;

  public Client(String firstName, String lastName) {
    this.firstName = firstName;
    this.lastName = lastName;
  }

  @Override
  public int compareTo(Client other) {
    return this.firstName.compareTo(other.firstName);
  }

  @Override
  public String toString() {
    return String.format("First Name: %s, Last Name: %s%n", firstName, lastName);
  }
}

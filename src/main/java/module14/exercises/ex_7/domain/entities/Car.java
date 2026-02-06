package module14.exercises.ex_7.domain.entities;

public class Car {

  private final String id;
  private boolean rented;

  public Car(String id) {
    this.id = id;
    this.rented = false;
  }

  public String getId() {
    return id;
  }

  public boolean isRented() {
    return rented;
  }

  public void setRented(boolean rented) {
    this.rented = rented;
  }

  @Override
  public String toString() {
    return String.format("id: %s, rented: %b", id, rented);
  }
}

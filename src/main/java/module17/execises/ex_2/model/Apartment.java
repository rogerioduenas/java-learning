package module17.execises.ex_2.model;

public class Apartment implements Comparable<Apartment> {

  private Double area;

  public Apartment(Double area) {
    this.area = area;
  }

  @Override
  public String toString() {
    return area.toString();
  }

  @Override
  public int compareTo(Apartment o) {
    return area.compareTo(o.area);
  }
}

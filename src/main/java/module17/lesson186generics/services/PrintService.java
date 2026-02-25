package module17.lesson186generics.services;

import java.util.ArrayList;
import java.util.List;

public class PrintService<T> {

  private List<T> list = new ArrayList<>();

  public void addValue(T value) {
    list.add(value);
  }

  public T first() {
    return list.get(0);
  }

  public void print() {
    for (int i = 0; i < list.size(); i++) {
      System.out.println(list.get(i));
    }
  }
}

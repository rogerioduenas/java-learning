package module17.execises.ex_1.services;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

public class StorageService <T> {

  private List<T> items = new ArrayList<>();

  public void add(T item) {
    items.add(item);
  }

  public T getFirst() {
    if (items.isEmpty()) {
      throw new NoSuchElementException("List is empty");
    }
    return items.getFirst();
  }

  public List<T> getAll(){
    return items;
  }
}

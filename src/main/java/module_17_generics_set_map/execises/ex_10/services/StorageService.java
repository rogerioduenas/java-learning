package module_17_generics_set_map.execises.ex_10.services;

import java.util.ArrayList;
import java.util.List;

public class StorageService<T> {

  private List<T> storage = new ArrayList<>();

  public void add(T item){
    storage.add(item);
  }

  public void remove(T item){
    storage.remove(item);
  }

  public List<T> getStorage() {
    return storage;
  }
}

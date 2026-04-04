package module_17_generics_set_map.execises.ex_9.service;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class FilterService {

  public static <T> List<T> filter(List<T> list, Predicate<T> p) {
    List<T> result = new ArrayList<T>();
    for (T item : list) {
      if (p.test(item)) {
        result.add(item);
      }
    }
    return result;
  }
}

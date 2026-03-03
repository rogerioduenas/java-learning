package module17.execises.ex_8.service;

import java.util.Collections;
import java.util.List;

public class RankingService<T extends Comparable<? super T>> {

  public List<T> sort(List<T> list) {
    Collections.sort(list);
    return list;
  }
}

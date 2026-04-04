package module_17_generics_set_map.execises.ex_6.service;

import java.util.List;

public class TransferService {

  public static void copy(List<? extends Number> source, List<? super Number> destiny) {
    destiny.addAll(source);
  }
}

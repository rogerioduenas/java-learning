package module_17_generics_set_map.execises.ex_10.services;

import java.util.List;

public class TransferService {

  public <T> void copy(List<? extends T> source, List<? super T> destination){
    destination.addAll(source);
  }
}

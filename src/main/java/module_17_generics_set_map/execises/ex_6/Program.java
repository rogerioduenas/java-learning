package module_17_generics_set_map.execises.ex_6;

import module_17_generics_set_map.execises.ex_6.service.TransferService;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Program {
  public static void main(String[] args) {

    List<Integer> listInt = new ArrayList<>(Arrays.asList(1, 2, 3));
    List<Double> listDouble = new ArrayList<>(Arrays.asList(4.0, 5.0, 6.0));
    List<Object> listObject = new ArrayList<>();

    TransferService.copy(listInt, listObject);
    System.out.println(listObject);

    TransferService.copy(listDouble, listObject);
    System.out.println(listObject);
  }
}

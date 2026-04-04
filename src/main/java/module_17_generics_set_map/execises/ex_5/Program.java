package module_17_generics_set_map.execises.ex_5;

import module_17_generics_set_map.execises.ex_5.service.FinanceService;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Program {
  public static void main(String[] args) {
    List<Integer> listInt = new ArrayList<>(Arrays.asList(10, 20, 30));
    List<Double> listDouble = new ArrayList<>(Arrays.asList(1.0, 2.0, 3.0));

    System.out.println(FinanceService.sum(listInt));
    System.out.println(FinanceService.sum(listDouble));
  }
}

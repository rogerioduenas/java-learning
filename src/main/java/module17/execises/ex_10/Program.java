package module17.execises.ex_10;

import module17.execises.ex_10.services.EvaluationService;
import module17.execises.ex_10.services.ReportService;
import module17.execises.ex_10.services.StorageService;
import module17.execises.ex_10.services.TransferService;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Program {
  public static void main(String[] args) {
    List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));

    StorageService<Integer> storage = new StorageService<>();
    EvaluationService evaluation = new EvaluationService();
    TransferService transfer = new TransferService();
    ReportService report = new ReportService();

    //storage
    for (Integer i : list) {
      storage.add(i);
    }
    storage.remove(1);

    System.out.println(storage.getStorage());

    //evaliation
    System.out.println(evaluation.findMax(storage.getStorage()));

    //transfer
    List<Integer> newList = new ArrayList<>();
    transfer.copy(storage.getStorage(), newList);
    System.out.println(newList);

    //report
    report.printReport(newList);

  }
}

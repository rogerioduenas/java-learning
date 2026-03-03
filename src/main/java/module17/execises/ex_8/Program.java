package module17.execises.ex_8;

import module17.execises.ex_8.service.RankingService;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Program {
  public static void main(String[] args) {
    RankingService<Integer> rankingService = new RankingService<>();
    List<Integer> listInt = new ArrayList<>(Arrays.asList(5, 2, 1));
    System.out.println(rankingService.sort(listInt));
  }
}

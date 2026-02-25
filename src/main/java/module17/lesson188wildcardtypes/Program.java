package module17.lesson188wildcardtypes;

import java.util.Arrays;
import java.util.List;

public class Program {
  public static void main(String[] args) {

    List<Integer> myInts = Arrays.asList(5, 2, 10);
    printList(myInts);

    List<String> myStrings = Arrays.asList("a", "b", "c");
    printList(myStrings);
  }

  public static void printList(List<?> list) {
    for (Object obj : list) {
      System.out.println(obj);
    }
//    list.add(3)
//    ***This cannot be done because the compiler has no way of knowing if the data being sent is of the same type as the list that was received.***
  }
}

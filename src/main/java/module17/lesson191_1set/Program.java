package module17.lesson191_1set;

import java.util.*;

public class Program {
  public static void main(String[] args) {

    //faster O(1) on hash tables and unordered
    Set<String> hashSet = new HashSet<>(Arrays.asList("c", "a", "b"));
    System.out.println(hashSet.contains("a"));
    for (String p : hashSet) {
      System.out.println(p);
    }

    System.out.println("--------------------------------------------------------------------------");

    //slower O(log(n)) on red-black tree and ordered by compareTo or Comparator
    Set<String> treeSet = new TreeSet<>(Arrays.asList("b", "c", "a"));
    for (String p : treeSet) {
      System.out.println(p);
    }

    System.out.println("--------------------------------------------------------------------------");

    //intermediate speed and elements in the order in which they are added.
    Set<String> linkedHashSet = new LinkedHashSet<>(Arrays.asList("c", "a", "b"));
    for (String p : linkedHashSet) {
      System.out.println(p);
    }
  }
}

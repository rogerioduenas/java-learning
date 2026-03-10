package module18.lesson207stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Program {
  public static void main(String[] args) {

    List<Integer> list = Arrays.asList(3, 4, 5, 10, 7);
    Stream<Integer> st1 = list.stream();
    System.out.println(Arrays.toString(st1.toArray()));

    Stream<Integer> st2 = list.stream().map(i -> i + 10);
    System.out.println(Arrays.toString(st2.toArray()));

    Stream<String> st3 = Stream.of("Maria", "Alex", "Bob");
    System.out.println(Arrays.toString(st3.toArray()));

    Stream<Integer> st4 = Stream.iterate(0, x -> x + 2);
    System.out.println(Arrays.toString(st4.limit(10).toArray()));
  }
}

package module_10_memory_behavior_of_arrays_and_lists.lesson_101_boxing_unboxing_and_wrapper;

public class Program {
  public static void main(String[] args) {

    //Boxing
    int a = 10;
    Object obj = a;
    System.out.println(obj);

    //unboxing
    int b = (int) obj;
    System.out.println(b);

    //wrapper
    int c = 20;
    Integer obj2 = c;
    int d = obj2 * 2;
    System.out.println(d);
  }
}

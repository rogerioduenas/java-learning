package module10.lesson101boxingunboxingandwrapper;

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

package module17.lesson190hashcodeandequals;

import module17.lesson190hashcodeandequals.entities.Client;

public class Program {
  public static void main(String[] args) {

    String a = "Maria";
    String b = "Alex";

    System.out.println(a.equals(b));

    System.out.println(a.hashCode());
    System.out.println(b.hashCode());


    System.out.println("-----------");

    Client c1 = new Client("Maria", "maria@maria.com");
    Client c2 = new Client("Mike", "mike@mike.com");
    Client c3 = new Client("Mike", "mike@mike.com");
    Client c4 = c3;


    System.out.println(c1.hashCode());
    System.out.println(c2.hashCode());
    System.out.println(c1.equals(c2)); //false
    System.out.println(c2.equals(c3)); //true
    System.out.println(c2 == c3); //false memory ref
    System.out.println(c4 == c3); //true memory ref
  }
}

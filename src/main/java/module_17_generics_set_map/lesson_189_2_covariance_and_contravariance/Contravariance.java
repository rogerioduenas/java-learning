package module_17_generics_set_map.lesson_189_2_covariance_and_contravariance;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Contravariance {
  static List<Object> myObjs = new ArrayList<>(Arrays.asList("a", "b", "c"));

  public static void contravariance() {
    List<? super Number> myNums = myObjs;
    myNums.add(20); //ok
    //Number x = myNums.get(0); // <--- compiler error
    System.out.println(myNums.get(0)); //stupid exception
    Object x = myNums.get(0); //stupid exception
    //This doesn't work because the type of item received might be a different type than Number or another type.
  }
}


package module17.lesson189_2covarianceandcontravariance;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Covariance {
  static List<Integer> intList = new ArrayList<>(Arrays.asList(1, 2, 3));

  public static void covariance() {
    List<? extends Number> list = intList;
    Number x = list.get(0); //ok
    //list.add(20); <--- compiler error
    //It doesn't add anything because the compiler has no way of knowing if the type is compatible with the list type.
  }
}

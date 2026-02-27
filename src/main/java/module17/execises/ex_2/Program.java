package module17.execises.ex_2;

import module17.execises.ex_2.model.Apartment;
import module17.execises.ex_2.service.MaxService;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Program {
  public static void main(String[] args) {

    List<Apartment> apartments = new ArrayList<>(Arrays.asList(
        new Apartment(10.0),
        new Apartment(20.0),
        new Apartment(30.0)
    ));

    System.out.println(MaxService.max(apartments));
  }
}

package module_17_generics_set_map.execises.ex_16;

import module_17_generics_set_map.execises.ex_16.model.Customer;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;

public class Program {
  public static void main(String[] args) throws IOException {

    List<Path> paths = Arrays.asList(
        Path.of("src/main/java/module17/execises/ex_16/db/branch_A.csv"),
        Path.of("src/main/java/module17/execises/ex_16/db/branch_B.csv")
    );

    List<Set<Customer>> branchSets = Arrays.asList(new HashSet<>(), new HashSet<>());

    for (int i = 0; i < paths.size(); ++i) {
      List<String> lines = Files.readAllLines(paths.get(i));

      for (String line : lines.subList(1, lines.size())) {
        String[] fields = line.split(",");
        Integer id = Integer.parseInt(fields[0].trim());
        String name = fields[1].trim();

        branchSets.get(i).add(new Customer(id, name));
      }
    }

    Set<Customer> customerA = branchSets.get(0);
    Set<Customer> customerB = branchSets.get(1);

    Set<Customer> common = new HashSet<>(customerA);
    common.retainAll(customerB);
    System.out.println("Common to both: " + common);

    Set<Customer> onlyA = new HashSet<>(customerA);
    onlyA.removeAll(customerB);
    System.out.println("Only branch A: " + onlyA);

    Set<Customer> onlyB = new HashSet<>(customerB);
    onlyB.removeAll(customerA);
    System.out.println("Only branch B: " + onlyB);
  }
}

package module16.exercises.ex_6.services;

import module16.exercises.ex_6.model.Employee;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EmployeeService {

  public static List<Employee> getEmployeesSortedByName(Path path) throws IOException {
    List<Employee> employees = new ArrayList<>();
    List<String> lines = Files.readAllLines(path);

    for (String line : lines) {
      String[] fields = line.split(",");
      String name = fields[0];
      double salary = Double.parseDouble(fields[1]);
      Employee employee = new Employee(name, salary);
      employees.add(employee);
    }
    Collections.sort(employees);
    return employees;
  }
}

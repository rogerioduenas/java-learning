package module16.exercises.ex_6;

import module16.exercises.ex_6.model.Employee;
import module16.exercises.ex_6.services.EmployeeService;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Program {
  public static void main(String[] args) throws IOException {
    Path path = Paths.get("src/main/java/module16/exercises/ex_6/employees.csv");
    List<Employee> employees = EmployeeService.getEmployeesSortedByName(path);
    System.out.println(employees);
  }
}

package module12.exercises.ex_9.application;

import module12.exercises.ex_9.entities.Contract;
import module12.exercises.ex_9.entities.Department;
import module12.exercises.ex_9.entities.Worker;
import module12.exercises.ex_9.entities.WorkerLevel;

import java.time.LocalDate;

public class Program {
  public static void main(String[] args) {
    Worker worker = new Worker("Mike", WorkerLevel.ENTRY, 1000.0, new Department("Design"));

    worker.addContract(new Contract(LocalDate.of(2025, 12, 1), 10.0, 25));
    worker.addContract(new Contract(LocalDate.of(2025, 12, 1), 10.0, 15));
    worker.addContract(new Contract(LocalDate.of(2025, 11, 1), 20.0, 2));

    System.out.printf("%s%nMonthly Salary: %.2f", worker, worker.income(11,2025));
  }
}

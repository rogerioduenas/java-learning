package module14.exercises.ex_9.domain.entities;

import module14.exercises.ex_9.domain.exceptions.DomainException;

import java.util.ArrayList;
import java.util.List;

public class TaskExecutor {

  private List<Task> tasks = new ArrayList<Task>(List.of(
      new Task(1),
      new Task(2),
      new Task(3),
      new Task(4)
  ));

  public void executeAll() {
    for (Task task : tasks) {
      try {
        executeTasks(task);
        System.out.println("Executed " + task);
      } catch (DomainException e) {
        System.out.println(e.getMessage());
      }
    }
  }

  private void executeTasks(Task task) {
    if (task.getId() % 2 != 0) {
      throw new DomainException(String.format("Task %d failed", task.getId()));
    }
  }
}

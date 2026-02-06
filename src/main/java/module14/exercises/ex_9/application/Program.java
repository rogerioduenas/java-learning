package module14.exercises.ex_9.application;

import module14.exercises.ex_9.domain.entities.TaskExecutor;

public class Program {
  public static void main(String[] args) {
    TaskExecutor taskExecutor = new TaskExecutor();
    taskExecutor.executeAll();
  }
}

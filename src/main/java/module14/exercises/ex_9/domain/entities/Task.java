package module14.exercises.ex_9.domain.entities;

public class Task {

  private int id;

  public Task(int id) {
    this.id = id;
  }

  @Override
  public String toString() {
    return "Task " + id;
  }

  public int getId() {
    return id;
  }
}

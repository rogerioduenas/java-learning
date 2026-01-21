package module12.exercises.ex_1.entities;

public class User {

  private int id;
  private String name;
  private UserLevel level;

  public User(int id, String name, UserLevel level) {
    this.id = id;
    this.name = name;
    this.level = level;
  }

  public static User createUser(int id, String name, UserLevel level) {
    return new User(id, name, level);
  }

  public String toString() {
    return "User{" +
        "id=" + id +
        ", name='" + name + '\'' +
        ", level=" + level +
        '}';
  }
}

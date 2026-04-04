package module_12_enumeration_and_composition.exercises.ex_5.entities;

public class Comment {
  private String text;

  public Comment(String text) {
    this.text = text;
  }

  @Override
  public String toString() {
    return "Comment{" +
        "text='" + text + '\'' +
        '}';
  }
}

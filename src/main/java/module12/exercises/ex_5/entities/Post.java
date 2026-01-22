package module12.exercises.ex_5.entities;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Post {
  private String title;
  private String content;
  private Integer likes;
  private LocalDateTime moment;

  private List<Comment> comments = new ArrayList<>();

  public Post(String title, String content, Integer likes) {
    this.title = title;
    this.content = content;
    this.likes = likes;
    this.moment = LocalDateTime.now();
  }

  public void addComment(String comment) {
    this.comments.add(new Comment(comment));
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("Title: " + title + "\n");
    sb.append("Content: " + content + "\n");
    sb.append("Likes: " + likes + "\n");
    sb.append("Moment: " + moment + "\n");
    for (Comment comment : comments) {
      sb.append(comment.toString() + "\n");
    }
    return sb.toString();
  }
}

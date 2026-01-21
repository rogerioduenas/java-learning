package module12.lesson132compositionandstringbuilder.entities;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Post {

  private LocalDateTime moment;
  private String title;
  private String content;
  private Integer likes;

  private List<Comment> listOfComments = new ArrayList<>();

  public Post(LocalDateTime moment, String title, String content, Integer likes) {
    this.moment = moment;
    this.title = title;
    this.content = content;
    this.likes = likes;
  }

  public void addComment(Comment comment) {
    this.listOfComments.add(comment);
  }

  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append(title).append("\n");
    sb.append(likes);
    sb.append(" Likes - ");
    sb.append(moment).append("\n");
    sb.append(content).append("\n");
    sb.append("Comments:\n");
    for (Comment c : listOfComments) {
      sb.append(c.getText()).append("\n");
    }
    return sb.toString();
  }
}

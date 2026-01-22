package module12.exercises.ex_5.application;

import module12.exercises.ex_5.entities.Post;

public class Program {
  public static void main(String[] args) {

    Post post = new Post("Any Tittle", "Any content", 32);
    post.addComment("Comment 1");
    post.addComment("Comment 2");
    post.addComment("Comment 3");
    System.out.println(post);
  }
}

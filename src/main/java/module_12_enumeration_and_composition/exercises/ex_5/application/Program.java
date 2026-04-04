package module_12_enumeration_and_composition.exercises.ex_5.application;

import module_12_enumeration_and_composition.exercises.ex_5.entities.Post;

public class Program {
  public static void main(String[] args) {

    Post post = new Post("Any Tittle", "Any content", 32);
    post.addComment("Comment 1");
    post.addComment("Comment 2");
    post.addComment("Comment 3");
    System.out.println(post);
  }
}

package module17.execises.ex_18.model;

public class Player implements Comparable<Player> {

  private String name;
  private Integer score;

  public Player(String name, Integer score) {
    this.name = name;
    this.score = score;
  }

  @Override
  public int compareTo(Player other) {
    int comp = other.score.compareTo(score);
    if (comp == 0) {
      return this.name.compareTo(other.name);
    }
    return comp;
  }

  @Override
  public String toString() {
    return String.format("name: %s, score: %d", name, score);
  }
}

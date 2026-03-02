package module17.execises.ex_3.model;

public class Candidate implements Comparable<Candidate> {

  private final String name;
  private final Double score;

  public Candidate(String name, Double score) {
    this.name = name;
    this.score = score;
  }

  @Override
  public int compareTo(Candidate other) {
    return Double.compare(this.score, other.score);
  }

  @Override
  public String toString() {
    return String.format("name: %s - score: %.2f", name, score);
  }
}

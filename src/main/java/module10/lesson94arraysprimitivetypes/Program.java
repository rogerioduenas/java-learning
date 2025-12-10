package module10.lesson94arraysprimitivetypes;

public class Program {
  public static void main(String[] args) {

    double[] vect = new double[]{1.72, 1.56, 1.80};

    double sum = 0.0;
    for (double value : vect) {
      sum += value;
    }

    double average = sum / vect.length;
    System.out.printf("%.2f", average);
  }
}

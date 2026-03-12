package module18.exercises.ex_10.model;

public class ProductionBatch {

  private long batchNumber;

  public ProductionBatch(long batchNumber) {
    this.batchNumber = batchNumber;
  }

  @Override
  public String toString() {
    return String.format("batch number: %d", batchNumber);
  }
}

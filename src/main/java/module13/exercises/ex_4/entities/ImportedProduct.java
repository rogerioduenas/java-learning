package module13.exercises.ex_4.entities;

public class ImportedProduct extends Product {

  private Double customsFee;

  public ImportedProduct(String name, Double price, Double customsFee) {
    super(name, price);
    this.customsFee = customsFee;
  }

  @Override
  public String priceTag() {
    Double totalPrice = super.getPrice() + customsFee;

    return String.format(
        "%s (Customs fee: $%.2f) Total: $%.2f",
        super.priceTag(),
        customsFee,
        totalPrice
    );
  }
}

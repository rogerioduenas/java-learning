package module_12_enumeration_and_composition.lesson_127_enums.entities;

import java.time.LocalDateTime;

public class Order {
  private Integer id;
  private LocalDateTime moment;
  private OrderStatus status;


  public Order(Integer id, LocalDateTime moment, OrderStatus status) {
    this.id = id;
    this.moment = moment;
    this.status = status;
  }

  @Override
  public String toString() {
    return "Order{" +
        "id=" + id +
        ", moment=" + moment +
        ", status=" + status +
        '}';
  }
}

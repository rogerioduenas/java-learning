package module12.exercises.ex_6.entities;

import java.time.LocalDateTime;
import java.util.Random;

public class Order {
  private final int id;
  private final LocalDateTime moment;
  private OrderStatus status;

  private Order(OrderStatus status) {
    this.id = generateId();
    this.moment = LocalDateTime.now();
    this.status = status;
  }

  public static Order create(OrderStatus status) {
    return new Order(status);
  }

  public void setStatus(OrderStatus status) {
    this.status = status;
  }

  private static final Random RANDOM = new Random();
  private static int generateId() {
    return RANDOM.nextInt(100000, 999999);
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

package module_20_JDBC.exercises.ex_9.model.Dao;

import module_20_JDBC.exercises.ex_9.model.entities.Payment;

import java.time.LocalDate;
import java.util.List;

public interface PaymentDao {

  Payment registerPayment(Payment payment);
  List<Payment> getPaymentsBetweenDates(LocalDate start, LocalDate end);
}

package module_20_JDBC.exercises.ex_9.application;

import module_20_JDBC.exercises.ex_9.model.Dao.DaoFactory;
import module_20_JDBC.exercises.ex_9.model.Dao.PaymentDao;
import module_20_JDBC.exercises.ex_9.model.entities.Payment;
import module_20_JDBC.exercises.ex_9.model.entities.PaymentMethod;

import java.time.LocalDate;

public class Program {
  public static void main(String[] args) {

    PaymentDao paymentDao = DaoFactory.createPaymentDao();
    Payment payment = new Payment(null, 3000.0, PaymentMethod.CASH, LocalDate.now().minusDays(3));

    paymentDao.registerPayment(payment);

    paymentDao.getPaymentsBetweenDates(LocalDate.now().minusDays(2), LocalDate.now().minusDays(1)).forEach(System.out::println);
  }
}

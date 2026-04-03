package module20.exercises.ex_9.model.Dao.impl;

import module20.exercises.ex_9.db.DB;
import module20.exercises.ex_9.db.DBException;
import module20.exercises.ex_9.model.Dao.PaymentDao;
import module20.exercises.ex_9.model.entities.Payment;
import module20.exercises.ex_9.model.entities.PaymentMethod;

import java.sql.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class PaymentDaoJDBC implements PaymentDao {

  private Connection connection;

  public PaymentDaoJDBC(Connection connection) {
    this.connection = connection;
  }

  @Override
  public Payment registerPayment(Payment payment) {
    PreparedStatement ps = null;
    ResultSet rs = null;
    try {
      ps = connection.prepareStatement("INSERT INTO payment (amount, method, payment_date) VALUES (?,?,?)", Statement.RETURN_GENERATED_KEYS);
      ps.setDouble(1, payment.getAmount());
      ps.setString(2, payment.getMethod().name());
      ps.setObject(3, payment.getDate());
      int affectedRows = ps.executeUpdate();
      if (affectedRows == 0) {
        throw new SQLException("Failed to register payment");
      }
      rs = ps.getGeneratedKeys();
      if (rs.next()) {
        payment.setId(rs.getLong(1));
      }
    } catch (SQLException e) {
      throw new DBException(e.getMessage());
    } finally {
      DB.closeResultSet(rs);
      DB.closeStatement(ps);
    }
    return payment;
  }

  @Override
  public List<Payment> getPaymentsBetweenDates(LocalDate start, LocalDate end) {
    List<Payment> payments = new ArrayList<>();
    PreparedStatement ps = null;
    ResultSet rs = null;
    try {
      ps = connection.prepareStatement("SELECT * FROM payment WHERE payment_date BETWEEN ? AND ?");
      ps.setObject(1, start);
      ps.setObject(2, end);
      rs = ps.executeQuery();
      while (rs.next()) {
        Long id = rs.getLong("id");
        Double amount = rs.getDouble("amount");
        PaymentMethod method = PaymentMethod.valueOf(rs.getString("method"));
        LocalDate date = rs.getObject("payment_date", LocalDate.class);
        payments.add(new Payment(id, amount, method, date));
      }
    } catch (SQLException e) {
      throw new DBException(e.getMessage());
    } finally {
      DB.closeResultSet(rs);
      DB.closeStatement(ps);
    }
    return payments;
  }
}

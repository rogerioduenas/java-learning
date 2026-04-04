package module_20_JDBC.exercises.ex_3.db;

import java.io.IOException;
import java.io.InputStream;
import java.sql.*;
import java.util.Properties;

public class DB {

  private static Connection connection = null;

  private static Properties loadProperties() {
    try (InputStream in = DB.class.getClassLoader().getResourceAsStream("db.properties")) {
      Properties props = new Properties();
      props.load(in);
      return props;
    } catch (IOException e) {
      throw new DBException(e.getMessage());
    }
  }

  public static Connection getConnection() {
    if (connection == null) {
      try {
        Properties props = loadProperties();
        String url = props.getProperty("dburl");
        connection = DriverManager.getConnection(url, props);
      } catch (SQLException e) {
        throw new DBException(e.getMessage());
      }
    }
    return connection;
  }

  public static void closeConnection() {
    if (connection != null) {
      try {
        connection.close();
        connection = null;
      } catch (SQLException e) {
        throw new DBException(e.getMessage());
      }
    }
  }

  public static void closeStatement(Statement statment) {
    if (statment != null) {
      try {
        statment.close();
      } catch (SQLException e) {
        throw new DBException(e.getMessage());
      }
    }
  }

  public static void closeResultSet(ResultSet resultSet) {
    if (resultSet != null) {
      try {
        resultSet.close();
      } catch (SQLException e) {
        throw new DBException(e.getMessage());
      }
    }
  }
}

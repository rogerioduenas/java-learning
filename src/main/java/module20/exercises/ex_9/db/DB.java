package module20.exercises.ex_9.db;

import java.io.IOException;
import java.io.InputStream;
import java.sql.*;
import java.util.Properties;

public class DB {

  private static Connection connection = null;

  private static Properties loadProperties() {
    Properties props = new Properties();
    try (InputStream in = DB.class.getClassLoader().getResourceAsStream("db.properties")) {
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

  public static void closeStatement(Statement st) {
    if (st != null) {
      try {
        st.close();
      } catch (SQLException e) {
        throw new DBException(e.getMessage());
      }
    }
  }

  public static void closeResultSet(ResultSet rs) {
    if (rs != null) {
      try {
        rs.close();
      } catch (SQLException e) {
        throw new DBException(e.getMessage());
      }
    }
  }
}

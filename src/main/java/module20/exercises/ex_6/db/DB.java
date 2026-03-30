package module20.exercises.ex_6.db;

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
    if(connection == null) {
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

  public static void closeStatement(Statement stmt) {
    if (stmt != null) {
      try {
        stmt.close();
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

  public static void rollback(Connection connection) {
    try {
      if (connection != null) connection.rollback();
    } catch (SQLException e) {
      throw new DBException("Rollback Exception: " + e.getMessage());
    }
  }

  public static void setAutoCommit(Connection connection, boolean value) {
    try {
      if (connection != null) connection.setAutoCommit(value);
    } catch (SQLException e) {
      throw new DBException("Error to setAutoCommit: " + e.getMessage());
    }
  }
}

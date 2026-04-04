package module_20_JDBC.lessons.db;

import java.io.IOException;
import java.io.InputStream;
import java.sql.*;
import java.util.Properties;

public class DB {

  private static Connection connection = null;

  private static Properties loadProperties() {
    try (InputStream is = DB.class.getClassLoader().getResourceAsStream("db.properties")) {
      Properties props = new Properties();
      props.load(is);
      return props;
    } catch (IOException e) {
      throw new DbException(e.getMessage());
    }
  }

  public static Connection getConnection() {
    if (connection == null) {
      try {
        Properties props = loadProperties();
        String url = props.getProperty("dburl");
        connection = DriverManager.getConnection(url, props);
      } catch (SQLException e) {
        throw new DbException(e.getMessage());
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
        throw new DbException(e.getMessage());
      }
    }
  }

  public static void closeStatement(Statement st) {
    if (st != null) {
      try {
        st.close();
      } catch (SQLException e) {
        throw new DbException(e.getMessage());
      }
    }
  }

  public static void closeResultSet(ResultSet rs) {
    if (rs != null) {
      try {
        rs.close();
      } catch (SQLException e) {
        throw new DbException(e.getMessage());
      }
    }
  }
}

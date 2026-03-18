package module20.JDBC_DAO.model.entities;

import java.io.Serializable;
import java.util.Objects;

public class Department implements Serializable {

  private Integer id;
  private String name;

  public Department(Integer id, String name) {
    this.id = id;
    this.name = name;
  }

  public Integer getId() {
    return id;
  }

  @Override
  public boolean equals(Object o) {
    if (o == null || getClass() != o.getClass()) return false;
    Department that = (Department) o;
    return Objects.equals(id, that.id);
  }

  @Override
  public int hashCode() {
    return Objects.hashCode(id);
  }

  @Override
  public String toString() {
    return String.format("Department [id=%d, name=%s]", id, name);
  }
}

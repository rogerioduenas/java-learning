package module_20_JDBC.exercises.ex_5.dao;

import java.util.List;

public interface GenericCrud<T> {

  void insert(T entity);

  void update(T entity);

  void deleteById(Long id);

  T findById(Long id);

  List<T> findAll();
}

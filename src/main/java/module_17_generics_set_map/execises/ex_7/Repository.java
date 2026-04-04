package module_17_generics_set_map.execises.ex_7;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Repository<K, V> {

  private Map<K, V> storage = new HashMap<>();

  public void save(K key, V value) {
    storage.put(key, value);
  }

  public V findById(K id) {
    return storage.get(id);
  }

  public List<V> findAll() {
    return new ArrayList<>(storage.values());
  }
}

package module_17_generics_set_map.execises.ex_19.model;

public class Session {
  private final String username;
  private final String action;

  public Session(String username, String action) {
    this.username = username;
    this.action = action;
  }

  public String getUsername() {
    return username;
  }
}

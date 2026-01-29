package module13.exercises.ex_7.entities;

public abstract class Notification {

  protected String recipient;

  public Notification(String recipient) {
    this.recipient = recipient;
  }

  public abstract String sendNotification(String message);
}

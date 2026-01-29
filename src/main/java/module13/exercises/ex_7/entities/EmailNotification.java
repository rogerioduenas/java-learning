package module13.exercises.ex_7.entities;

public class EmailNotification extends Notification {

  private String emailAddress;

  public EmailNotification(String recipient, String emailAddress) {
    super(recipient);
    this.emailAddress = emailAddress;
  }

  @Override
  public String sendNotification(String message) {
    return String.format("Email: %s, Recipient: %s, Message: %s", this.emailAddress, recipient, message);
  }
}

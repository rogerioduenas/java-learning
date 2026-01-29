package module13.exercises.ex_7.entities;

public class SmsNotification extends Notification {

  private String phoneNumber;

  public SmsNotification(String recipient, String phoneNumber) {
    super(recipient);
    this.phoneNumber = phoneNumber;
  }

  @Override
  public String sendNotification(String message) {
    return String.format("Phone: %s, Recipient: %s, Message: %s", this.phoneNumber, recipient, message);
  }
}

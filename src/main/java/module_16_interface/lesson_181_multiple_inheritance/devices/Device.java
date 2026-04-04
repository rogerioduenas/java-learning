package module_16_interface.lesson_181_multiple_inheritance.devices;

public abstract class Device {

  public String serialNumber;

  public Device(String serialNumber) {
    this.serialNumber = serialNumber;
  }

  public abstract void processDoc(String doc);
}

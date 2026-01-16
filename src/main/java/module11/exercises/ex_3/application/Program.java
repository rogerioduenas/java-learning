package module11.exercises.ex_3.application;

import module11.exercises.ex_3.entities.AuditLog;

public class Program {
  public static void main(String[] args) {
    AuditLog event = AuditLog.register("login");
    System.out.println(event.getTimestampIso());
  }
}

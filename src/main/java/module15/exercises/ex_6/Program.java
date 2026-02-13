package module15.exercises.ex_6;

import module15.exercises.ex_6.service.AuditService;

public class Program {
  public static void main(String[] args){
    String path = "src/main/java/module15/exercises/ex_6/temp_audit";
    System.out.println(AuditService.scanDirectory(path));
  }
}

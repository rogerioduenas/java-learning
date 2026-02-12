package module15.exercises.ex_4.application;

import module15.exercises.ex_4.model.ConfigurationFile;
import module15.exercises.ex_4.service.BackupService;

public class Program {
  public static void main(String[] args) {
    ConfigurationFile configFile = new ConfigurationFile("src/main/java/module15/exercises/ex_4/config.txt");
    BackupService backupService = new BackupService("src/main/java/module15/exercises/ex_4/");
    backupService.createBackup(configFile);
  }
}

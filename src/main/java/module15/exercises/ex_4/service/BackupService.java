package module15.exercises.ex_4.service;

import module15.exercises.ex_4.model.ConfigurationFile;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class BackupService {

  private String backupDirectory;

  public BackupService(String backupDirectory) {
    this.backupDirectory = backupDirectory;
  }

  public void createBackup(ConfigurationFile configFile) {
    Path source = Paths.get(configFile.getFilePath());
    String formattedDateTime = DateTimeFormatter.ofPattern("_dd-MM-yyyy_HH-mm-ss_").format(LocalDateTime.now());
    Path destination = Paths.get(backupDirectory + "backup" + formattedDateTime + ".txt");

    try {
      Files.copy(source, destination, StandardCopyOption.REPLACE_EXISTING);
      System.out.println("File copied successfully!");
    } catch (IOException e) {
      System.err.println("Error copying file: " + e.getMessage());
    }
  }
}

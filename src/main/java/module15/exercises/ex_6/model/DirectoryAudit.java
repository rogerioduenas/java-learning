package module15.exercises.ex_6.model;

import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class DirectoryAudit {

  private List<Path> diretories = new ArrayList<>();
  private List<Path> files = new ArrayList<>();

  public void addDiretories(Path diretories) {
    this.diretories.add(diretories);
  }

  public void addFiles(Path files) {
    this.files.add(files);
  }

  @Override
  public String toString() {
    return String.format("Diretories:%s%nFiles:%s", diretories, files);
  }
}

package module_15_io.lesson_167_information_about_file_path;

import java.io.File;

public class Program {
  public static void main(String[] args) {

    File path = new File("src/main/java/module15/lesson167informationaboutfilepath/Program.java");
    System.out.println(path.getPath());
    System.out.println(path.getParent());
    System.out.println(path.getName());
  }
}

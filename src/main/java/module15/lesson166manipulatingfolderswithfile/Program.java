package module15.lesson166manipulatingfolderswithfile;

import java.io.File;
import java.util.Scanner;

public class Program {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    File path = new File("src/main/java/module15/lesson166manipulatingfolderswithfile");

    File[] folders = path.listFiles(File::isDirectory);
    System.out.println("Folders");
    for (File folder : folders) {
      System.out.println(folder);
    }

    File[] files = path.listFiles(File::isFile);
    System.out.println("Files");
    for (File file : files) {
      System.out.println(file);
    }

    Boolean success = new File(path + "/created").mkdir();
    System.out.printf("Directory created: %b%n", success);

    sc.close();

  }
}

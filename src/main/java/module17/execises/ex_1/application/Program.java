package module17.execises.ex_1.application;

import module17.execises.ex_1.services.StorageService;

import java.util.NoSuchElementException;

public class Program {
  public static void main(String[] args) {
    StorageService<String> storageService = new StorageService<>();
    try {
      System.out.println(storageService.getFirst());
    } catch (NoSuchElementException e) {
      System.out.println(e.getMessage());
    }

      storageService.add("a");
      storageService.add("b");
      storageService.add("c");

      System.out.println(storageService.getFirst());
      System.out.println(storageService.getAll());

  }
}

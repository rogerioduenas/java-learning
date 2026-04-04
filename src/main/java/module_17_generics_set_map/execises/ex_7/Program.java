package module_17_generics_set_map.execises.ex_7;

public class Program {
  public static void main(String[] args) {

    Repository<String, String> repository = new Repository<>();

    repository.save("1", "A");
    repository.save("2", "B");
    repository.save("3", "C");

    System.out.println(repository.findById("1"));

    System.out.println(repository.findAll());
  }
}

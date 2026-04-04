package module_17_generics_set_map.execises.ex_12;

import module_17_generics_set_map.execises.ex_12.model.Course;
import module_17_generics_set_map.execises.ex_12.model.Student;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;

public class Program {
  public static void main(String[] args) throws IOException {

    Path path = Path.of("src/main/java/module17/execises/ex_12/student.csv");
    List<String> lines = Files.readAllLines(path);

    Map<String, Course> courseMap = new HashMap<>(Map.of(
        "Java", new Course("Java"),
        "Spring", new Course("Spring"),
        "React", new Course("React")));

    for (int i = 1; i < lines.size(); i++) {
      String[] fields = lines.get(i).split(",");
      String courseName = fields[0];
      Integer studentId = Integer.parseInt(fields[1]);

      Course targetCourse = courseMap.get(courseName);

      if (targetCourse != null) {
        targetCourse.addStudent(new Student(studentId));
      }
    }

    Set<Student> students = new HashSet<>();

    for (Course course : courseMap.values()) {
      students.addAll(course.getStudents());
    }

    System.out.println(students.size());
  }
}

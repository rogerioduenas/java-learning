package module15.exercises.ex_1;

import module15.exercises.ex_1.model.AccessLog;
import module15.exercises.ex_1.repository.LogReader;
import module15.exercises.ex_1.service.AccessLogService;

import java.util.List;


public class Program {
  public static void main(String[] args) {
    String path = "src/main/java/module15/exercises/ex_1/log.txt";

    LogReader logReader = new LogReader(path);
    AccessLogService accessLogService = new AccessLogService();

    List<String> lines = logReader.readAll();
    List<AccessLog> logs = accessLogService.parseLines(lines);

    accessLogService.listLogs(logs);
  }
}

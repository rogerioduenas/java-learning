package module15.exercises.ex_1.service;

import module15.exercises.ex_1.model.AccessLog;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class AccessLogService {

  public List<AccessLog> parseLines(List<String> lines) {
    List<AccessLog> logs = new ArrayList<>();

    for (String line : lines) {
      if (line == null || line.trim().isEmpty()) {
        continue;
      }

      String[] pt = line.split(";");

      if (pt.length == 3) {
        LocalDateTime dateTime = LocalDateTime.parse(pt[0]);
        String userId = pt[1];
        String resource = pt[2];
        logs.add(new AccessLog(dateTime, userId, resource));
      }
    }
    return logs;
  }

  public void listLogs(List<AccessLog> logs) {
    for (AccessLog accessLog : logs) {
      System.out.println(accessLog);
    }
  }
}

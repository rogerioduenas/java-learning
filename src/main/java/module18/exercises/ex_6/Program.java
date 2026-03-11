package module18.exercises.ex_6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Program {
  public static void main(String[] args) {
    List<SensorReading> readings = new ArrayList<>(Arrays.asList(
        new SensorReading("Turbine 01", 85.5),
        new SensorReading("Turbine 02", 80.2),
        new SensorReading("Turbine 03", 92.0),
        new SensorReading("Turbine 04", 125.8),
        new SensorReading("Turbine 05", 123.8)
    ));

    Double limitTemperature = 100.0;

    readings.stream()
        .filter(sensor -> sensor.getTemperature() > limitTemperature)
        .sorted(Comparator.comparingDouble(SensorReading::getTemperature).reversed())
        .forEach(System.out::println);
  }
}

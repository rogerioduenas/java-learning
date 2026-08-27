package module_09_constructors_this_overloading_encapsulation.exercises.ex_10.entities;

import utils.Validate;

public class AcademicRecord {
  private final String studentName;
  private final int registrationId;
  private double gpa;

  public AcademicRecord(String studentName, int registrationId, double gpa) {
    Validate.notBlank(studentName, "Name cannot be empty.");
    Validate.positive(registrationId, "Registration ID must be positive.");

    this.studentName = studentName;
    this.registrationId = registrationId;
    setGpa(gpa);
  }

  public AcademicRecord(String studentName, int registrationId) {
    this(studentName, registrationId, 0.0);
  }

  public AcademicRecord() {
    this("Unknown", 1, 0.0);
  }

  public String getStudentName() {
    return studentName;
  }

  public int getRegistrationId() {
    return registrationId;
  }

  public double getGpa() {
    return gpa;
  }

  public void setGpa(double gpa) {
    Validate.isTrue(gpa >= 0.0 && gpa <= 10.0, "GPA must be between 0.0 and 10.0.");
    this.gpa = gpa;
  }

  @Override
  public String toString() {
    return String.format("Name: %s %nID: %d %nGPA: %.2f%n", studentName, registrationId, gpa);
  }
}
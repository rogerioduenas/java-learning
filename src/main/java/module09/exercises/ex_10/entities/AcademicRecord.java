package module09.exercises.ex_10.entities;

public class AcademicRecord {
  private final String studentName;
  private final int registrationId;
  private double gpa;

  public AcademicRecord(String studentName, int registrationId, double gpa) {
    if (studentName == null || studentName.trim().isEmpty()) {
      throw new IllegalArgumentException("Name cannot be empty.");
    }

    this.studentName = studentName;
    this.registrationId = registrationId;
    validateGpa(gpa);
    this.gpa = gpa;
  }

  public AcademicRecord(String studentName, int registrationId) {
    this(studentName, registrationId, 0);
  }

  public AcademicRecord() {
    this("Unknown", 0, 0);
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
    validateGpa(gpa);
    this.gpa = gpa;
  }

  private void validateGpa(double gpa) {
    if (gpa < 0 || gpa > 10) {
      throw new IllegalArgumentException("GPA must be between 0 and 10.");
    }
  }

  public String toString() {
    return String.format("Name: %s %nID: %d %nGPA: %.2f%n", studentName, registrationId, gpa);
  }
}

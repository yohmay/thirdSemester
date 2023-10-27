

public class Student extends Person {

  private String registration;

  Student(String name, String registration, String documents) {
    this.setName(name);
    this.setDocument(document);
    this.registration = registration;
  }

  private void setDocument(String document) {}

  public String getregistration() {
    return registration;
  }

  public void setRegistration(String registration) {
    this.registration = registration;
  }
}

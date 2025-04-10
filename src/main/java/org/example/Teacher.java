package org.example;

public class Teacher implements Prototype<Teacher> {

  private String name;
  private String email;
  private int age;
  private String address;

  public Teacher(String name, String email, int age, String address) {
    this.name = name;
    this.email = email;
    this.age = age;
    this.address = address;
  }

  public Teacher(){}

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  @Override
  public String toString() {
    return "Teacher{" +
        "name='" + name + '\'' +
        ", email='" + email + '\'' +
        ", age=" + age +
        ", address='" + address + '\'' +
        '}';
  }

  @Override
  public Teacher clone() {
    try {
      Teacher clone = (Teacher) super.clone();
      // TODO: copy mutable state here, so the clone can't change the internals of the original
      return clone;
    } catch (CloneNotSupportedException e) {
      throw new AssertionError();
    }
  }
}

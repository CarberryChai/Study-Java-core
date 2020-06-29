package com.company;

public class Student extends Person {
  private String major;

  public Student(String name, String major) {
    super(name);
    this.major = major;
  }

  public static void main(String[] args) {
    Person[] people = new Person[2];
    people[0] = new Employee("cc", 5000.0, 2019, 7, 8);
    people[1] = new Student("mia", "computer science");
    for (Person p : people) {
      System.out.println(p.getDescription());
    }
  }

  @Override
  public String getDescription() {
    return "A student majoring in " + major;
  }
}

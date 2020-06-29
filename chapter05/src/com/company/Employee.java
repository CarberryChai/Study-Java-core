package com.company;

import java.time.LocalDate;

public class Employee extends Person implements Comparable<Employee> {
  private Double salary;
  private LocalDate hireDay;

  public Employee(String name, Double salary, int year, int month, int day) {
    super(name);
    this.salary = salary;
    this.hireDay = LocalDate.of(year, month, day);
  }

  @Override
  public String getDescription() {
    return String.format("%s get the salary of %.2f", super.getName(), getSalary());
  }

  public Double getSalary() {
    return salary;
  }

  public LocalDate getHireDay() {
    return hireDay;
  }

  public void raiseSalary(int byPercent) {
    double raise = this.salary * byPercent / 100;
    this.salary += raise;
  }

  @Override
  public int compareTo(Employee e) {
    return Double.compare(this.salary, e.salary);
  }

  @Override
  public String toString() {
    return this.getName() + ", His salary is " + this.getSalary();
  }
}

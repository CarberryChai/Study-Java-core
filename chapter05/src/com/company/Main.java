package com.company;

import java.util.Arrays;

public class Main {
  public static void main(String[] args) {
    Employee[] employees = new Employee[3];
    Manager boss = new Manager("Mia", 5000.0, 2018, 9, 20);
    boss.setBonus(10000.0);
    employees[0] = boss;
    employees[1] = new Employee("Carberry", 1000.0, 2019, 6, 20);
    employees[2] = new Employee("Candy", 3500.0, 2019, 1, 20);
    Arrays.sort(employees);
    for (Employee e : employees) {
      System.out.println(e.getName() + ", His salary is " + e.getSalary());
    }
  }
}

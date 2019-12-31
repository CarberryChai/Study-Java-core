package com.company;

import java.util.*;

@FunctionalInterface
interface IntCall {
  int call(int arg);
}

public class Main {
  static IntCall foo;

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
    System.out.println(sum(1, 2, 3, 4));
    // n的阶乘
    foo = n -> n == 0 ? 1 : n * foo.call(n - 1);
    System.out.println(foo.call(4));
  }

  public static int sum(int... nums) {
    int result = 0;
    for (int num : nums) {
      result += num;
    }
    return result;
  }
}

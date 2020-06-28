package com.company;

public class Manager extends Employee {
  public static int num = 1;
  private double bonus;

  public Manager(String name, Double salary, int year, int month, int day) {
    super(name, salary, year, month, day);
    this.bonus = 0;
  }

  public void setBonus(double bonus) {
    this.bonus = bonus;
  }

  @Override
  public Double getSalary() {
    double base = super.getSalary();
    return base + this.bonus;
  }
}

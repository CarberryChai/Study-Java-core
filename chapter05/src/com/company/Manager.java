package com.company;

public class Manager extends Employee {
  private double bonus;

  public Manager(String name, Double salary, int year, int month, int day) {
    super(name, salary, year, month, day);
    this.bonus = 0;
  }

  public void setBonus(double bonus) {
    this.bonus = bonus;
  }

  public static void main(String[] args) {
    Manager cc = new Manager("cc", 1000.9, 2000, 5, 18);
    cc.setBonus(5000);
    System.out.println(cc.getSalary());
  }

  @Override
  public Double getSalary() {
    double base = super.getSalary();
    return base + this.bonus;
  }
}

package com.company;

public class Manager extends Employee{
    private double bonus;

    public Manager(String name, Double salary, int year, int month, int day) {
        super(name, salary, year, month, day);
        this.bonus = 0;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }
    public Double getSalary(){
        double base = super.getSalary();
        return base + this.bonus;
    }
}

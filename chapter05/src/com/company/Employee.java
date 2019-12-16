package com.company;

import java.time.LocalDate;

public class Employee {
    private String name;
    private Double salary;
    private LocalDate hireDay;

    public Employee(String name, Double salary, int year, int month, int day) {
        this.name = name;
        this.salary = salary;
        this.hireDay = LocalDate.of(year, month, day);
    }

    public String getName() {
        return name;
    }

    public Double getSalary() {
        return salary;
    }

    public LocalDate getHireDay() {
        return hireDay;
    }
    public void raiseSalary(int byPercent){
        double raise = this.salary * byPercent / 100;
        this.salary += raise;
    }
}

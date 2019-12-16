package com.company;

import java.time.LocalDate;
import java.time.DayOfWeek;

public class Calendar {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        int month = date.getMonthValue();
        int day = date.getDayOfMonth();

        date = date.minusDays(day - 1);
        DayOfWeek weekDay = date.getDayOfWeek();
        int value = weekDay.getValue();
        System.out.println("Mon Tue Wen Thu Fri Sat Sun");
        for (int i = 1; i < value; i++) System.out.print("    ");
        while (date.getMonthValue() == month) {
            System.out.printf("%3d", date.getDayOfMonth());
            if (date.getDayOfMonth() == day) {
                System.out.print("*");
            } else {
                System.out.print(" ");
            }
            date = date.plusDays(1);
            if (date.getDayOfWeek().getValue() == 1) System.out.println();
        }
    }
}
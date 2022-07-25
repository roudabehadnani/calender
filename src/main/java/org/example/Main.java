package org.example;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        System.out.println("----------Calender----------");
        System.out.print("Input the year by format of YYYY-MM-DD: ");

        Scanner scanner = new Scanner(System.in);
        LocalDate inputYear = LocalDate.parse(scanner.nextLine());
        System.out.println("Is it a leap year? " + inputYear.isLeapYear());


        Scanner sc = new Scanner(System.in);
        System.out.println("Enter month in number between 1 and 12: ");
        int monthNum = sc.nextInt();
        for (Months m : Months.values()) {
            if (m.getMonthNumber() == monthNum) {
                System.out.println("Month:------ " + m.getName() + "-------");
            }
        }

        LocalDate date = LocalDate.of(inputYear.getYear(), monthNum,1);


        if (monthNum == 1) {
            for (int i = 0; i < Months.JANUARY.getDay(); i++) {
                LocalDate day = date.plusDays(i);
//                LocalDate a = inputYear.plus(Period.ofDays(i));
                System.out.println(day + "    "  + day.getDayOfWeek());
            }
        }

        if (monthNum == 2) {
            if(!inputYear.isLeapYear()){
                for (int i = 0; i < Months.FEBRUARY.getDay(); i++) {
                    LocalDate day = date.plusDays(i);
                    System.out.println(day + "    " + day.getDayOfWeek());
                }
            }else{
                for (int i = 0; i < Months.FEBRUARY.dayChange(); i++) {
                    LocalDate day = date.plusDays(i);
                    System.out.println(day + "    " + day.getDayOfWeek());
                }
            }
        }

        if (monthNum == 3) {
            for (int i = 0; i < Months.MARCH.getDay(); i++) {
                LocalDate day = date.plusDays(i);
                System.out.println(day + "    " + day.getDayOfWeek());
            }
        }

        if (monthNum == 4) {
            for (int i = 0; i < Months.APRIL.getDay(); i++) {
                LocalDate day = date.plusDays(i);
                System.out.println(day + "    " + day.getDayOfWeek());
            }
        }

        if (monthNum == 5) {
            for (int i = 0; i < Months.MAY.getDay(); i++) {
                LocalDate day = date.plusDays(i);
                System.out.println(day + "    " + day.getDayOfWeek());
            }
        }

        if (monthNum == 6) {
            for (int i = 0; i < Months.JUNE.getDay(); i++) {
                LocalDate day = date.plusDays(i);
                System.out.println(day + "    " + day.getDayOfWeek());
            }
        }

        if (monthNum == 7) {
            for (int i = 0; i < Months.JULY.getDay(); i++) {
                LocalDate day = date.plusDays(i);
                System.out.println(day + "    " + day.getDayOfWeek());
            }
        }

        if (monthNum == 8) {
            for (int i = 0; i < Months.AUGUST.getDay(); i++) {
                LocalDate day = date.plusDays(i);
                System.out.println(day + "    " + day.getDayOfWeek());
            }
        }

        if (monthNum == 9) {
            for (int i = 0; i < Months.SEPTEMBER.getDay(); i++) {
                LocalDate day = date.plusDays(i);
                System.out.println(day + "    " + day.getDayOfWeek());
            }
        }

        if (monthNum == 10) {
            for (int i = 0; i < Months.OCTOBER.getDay(); i++) {
                LocalDate day = date.plusDays(i);
                System.out.println(day + "    " + day.getDayOfWeek());
            }
        }

        if (monthNum == 11) {
            for (int i = 0; i < Months.NOVEMBER.getDay(); i++) {
                LocalDate day = date.plusDays(i);
                System.out.println(day + "    " + day.getDayOfWeek());
            }
        }

        if (monthNum == 12) {
            for (int i = 0; i < Months.DECEMBER.getDay(); i++) {
                LocalDate day = date.plusDays(i);
                System.out.println(day + "    " + day.getDayOfWeek());
            }
        }
        
    }
}
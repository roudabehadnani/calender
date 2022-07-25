package org.example;


public enum Months {
    JANUARY ("January", 31,1),

    FEBRUARY("February", 28,2),
    MARCH("March", 31,3),
    APRIL("April", 30,4),
    MAY("May", 31,5 ),
    JUNE("June", 30,6),
    JULY("July", 31,7),
    AUGUST("August", 31,8),
    SEPTEMBER("September", 30,9),
    OCTOBER ("October", 31,10),
    NOVEMBER ("November", 30,11),
    DECEMBER ("December", 31,12);


    private final String name;
    private final int day;
    private final int monthNumber;

    Months(String name, int day, int monthNumber) {
        this.name = name;
        this.day = day;
        this.monthNumber = monthNumber;
    }

    public String getName() {
        return name;
    }

    public int getDay() {
        return day;
    }

    public int getMonthNumber() {
        return monthNumber;
    }

    public int dayChange(){
     int i = FEBRUARY.getDay();
     i = 29;
     return i;
    }
}

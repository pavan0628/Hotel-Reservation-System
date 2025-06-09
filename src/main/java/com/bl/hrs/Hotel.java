package com.bl.hrs;

public class Hotel {
    private String name;
    private int weekdayRateRegular;
    private int weekendRateRegular;

    public Hotel(String name, int weekdayRateRegular, int weekendRateRegular) {
        this.name = name;
        this.weekdayRateRegular = weekdayRateRegular;
        this.weekendRateRegular = weekendRateRegular;
    }

    public String getName() {
        return name;
    }

    public int getWeekdayRateRegular() {
        return weekdayRateRegular;
    }

    public int getWeekendRateRegular() {
        return weekendRateRegular;
    }

    @Override
    public String toString() {
        return "Hotel{name='" + name + "', weekdayRateRegular=" + weekdayRateRegular +
                ", weekendRateRegular=" + weekendRateRegular + '}';
    }

}

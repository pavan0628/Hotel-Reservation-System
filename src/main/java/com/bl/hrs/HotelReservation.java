package com.bl.hrs;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class HotelReservation {
    private List<Hotel> hotels=new ArrayList<>();
    private static final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("ddMMMyyyy", Locale.ENGLISH);

    public static void main(String[] args) {
        //printing welecome message
        System.out.println("Welcome to Hotel Reservation Problem!");
    }
    public void addHotel(String name, int weekdayRate, int weekendRate) {
        Hotel hotel = new Hotel(name, weekdayRate, weekendRate);
        hotels.add(hotel);
    }
    public Hotel findCheapestHotel(List<String> dateStrings){
        Map<Hotel,Integer> hotelTotalRates=new HashMap<>();
        for(Hotel hotel:hotels){
            Integer total=0;
            for(String datestr:dateStrings){
                LocalDate localDate=LocalDate.parse(datestr, formatter);
                DayOfWeek day=localDate.getDayOfWeek();
                boolean isWeekend=(day==DayOfWeek.SATURDAY)||(day==DayOfWeek.SUNDAY);
                total=total+((isWeekend)? hotel.getWeekendRateRegular() : hotel.getWeekdayRateRegular());
            }
            hotelTotalRates.put(hotel, total);
        }
        Hotel cheapestHotel=null;
        int minRate=Integer.MAX_VALUE;
        for(Map.Entry<Hotel,Integer> entry:hotelTotalRates.entrySet()){
            if(entry.getValue()<minRate) {
                minRate = entry.getValue();
                cheapestHotel=entry.getKey();
            }
        }
        System.out.println("The cheapest rate is "+minRate);
        return cheapestHotel;
    }



    public List<Hotel> getHotels() {
        return hotels;
    }

}

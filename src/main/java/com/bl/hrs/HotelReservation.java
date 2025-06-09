package com.bl.hrs;

import java.util.*;

public class HotelReservation {
    private List<Hotel> hotels=new ArrayList<>();
    public static void main(String[] args) {
        //printing welecome message
        System.out.println("Welcome to Hotel Reservation Problem!");
    }
    public void addHotel(String name, int weekdayRate, int weekendRate) {
        Hotel hotel = new Hotel(name, weekdayRate, weekendRate);
        hotels.add(hotel);
    }

    public List<Hotel> getHotels() {
        return hotels;
    }

}

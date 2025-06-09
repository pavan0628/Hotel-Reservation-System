package com.bl.hrs;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
class HotelReservationTest {
    HotelReservation system = new HotelReservation();
    @Test
    public void testAddHotel() {

        system.addHotel("Lakewood", 110, 90);

        assertEquals(1, system.getHotels().size());

        Hotel hotel = system.getHotels().get(0);
        assertEquals("Lakewood", hotel.getName());
        assertEquals(110, hotel.getWeekdayRateRegular());
        assertEquals(90, hotel.getWeekendRateRegular());
    }
    @Test
    public void testFindCheapestHotel(){
        system.addHotel("Lakewood", 110, 90);   // total: 110 + 110 = 220
        system.addHotel("Bridgewood", 160, 60); // total: 160 + 160 = 320
        system.addHotel("Ridgewood", 220, 150); // total: 220 + 220 = 44

        assertEquals("Lakewood" ,system.findCheapestHotel(Arrays.asList("10Sep2020", "11Sep2020")).getName());
    }

    @Test
    public void testAddHotelswithDifferentRates(){

        system.addHotel("Lakewood", 110, 90);
        system.addHotel("Bridgewood", 150, 50);
        system.addHotel("Ridgewood", 220, 150);

        List<Hotel> hotels=system.getHotels();

        assertEquals(3, hotels.size());

        assertEquals("Lakewood", hotels.get(0).getName());
        assertEquals(110, hotels.get(0).getWeekdayRateRegular());
        assertEquals(90, hotels.get(0).getWeekendRateRegular());

        assertEquals("Bridgewood", hotels.get(1).getName());
        assertEquals(150, hotels.get(1).getWeekdayRateRegular());
        assertEquals(50, hotels.get(1).getWeekendRateRegular());

        assertEquals("Ridgewood", hotels.get(2).getName());
        assertEquals(220, hotels.get(2).getWeekdayRateRegular());
        assertEquals(150, hotels.get(2).getWeekendRateRegular());

    }
  
}
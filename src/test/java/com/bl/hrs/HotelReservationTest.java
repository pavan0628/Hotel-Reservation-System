package com.bl.hrs;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

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
  
}
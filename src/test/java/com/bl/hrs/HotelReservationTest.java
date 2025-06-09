package com.bl.hrs;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class HotelReservationTest {

    @Test
    public void testAddHotel() {
        HotelReservation system = new HotelReservation();
        system.addHotel("Lakewood", 110, 90);

        assertEquals(1, system.getHotels().size());

        Hotel hotel = system.getHotels().get(0);
        assertEquals("Lakewood", hotel.getName());
        assertEquals(110, hotel.getWeekdayRateRegular());
        assertEquals(90, hotel.getWeekendRateRegular());
    }
  
}
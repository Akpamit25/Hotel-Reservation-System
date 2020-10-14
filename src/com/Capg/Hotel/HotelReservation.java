package com.Capg.Hotel;

import java.util.ArrayList;
import java.util.List;

public class HotelReservation {

	public static List<Hotel> hotelList = new ArrayList<Hotel>();

	public static void addRegularRateAndHotelName(String hotelName, int regularRate) {
		Hotel hotel = new Hotel(hotelName, regularRate);
		hotelList.add(hotel);
	}

}

package com.Capg.Hotel;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class HotelReservation {

	public static List<Hotel> hotelList = new ArrayList<Hotel>();

	public static void addRateAndHotelName(String hotelName, int weeklyRate, int weekEndRate) {
		Hotel hotel = new Hotel(hotelName, weeklyRate, weekEndRate);
		hotelList.add(hotel);
	}

	public static void findCheapestHotel(String startDate, String endDate) {
		LocalDate start = LocalDate.parse(startDate);
		LocalDate end = LocalDate.parse(endDate);

		Hotel cheapestHotel = null;
		int minRate = 1000000;

		for (Hotel hotel : hotelList) {
			LocalDate tempStart = start;
			LocalDate tempEnd = end.plusDays(1);
			int hotelRent = 0;
			while (!(tempStart.equals(tempEnd))) {
				hotelRent = hotelRent + hotel.getWeeklyRate();
				tempStart = tempStart.plusDays(1);
			}
			if (hotelRent < minRate) {
				minRate = hotelRent;
				cheapestHotel = hotel;
			}

		}
		System.out.println("The Cheapest option is: ");
		System.out.println(cheapestHotel.getHotelName() + ", total rent :- " + minRate);

	}

}
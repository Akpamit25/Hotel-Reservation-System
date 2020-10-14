package com.Capg.Hotel;

import java.time.DayOfWeek;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class HotelReservation {

	public static List<Hotel> hotelList = new ArrayList<Hotel>();

	public static void addRateAndHotelName(String hotelName, int rating, int weeklyRate, int weekEndRate) {
		Hotel hotel = new Hotel(hotelName, rating, weeklyRate, weekEndRate);
		hotelList.add(hotel);
	}

	public static void findCheapestHotel(String startDate, String endDate) {
		LocalDate start = LocalDate.parse(startDate);
		LocalDate end = LocalDate.parse(endDate);

		LocalDate tempStart = start;
		LocalDate tempEnd = end;

		List<Hotel> cheapestHotelList = new ArrayList<>();
		int minRate = 1000000000;

		for (Hotel hotel : hotelList) {
			start = tempStart;
			end = tempEnd.plusDays(1);
			int hotelRent = 0;
			while (!(start.equals(end))) {

				int day = start.getDayOfWeek().getValue();

				if (day == 6 || day == 7)
					hotelRent = hotelRent + hotel.getWeekEndRate();

				else
					hotelRent = hotelRent + hotel.getWeeklyRate();

				start = start.plusDays(1);

			}
			if (hotelRent <= minRate) {
				minRate = hotelRent;
				if (hotelRent < minRate) {
					if (cheapestHotelList.size() == 0)
						cheapestHotelList.add(hotel);

					else {
						cheapestHotelList.clear();
						cheapestHotelList.add(hotel);
					}

				} else
					cheapestHotelList.add(hotel);
			}

		}
		System.out.println("The Cheapest option is");
		for (Hotel hotel : cheapestHotelList) {
			System.out.println(hotel.getHotelName() + ", total rent :- " + minRate);

		}

	}

	public static void findCheapestBestRatedHotel(String startDate, String endDate) {
		LocalDate start = LocalDate.parse(startDate);
		LocalDate end = LocalDate.parse(endDate);

		LocalDate tempStart = start;
		LocalDate tempEnd = end;

		Hotel cheapestHotel = null;
		int minRate = 1000000000;
		int bestRating = 0;

		for (Hotel hotel : hotelList) {
			start = tempStart;
			end = tempEnd.plusDays(1);
			int hotelRent = 0;
			while (!(start.equals(end))) {

				int day = start.getDayOfWeek().getValue();

				if (day == 6 || day == 7)
					hotelRent = hotelRent + hotel.getWeekEndRate();

				else
					hotelRent = hotelRent + hotel.getWeeklyRate();

				start = start.plusDays(1);

			}
			if (hotelRent < minRate) {
				minRate = hotelRent;
				cheapestHotel = hotel;
				bestRating = hotel.getRating();
			}

			if (hotelRent == minRate && hotel.getRating() > bestRating) {
				bestRating = hotel.getRating();
				cheapestHotel = hotel;
			}

		}
		System.out.println("The Cheapest option is");
		System.out.println(cheapestHotel.getHotelName() + ", rating :- " + cheapestHotel.getRating()
				+ ", total rent :- " + minRate);

	}

	public static void findBestRatedHotel(String startDate, String endDate) {
		LocalDate start = LocalDate.parse(startDate);
		LocalDate end = LocalDate.parse(endDate);

		LocalDate tempStart = start;
		LocalDate tempEnd = end;

		Hotel cheapestHotel = null;
		int minRate = 1000000000;
		int bestRating = 0;

		for (Hotel hotel : hotelList) {
			start = tempStart;
			end = tempEnd.plusDays(1);
			int hotelRent = 0;
			while (!(start.equals(end))) {

				int day = start.getDayOfWeek().getValue();

				if (day == 6 || day == 7)
					hotelRent = hotelRent + hotel.getWeekEndRate();

				else
					hotelRent = hotelRent + hotel.getWeeklyRate();

				start = start.plusDays(1);

			}
			if (hotel.getRating() > bestRating) {
				bestRating = hotel.getRating();
				minRate = hotelRent;
				cheapestHotel = hotel;
			}

		}
		System.out.println("The Best Rated option is");
		System.out.println(cheapestHotel.getHotelName() + ", rating :- " + cheapestHotel.getRating()
				+ ", total rent :- " + minRate);

	}
}
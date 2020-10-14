package com.Capg.Hotel;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		System.out.println("Welcome to Hotel Reservation Program");

		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.println("Enter the hotel name for adding rates: ");
			String hotelName = sc.next();
			System.out.println("Enter rating: ");
			int rating = sc.nextInt();
			System.out.println("Enter the Weekly rate: ");
			int weeklyRate = sc.nextInt();
			System.out.println("Enter the WeekEnd rate: ");
			int weekEndRate = sc.nextInt();
			HotelReservation.addRateAndHotelName(hotelName, rating, weeklyRate, weekEndRate);
			System.out.println("Add more hotel- (Yes/No)");
			String choice = sc.next();
			if (choice.equalsIgnoreCase("Yes"))
				continue;
			else
				break;
		}

		System.out.println("Find Cheapest Hotel in Date Range:- ");
		System.out.println("Enter Start Date(YYYY-MM-DD):- ");
		String startDate = sc.next();
		System.out.println("Enter End Date(YYYY-MM-DD):- ");
		String endDate = sc.next();
		HotelReservation.findCheapestHotel(startDate, endDate);

		sc.close();
	}

}
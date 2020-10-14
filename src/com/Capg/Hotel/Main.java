package com.Capg.Hotel;

import java.util.Date;
import java.util.Scanner;
import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class Main {

	private static boolean isThisDateValid(String date) {
		try {
			LocalDate.parse(date, DateTimeFormatter.ISO_DATE);
		} catch (DateTimeParseException e) {
			return false;
		}
		return true;
	}

	public static void main(String[] args) throws Exception {

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
			System.out.println("Enter the Weekly Reward rate: ");
			int weeklyRateReward = sc.nextInt();
			System.out.println("Enter the WeekEnd Reward rate: ");
			int weekEndRateReward = sc.nextInt();
			HotelReservation.addRateAndHotelName(hotelName, rating, weeklyRate, weekEndRate, weeklyRateReward,
					weekEndRateReward);
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

		System.out.println("Find Best Rated Hotel in Date Range:- ");
		System.out.println("Enter Start Date(YYYY-MM-DD):- ");
		String startD = sc.next();
		System.out.println("Enter End Date(YYYY-MM-DD):- ");
		String endD = sc.next();
		HotelReservation.findBestRatedHotel(startD, endD);

		System.out.println("Find Cheapest Best Rated Hotel for Customers in Date Range:- ");
		System.out.println("Enter Start Date(YYYY-MM-DD):- ");
		String start = sc.next();
		boolean startValidate = isThisDateValid(start);
		System.out.println("Enter End Date(YYYY-MM-DD):- ");
		String end = sc.next();
		boolean endValidate = isThisDateValid(end);

		if (!(startValidate && endValidate))
			throw new Exception("Invalid date");

		System.out.println("Enter the type of customer (Regular/Reward)");
		String customer = sc.next();
		if (customer.equalsIgnoreCase("Regular"))
			HotelReservation.findCheapestBestRatedHotel(start, end);

		else if (customer.equalsIgnoreCase("Reward"))
			HotelReservation.findCheapestBestRatedHotelWithRewardRates(startD, endD);

		else
			throw new Exception("Wrong Customer type");

		sc.close();
	}
}
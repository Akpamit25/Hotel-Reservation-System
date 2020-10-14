package com.Capg.Hotel;

public class Hotel {

	private String hotelName;
	private int weeklyRate;
	private int weekEndRate;

	public Hotel(String hotelName, int weeklyRate, int weekEndRate) {
		this.hotelName = hotelName;
		this.weeklyRate = weeklyRate;
		this.weekEndRate = weekEndRate;

	}

	public void setHotelName(String hotelName) {
		this.hotelName = hotelName;
	}

	public String getHotelName() {
		return hotelName;
	}

	public void setWeeklyRate(int weeklyRate) {
		this.weeklyRate = weeklyRate;
	}

	public int getWeeklyRate() {
		return weeklyRate;
	}

	public void setWeekEndRate(int weekEndRate) {
		this.weekEndRate = weekEndRate;
	}

	public int getWeekEndRate() {
		return weekEndRate;
	}
}
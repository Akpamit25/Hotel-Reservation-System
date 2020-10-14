package com.Capg.Hotel;

public class Hotel {

	private String hotelName;
	private int rating;
	private int weeklyRate;
	private int weekEndRate;
	private int weeklyRateReward;
	private int weekEndRateReward;

	public Hotel(String hotelName, int rating, int weeklyRate, int weekEndRate, int weeklyRateReward,
			int weekEndRateReward) {
		this.hotelName = hotelName;
		this.rating = rating;
		this.weeklyRate = weeklyRate;
		this.weekEndRate = weekEndRate;
		this.weeklyRateReward = weeklyRateReward;
		this.weekEndRateReward = weekEndRateReward;
	}

	public void setHotelName(String hotelName) {
		this.hotelName = hotelName;
	}

	public String getHotelName() {
		return hotelName;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

	public int getRating() {
		return rating;
	}

	public void setWeeklyRate(int weeklyRate) {
		this.weeklyRate = weeklyRate;
	}

	public int getWeeklyRate() {
		return weeklyRate;
	}

	public void setWeekEndRate(int weekEndRate) {
		this.weekEndRate = weekEndRate;//
	}

	public int getWeekEndRate() {
		return weekEndRate;
	}

	public void setWeeklyRateReward(int weeklyRateReward) {
		this.weeklyRateReward = weeklyRateReward;
	}

	public int getWeeklyRateReward() {
		return weeklyRateReward;
	}

	public void setWeekEndRateReward(int weekEndRateReward) {
		this.weekEndRateReward = weekEndRateReward;
	}

	public int getWeekEndRateReward() {
		return weekEndRateReward;
	}
}
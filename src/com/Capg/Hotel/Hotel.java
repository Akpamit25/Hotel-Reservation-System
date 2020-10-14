package com.Capg.Hotel;

public class Hotel {

	private String hotelName;
	private int regularRate;

	public Hotel(String hotelName, int regularRate) {
		this.hotelName = hotelName;
		this.regularRate = regularRate;
	}

	public void setHotelName(String hotelName) {
		this.hotelName = hotelName;
	}

	public String getHotelName() {
		return hotelName;
	}

	public void setRegularRate(int regularRate) {
		this.regularRate = regularRate;
	}

	public int getRegularRate() {
		return regularRate;
	}
}

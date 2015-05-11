package com.tw.case1.hotel.impl;

import com.tw.case1.commons.DiscountCategoryEnum;
import com.tw.case1.hotel.IHotel;

import java.util.Map;

public class HotelImpl implements IHotel {

	private String hotelName;
	private Map<DiscountCategoryEnum,Integer> expense;
	private int rating;

	public HotelImpl(String hotelName, Map<DiscountCategoryEnum, Integer> expense, int rating) {
		this.hotelName = hotelName;
		this.expense = expense;
		this.rating = rating;
	}

	@Override
	public String getName() {
		return this.hotelName;
	}

	@Override
	public int getRating() {
		return rating;
	}

	public Map<DiscountCategoryEnum, Integer> getExpense() {
		return expense;
	}
}

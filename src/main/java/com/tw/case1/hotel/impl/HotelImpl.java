package com.tw.case1.hotel.impl;

import com.tw.case1.commons.DiscountCategoryEnum;
import com.tw.case1.customer.ICustomer;
import com.tw.case1.hotel.IHotel;
import com.tw.case1.strategy.IStrategy;
import com.tw.case1.strategy.StrategyFactory;

import java.util.List;
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

	@Override
	public void setName(String name) {
		this.hotelName = name;
	}
	
	public void printInfo(){
		System.out.println("name : " + this.hotelName);
		System.out.println("rating : " + this.rating);
	}

	public void setExpense(Map<DiscountCategoryEnum, Integer> expense) {
		this.expense = expense;
	}

	public Map<DiscountCategoryEnum, Integer> getExpense() {
		return expense;
	}
}

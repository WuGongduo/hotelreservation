package com.tw.case1.customer.impl;

import com.tw.case1.customer.ICustomer;
import com.tw.case1.hotel.IHotel;
import com.tw.case1.strategy.IStrategy;
import com.tw.case1.strategy.StrategyFactory;

import java.util.Date;
import java.util.List;

public class CustomerImpl implements ICustomer {

	private String customerType;

	private List<Date> stayDays;

	private int sumRate;

	private IHotel hotel;


	public CustomerImpl() {
	}

	public CustomerImpl(String customerType) {
		this.customerType = customerType;
	}

	@Override
	public String getCustomerType() {
		return customerType;
	}

	@Override
	public void setCustomerType(String type) {
		this.customerType = type;
	}

	public List<Date> getStayDays() {
		return stayDays;
	}

	public void setStayDays(List<Date> stayDays) {
		this.stayDays = stayDays;
	}

	public IHotel getHotel() {
		return hotel;
	}

	public void setHotel(IHotel hotel) {
		this.hotel = hotel;
	}

	public int getSumRate() {
		return sumRate;
	}

	public void addSumRate(Date stayDay, IHotel hotel){
		IStrategy chargeStrategy = StrategyFactory.getStrategy(stayDay,this);
		this.sumRate += chargeStrategy.getRate(hotel);
	}

	@Override
	public int calculateCustomerCostByDays(IHotel hotel){
		sumRate = 0;
		for(Date stayDay : stayDays){
			addSumRate(stayDay, hotel);
		}
		return sumRate;
	}

}

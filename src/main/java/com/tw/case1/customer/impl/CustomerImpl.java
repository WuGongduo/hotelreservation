package com.tw.case1.customer.impl;

import com.tw.case1.customer.ICustomer;
import com.tw.case1.hotel.IHotel;
import com.tw.case1.strategy.IStrategy;
import com.tw.case1.strategy.StrategyFactory;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CustomerImpl implements ICustomer {

	private String customerType;

	private List<Date> stayDays = new ArrayList<Date>();

	private int sumRate;

	public CustomerImpl(String customerType, List<Date> stayDays) {
		this.customerType = customerType;
		this.stayDays = stayDays;
	}

	@Override
	public String getCustomerType() {
		return customerType;
	}

	@Override
	public int calculateCustomerCostByDays(IHotel hotel){
		sumRate = 0;
		for(Date stayDay : stayDays){
			sumRate = sumRate + getCostByDay(stayDay, hotel);
		}
		return sumRate;
	}

	private int getCostByDay(Date stayDay, IHotel hotel){
		IStrategy chargeStrategy = StrategyFactory.getStrategy(stayDay,this);
		return chargeStrategy.getRate(hotel);
	}

}

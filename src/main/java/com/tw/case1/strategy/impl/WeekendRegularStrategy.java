package com.tw.case1.strategy.impl;

import com.tw.case1.hotel.IHotel;
import com.tw.case1.strategy.IStrategy;

import static com.tw.case1.commons.DiscountCategoryEnum.WEEKEND_REGULAR;

public class WeekendRegularStrategy implements IStrategy{
	
	@Override
	public int getRate(IHotel hotel) {
		return hotel.getExpense().get(WEEKEND_REGULAR);
	}

}

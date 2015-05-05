package com.tw.case1.strategy.strategy;

import com.tw.case1.commons.DiscountCategoryEnum;
import com.tw.case1.hotel.IHotel;
import com.tw.case1.strategy.IStrategy;

public class WeekendRegularStrategy implements IStrategy{

	public WeekendRegularStrategy() {
	}
	
	@Override
	public int getRate(IHotel hotel) {
		return hotel.getExpense().get(DiscountCategoryEnum.WEEKEND_REGULAR);
	}

}

package com.tw.case1.strategy.impl;

import com.tw.case1.hotel.IHotel;
import com.tw.case1.strategy.IStrategy;

import static com.tw.case1.commons.DiscountCategoryEnum.WEEKDAY_REWARDS;

public class WeekdayRewardsStrategy implements IStrategy {

	@Override
	public int getRate(IHotel hotel) {
		return hotel.getExpense().get(WEEKDAY_REWARDS);
	}

}

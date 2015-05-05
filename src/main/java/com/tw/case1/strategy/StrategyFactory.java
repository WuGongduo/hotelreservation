package com.tw.case1.strategy;

import com.tw.case1.commons.Common;
import com.tw.case1.commons.CustomerTypeEnum;
import com.tw.case1.customer.ICustomer;
import com.tw.case1.strategy.strategy.WeekdayRegularStrategy;
import com.tw.case1.strategy.strategy.WeekdayRewardsStrategy;
import com.tw.case1.strategy.strategy.WeekendRegularStrategy;
import com.tw.case1.strategy.strategy.WeekendRewardsStrategy;

import java.util.Date;

public class StrategyFactory {

	public static IStrategy getStrategy(Date day, ICustomer customer) {

		if (isWeekday(day)) {
			if (CustomerTypeEnum.REGULAR.equals(customer.getCustomerType())) {
				return new WeekdayRegularStrategy();
			} else {
				return new WeekdayRewardsStrategy();
			}
		} else {
			if (CustomerTypeEnum.REGULAR.equals(customer.getCustomerType())) {
				return new WeekendRegularStrategy();
			} else {
				return new WeekendRewardsStrategy();

			}
		}
	}

	private static boolean isWeekday(Date day) {

		if (Common.WEEKDAY_ARRAY.contains(Common.getDayOfWeek(day))) {
			return true;
		}
		return false;
	}
}

package com.tw.case1.strategy;

import com.tw.case1.customer.ICustomer;
import com.tw.case1.strategy.impl.WeekdayRegularStrategy;
import com.tw.case1.strategy.impl.WeekdayRewardsStrategy;
import com.tw.case1.strategy.impl.WeekendRegularStrategy;
import com.tw.case1.strategy.impl.WeekendRewardsStrategy;

import java.util.Date;

import static com.tw.case1.commons.Common.isWeekend;
import static com.tw.case1.commons.CustomerTypeEnum.REGULAR;

public class StrategyFactory {

	public static IStrategy getStrategy(Date day, ICustomer customer) {

		if (isWeekend(day)) {
			if (REGULAR.equals(customer.getCustomerType())) {
				return new WeekendRegularStrategy();
			}
			return new WeekendRewardsStrategy();
		} else {
			if (REGULAR.equals(customer.getCustomerType())) {
				return new WeekdayRegularStrategy();
			}
			return new WeekdayRewardsStrategy();
		}
	}
}

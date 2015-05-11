package com.tw.case1.hotel;


import com.tw.case1.commons.DiscountCategoryEnum;

import java.util.Map;

public interface IHotel{
	
	public String getName();
	
	public int getRating();

	public Map<DiscountCategoryEnum, Integer> getExpense();
}

package com.tw.case1.hotel;


import com.tw.case1.commons.DiscountCategoryEnum;

import java.util.Map;

public interface IHotel{
	
	public String getName();
	
	public void setName(String name);
	
	public int getRating(); // the hotel rating

	public void printInfo();

	public void setExpense(Map<DiscountCategoryEnum, Integer> expense);

	public Map<DiscountCategoryEnum, Integer> getExpense();
}

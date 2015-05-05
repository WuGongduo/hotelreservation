package com.tw.case1.customer;

import com.tw.case1.hotel.IHotel;

import java.util.Date;
import java.util.List;

public interface ICustomer {

	public String getCustomerType();

	public void setCustomerType(String type);

	public int calculateCustomerCostByDays(IHotel hotel);

	public void setStayDays(List<Date> days);

	public List<Date> getStayDays();

	public void setHotel(IHotel hotel);

	public int getSumRate();

	public IHotel getHotel();

}

package com.tw.case1.customer;

import com.tw.case1.hotel.IHotel;

public interface ICustomer {

	public String getCustomerType();

	public int calculateCustomerCostByDays(IHotel hotel);

}

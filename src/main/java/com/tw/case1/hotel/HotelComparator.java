package com.tw.case1.hotel;

import com.tw.case1.customer.ICustomer;

import java.util.Comparator;

public class HotelComparator implements Comparator<IHotel> {

	private ICustomer customer;

	public HotelComparator(ICustomer customer) {
		this.customer = customer;
	}

	@Override
	public int compare(IHotel o1, IHotel o2) {

		int customerCost1 = customer.calculateCustomerCostByDays(o1);
		int customerCost2 = customer.calculateCustomerCostByDays(o2);

		if (customerCost1 != customerCost2) {
			return customerCost1 - customerCost2; // descending order
		} else {
			return o2.getRating() - o1.getRating();
		}
	}

}

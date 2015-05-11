package com.tw.case1.hotel;

import com.tw.case1.commons.Common;
import com.tw.case1.customer.ICustomer;
import com.tw.case1.customer.impl.CustomerImpl;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

public class HotelChain{

	private List<IHotel> hotels = new ArrayList<IHotel>();

	public IHotel findCheapestHotel(List<IHotel> hotels,String line){
		this.hotels = hotels;
		ICustomer customer = createCustomer(getCustomerTag(line),getDateArray(line));
		sortHotelByCost(customer);
		return hotels.get(0);
	}

	private void sortHotelByCost(ICustomer customer){
		Collections.sort(hotels , new HotelComparator(customer));
		if(!hotels.isEmpty()){
			System.out.println(hotels.get(0).getName());
		}
	}

	private List<Date> getDateArray(String line) {
		String[] dateArray = line.substring(line.indexOf(":")+1).split(",");
		return convertStringToDate(dateArray);
	}

	private List<Date> convertStringToDate(String[] dateArray) {
		List<Date> days = new ArrayList<Date>();
		for (int i = 0; i <dateArray.length ; i++) {
			days.add(formatDate(dateArray[i]));
		}
		return days;
	}

	private String getCustomerTag(String line) {
		String customerTag = null;
		if (line.indexOf(":") != -1)
			customerTag = line.substring(0, line.indexOf(":"));
		return customerTag;
	}

	private Date formatDate(String date){
		try {
			date = date.trim();
			return Common.dateFormat(date.substring(0, 9));
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return new Date();
	}

	private ICustomer createCustomer(String customerTag, List<Date> days){
		ICustomer customer = new CustomerImpl(customerTag,days);
		return customer;
	}
}

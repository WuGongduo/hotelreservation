package com.tw.case1.commons;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Common {
	private static final int SUNDAY = 1;
	private static final int SATURDAY = 7;

	public static Date dateFormat(String date) throws ParseException {
		DateFormat df = new SimpleDateFormat("ddMMMyyyy");
		return df.parse(date);
	}

	public static int getDayOfWeek(Date date){
		Calendar cal = Calendar.getInstance();
		cal.setTime(date);
		return cal.get(Calendar.DAY_OF_WEEK);
	}

	public static boolean isWeekend(Date day) {
		return getDayOfWeek(day) == SUNDAY || getDayOfWeek(day) == SATURDAY;
	}
}

package com.tw.case1.commons;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class Common {
	public static final List<DayOfWeekEnum> WEEKDAY_ARRAY = Arrays.asList(DayOfWeekEnum.Monday, DayOfWeekEnum.Tuesday, DayOfWeekEnum.Wednesday, DayOfWeekEnum.Thursday, DayOfWeekEnum.Friday);
	public static final List<DayOfWeekEnum> WEEKEND_ARRAY = Arrays.asList(DayOfWeekEnum.Sunday, DayOfWeekEnum.Saturday);

	public static Date dateFormat(String date) throws ParseException {
		DateFormat df = new SimpleDateFormat("ddMMMyyyy");
		return df.parse(date);
	}

	public static DayOfWeekEnum getDayOfWeek(Date date){
		Calendar cal = Calendar.getInstance();
		cal.setTime(date);
		return DayOfWeekEnum.getDayOfWeekByValue(cal.get(Calendar.DAY_OF_WEEK));
	}
}

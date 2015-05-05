package com.tw.case1.commons;

import org.junit.Assert;
import org.junit.Test;

import java.text.ParseException;
import java.util.Calendar;
import java.util.Date;

import static org.hamcrest.CoreMatchers.is;


/**
 * Created by gdwu on 4/26/15.
 */
public class CommonTest {

    @Test
    public void testDateFormat() throws ParseException {
        String formatDate = "16Mar2009";
        Date date = Common.dateFormat(formatDate);
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        Assert.assertEquals(cal.get(Calendar.DAY_OF_WEEK),2);
    }
}

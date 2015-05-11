package com.tw.case1.hotel;

import com.tw.case1.commons.DiscountCategoryEnum;
import com.tw.case1.hotel.impl.HotelImpl;
import org.junit.Assert;
import org.junit.Test;

import java.util.*;

import static com.tw.case1.commons.DiscountCategoryEnum.*;

public class HotelChainTest {

    @Test
    public void testAnalyzeInput(){
        HotelChain hotelChain = new HotelChain();
        String line1 ="Regular: 16Mar2009(mon), 17Mar2009(tues), 18Mar2009(wed)";
        IHotel hotel1 = hotelChain.findCheapestHotel(createHotels(),line1);
        Assert.assertEquals("Lakewood",hotel1.getName());

        String line2 ="Regular: 20Mar2009(fri), 21Mar2009(sat), 22Mar2009(sun)";
        IHotel hotel2 = hotelChain.findCheapestHotel(createHotels(),line2);
        Assert.assertEquals("Bridgewood",hotel2.getName());

        String line3 ="Rewards: 26Mar2009(thur), 27Mar2009(fri), 28Mar2009(sat)";
        IHotel hotel3 = hotelChain.findCheapestHotel(createHotels(),line3);
        Assert.assertEquals("Ridgewood",hotel3.getName());
    }

    private List<IHotel> createHotels() {
        IHotel lakeWood = new HotelImpl("Lakewood", creterHotelExpense(110, 80, 90, 80),3);
        IHotel bridgeWood = new HotelImpl("Bridgewood", creterHotelExpense(160, 110, 60, 50), 4);
        IHotel ridgeWood = new HotelImpl("Ridgewood", creterHotelExpense(220, 100, 150, 40), 5);

        List<IHotel> hotels = Arrays.asList(lakeWood,bridgeWood,ridgeWood);
        return hotels;
    }

    private Map<DiscountCategoryEnum,Integer> creterHotelExpense(int weekdayRegularRate, int weekdayRewardsRate, int weekendRegularRate, int weekendRewardsRate){
        Map<DiscountCategoryEnum,Integer> expense = new HashMap<DiscountCategoryEnum, Integer>();
        expense.put(WEEKDAY_REGULAR,weekdayRegularRate);
		expense.put(WEEKDAY_REWARDS,weekdayRewardsRate);
		expense.put(WEEKEND_REGULAR,weekendRegularRate);
		expense.put(WEEKEND_REWARDS,weekendRewardsRate);
        return expense;
    }
}

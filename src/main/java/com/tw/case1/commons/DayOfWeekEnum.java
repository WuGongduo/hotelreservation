package com.tw.case1.commons;

/**
 * Created by gdwu on 4/26/15.
 */
public enum DayOfWeekEnum {
    Monday(2),Tuesday(3), Wednesday(4),Thursday(5),Friday(6),Saturday(7),Sunday(1);

    int dayInWeek;
    DayOfWeekEnum(int dayInWeek) {
        this.dayInWeek = dayInWeek;
    }

    public static DayOfWeekEnum getDayOfWeekByValue(int dayOfWeek){
        switch (dayOfWeek){
            case 1:
                return Sunday;
            case 2:
                return Monday;
            case 3:
                return Tuesday;
            case 4:
                return Wednesday;
            case 5:
                return Thursday;
            case 6:
                return Friday;
            case 7:
                return Saturday;
            default:
                return null;
        }
    }
}

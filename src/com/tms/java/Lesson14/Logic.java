package com.tms.java.Lesson14;

import java.util.Calendar;

public class Logic {
    public int countDaysToTue(int dayOfTheWeek){
        if(dayOfTheWeek <= 3) {
            return 3 - dayOfTheWeek;
        } else {
            return 7 - dayOfTheWeek + 3;
        }
    }
}

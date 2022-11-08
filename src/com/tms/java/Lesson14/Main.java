package com.tms.java.Lesson14;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        Input input = new Input();
        View view = new View();
        Logic logic = new Logic();

        //ENTER DATE
        int day = input.inputIntByScanner("Enter the day: ");
        int month = input.inputIntByScanner("Enter the month: ") - 1;
        int year = input.inputIntByScanner("Enter the year: ");

        //FIRST TASK
        view.outputStringToConsole("-----------------------FIRST TASK-----------------------");
        Calendar calendar = new GregorianCalendar(year,month,day);
        String []days = {"Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"};
        view.outputStringToConsole(days[calendar.get(Calendar.DAY_OF_WEEK) - 1]);

        //SECOND TASK
        view.outputStringToConsole("-----------------------SECOND TASK-----------------------");
        calendar.roll(Calendar.DATE,+logic.countDaysToTue(calendar.get(Calendar.DAY_OF_WEEK)));
        SimpleDateFormat sdf = new SimpleDateFormat("dd MMM yyy", Locale.ENGLISH);
        view.outputStringToConsole(sdf.format(calendar.getTime()));

        //THIRD TASK
        view.outputStringToConsole("-----------------------THIRD TASK-----------------------");
        int number = input.inputIntByScanner("Enter the number: ");
        if(number == 1){
            String word = input.inputStringByScanner("Enter the word: ");
            Reverse reverse = new Reverse();
            word = reverse.reverseString(word);
            view.outputStringToConsole(word);
        }
        view.outputStringToConsole("End of the program...");
    }
}

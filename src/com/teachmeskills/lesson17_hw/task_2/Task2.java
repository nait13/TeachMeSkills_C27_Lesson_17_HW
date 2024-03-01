package com.teachmeskills.lesson17_hw.task_2;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/**
 * Displays the day of the week depending on the date
 */
public class Task2 {
    public static void getDayOfWeek() {
        SimpleDateFormat formatter = new SimpleDateFormat("EEEE", new Locale("ru"));
        String result = formatter.format(new Date());
        System.out.println(result);
    }
}

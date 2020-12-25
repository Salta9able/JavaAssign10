package com.example.helloworld;
import java.util.Calendar;
import java.util.Date;
import java.text.SimpleDateFormat;

public class FlightDate {
    protected int year;
    protected int month;
    protected int day;
    protected int hour;
    protected int minute;

    public FlightDate(int year, int month, int day, int hour, int minute){
        this.year = year;
        this.month = month;
        this.day = day;
        this.hour = hour;
        this.minute = minute;
    }

    public String chooseDate() {
        String pattern = "dd MMMMM yyyy, HH:mm";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);

        Calendar c = Calendar.getInstance();
        c.set(year, month, day, hour, minute);

        String dateStr = simpleDateFormat.format(c.getTime());
        return dateStr;
    }
}

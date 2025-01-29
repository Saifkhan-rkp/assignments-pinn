package com.pinnacle.project1;

import com.pinnacle.training.evening.MyTime;

public class MyDate extends MyTime {
    private int year, month, day;

    public MyDate(int year, int month, int day) {
        super(0, 0, 0);
        this.year = year;
        this.month = month < 1 ? 1 : month;

        if ((month < 8 && month % 2 != 0) || (month > 7 && month % 2 == 0)) {
            this.day = day > 31 ? 31 : day;
        } else {

            if (month == 2 && year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) {
                this.day = day > 29 ? 29 : day;
            } else if (month == 2) {
                this.day = day > 28 ? 28 : day;
            } else {
                this.day = day > 30 ? 30 : day;
            }
        }
        this.day = day < 1 ? 1 : day;
    }

    public void setTime(int hrs, int mins, int secs) {
        this.hrs = hrs <= 24 && hrs >= 0 ? hrs : 0;
        this.mins = mins <= 60 && mins >= 0 ? mins : 0;
        this.secs = secs <= 24 && secs >= 0 ? secs : 0;
    }

    public void display() {
        System.out.println("Date: " + year + "/" + month + "/" + day);
        super.display();
    }
}

package com.pinnacle.training.evening;

public class MyTime {
    protected int hrs,mins, secs;
    public MyTime(int hrs, int mins, int secs) {
        this.hrs = hrs <= 24 && hrs >= 0 ? hrs : 0;
        this.mins = mins < 60 && mins >= 0 ? mins : 0;
        this.secs = secs <= 24 && secs >= 0 ? secs : 0;
    }
    public void display(){
        System.out.println("Time is " + hrs + ":" + mins + ":" + secs);
    }
}
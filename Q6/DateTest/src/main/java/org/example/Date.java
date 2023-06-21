package org.example;

public class Date {
    private int month, day, year;

    //Parameterized Constructor
    public Date(int month,int day,int year){
        this.month=month;
        this.day=day;
        this.year=year;
    }

    //setter methods
    public void setMonth(int month){
        this.month = month;
    }
    public void setDay(int day){
        this.day = day;
    }
    public void setYear(int year){
        this.year = year;
    }

    //getter methods
    public int getMonth(){
        return month;
    }
    public int getDay(){
        return day;
    }
    public int getYear(){
        return year;
    }

    public void displayDate(){
        System.out.println("Date :"+month+"/"+day+"/"+year);
    }
}

package dev.collateraldamage.dailymanager;

public class DayCounter {

    String title;
    String startDate;
    String days;

    public DayCounter (String title, String startDate, String days) {
        this.title = title;
        this.startDate = startDate;
        this.days = days;
    }
        public String getTitle() { return title; };
        public String getStartDate() { return startDate; };
        public String getDays() { return days; };
}

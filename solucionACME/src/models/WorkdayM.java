/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

/**
 *
 * @author user-pc
 */
public class WorkdayM {
    private String day; //Only de two letters
    private String checkTime; //24 hours format
    private String departureTime; //24 hours format

    public WorkdayM(String day, String checkTime, String departureTime) {
        this.day = day;
        this.checkTime = checkTime;
        this.departureTime = departureTime;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public void setCheckTime(String checkTime) {
        this.checkTime = checkTime;
    }

    public void setDepartureTime(String departureTime) {
        this.departureTime = departureTime;
    }

    public String getDay() {
        return day;
    }

    public String getCheckTime() {
        return checkTime;
    }

    public String getDepartureTime() {
        return departureTime;
    }
       
}

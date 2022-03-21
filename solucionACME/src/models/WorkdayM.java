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

    public WorkdayM() {

    }
    
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
       
    public boolean valTime(String checkTime, String departureTime){
        String time[]=checkTime.split(":");
        String h1=time[0];
        String h2=time[1];
        h1=h1.concat(time[1]);
        int valCTime=Integer.parseInt(h1);
        time=departureTime.split(":");
        h1=time[0];
        h2=time[1];
        h1=h1.concat(time[1]);
        int valDTime=Integer.parseInt(h1);
        System.out.println(valCTime+"-"+valDTime);
        if(valCTime<=valDTime){
            return true;
        }else{
            return false;
        }
    }
}

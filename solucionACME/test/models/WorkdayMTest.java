/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package models;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author User-PC
 */
public class WorkdayMTest {
    
    public WorkdayMTest() {
    }

    @Test
    public void testSetDay() {
        String dayE="MO";
        WorkdayM w = new WorkdayM("FR", "12:00", "13:00");
        w.setDay(dayE);
        String dayA = w.getDay();
        assertEquals(dayE, dayA);
    }
    @Test
    public void testSetCheckTime() {
        String dayE="MO";
        WorkdayM w = new WorkdayM("FR", "12:00", "13:00");
        w.setDay(dayE);
        String dayA = w.getDay();
        assertEquals(dayE, dayA);
    }
    @Test
    public void testSetDepartureTime() {
        String dayE="MO";
        WorkdayM w = new WorkdayM("FR", "12:00", "13:00");
        w.setDay(dayE);
        String dayA = w.getDay();
        assertEquals(dayE, dayA);
    }
    @Test
    public void testGetDay() {
        String dayE="MO";
        WorkdayM w = new WorkdayM(dayE, "12:00", "13:00");
        String dayA = w.getDay();
        assertEquals(dayE, dayA);
    }
    @Test
    public void testGetCheckTime() {
        String chkTimE="12:00";
        WorkdayM w = new WorkdayM("MO", "12:00", "13:00");
        String chkTimeA = w.getCheckTime();
        assertEquals(chkTimE, chkTimeA);
    }
    @Test
    public void testGetDepartureTime() {
        String depTimE="13:00";
        WorkdayM w = new WorkdayM("MO", "12:00", depTimE);
        String depTimeA = w.getDepartureTime();
        assertEquals(depTimE, depTimeA);
    }
    @Test
    public void testValTime1() {
        String cheTim="12:00";
        String depTim="13:00";
        WorkdayM w = new WorkdayM("MO", cheTim, depTim);
        boolean valA = w.valTime(cheTim,depTim);
        assertEquals(true, valA);
    }
    @Test
    public void testValTime2() {
        String cheTim="13:00";
        String depTim="12:00";
        WorkdayM w = new WorkdayM("MO", cheTim, depTim);
        boolean valA = w.valTime(cheTim,depTim);
        assertEquals(false, valA);
    }
    @Test
    public void testValTime3() {
        String cheTim="13:00";
        String depTim="13:00";
        WorkdayM w = new WorkdayM("MO", cheTim, depTim);
        boolean valA = w.valTime(cheTim,depTim);
        assertEquals(true, valA);
    }
}

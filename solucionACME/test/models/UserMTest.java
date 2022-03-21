/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package models;

import java.util.ArrayList;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author User-PC
 */
public class UserMTest {
    
    //DIEGO=MO10:00-12:00,TH12:00-14:00,SU20:00-21:00
    private String name="DIEGO";
    private WorkdayM wD1=new WorkdayM("MO", "10:00", "12:00");
    private WorkdayM wD2=new WorkdayM("TH", "12:00", "14:00");
    private WorkdayM wD3=new WorkdayM("SU", "20:00", "21:00");
    private ArrayList<WorkdayM> workDays = new ArrayList<>();
    
    public UserMTest() {
        workDays.add(wD1);
        workDays.add(wD2);
        workDays.add(wD3);
    }


    @Test
    public void testSetName() {
        UserM u = new UserM(name, workDays);
        String nameE="IGNACIO";
        u.setName(nameE);
        String nameA=u.getName();
        assertEquals(nameE, nameA);
    }
    @Test
    public void testSetWorkDays() {
        UserM u = new UserM(name, workDays);
        WorkdayM wDE1=new WorkdayM("TU", "08:00", "10:00");
        WorkdayM wDE2=new WorkdayM("WE", "11:00", "12:00");
        WorkdayM wDE3=new WorkdayM("FR", "01:00", "03:00");
        ArrayList<WorkdayM> workDaysE = new ArrayList<>();
        workDaysE.add(wDE1);
        workDaysE.add(wDE2);
        workDaysE.add(wDE3);
        u.setWorkDays(workDaysE);
        ArrayList workDaysA=u.getWorkDays();
        assertEquals(workDaysE, workDaysA);
    }
    @Test
    public void testGetName() {
        UserM u = new UserM(name, workDays);
        String nameE="DIEGO";
        String nameA=u.getName();
        assertEquals(nameE, nameA);
    }
    @Test
    public void testGetWorkDays() {
        UserM u = new UserM(name, workDays);
        ArrayList<WorkdayM> workDaysE = new ArrayList<>();
        workDaysE.add(wD1);
        workDaysE.add(wD2);
        workDaysE.add(wD3);
        ArrayList workDaysA=u.getWorkDays();
        assertEquals(workDaysE, workDaysA);
    }
    @Test
    public void testCompare() {
        String strE="DIEGO-ISMAEL: 2";
        String data="DIEGO=MO10:00-12:00,TH12:00-14:00,SU20:00-21:00";
        UserM user1A=UserM.userEntry(data);
        data="ISMAEL=MO11:10-11:40,TH13:00-13:30,SU22:50-23:00";
        UserM user2A=UserM.userEntry(data);
        String strA=UserM.compare(user1A, user2A);
        assertEquals(strE, strA);
    }
    @Test
    public void testUserEntry() {
        String data="DIEGO=MO10:00-12:00,TH12:00-14:00,SU20:00-21:00";
        UserM userA=UserM.userEntry(data);
        assertEquals("DIEGO", userA.getName());
        assertEquals("MO", userA.getWorkDays().get(0).getDay().toString());
        assertEquals("10:00", userA.getWorkDays().get(0).getCheckTime().toString());
        assertEquals("12:00", userA.getWorkDays().get(0).getDepartureTime().toString());
        assertEquals("TH", userA.getWorkDays().get(1).getDay().toString());
        assertEquals("12:00", userA.getWorkDays().get(1).getCheckTime().toString());
        assertEquals("14:00", userA.getWorkDays().get(1).getDepartureTime().toString());
        assertEquals("SU", userA.getWorkDays().get(2).getDay().toString());
        assertEquals("20:00", userA.getWorkDays().get(2).getCheckTime().toString());
        assertEquals("21:00", userA.getWorkDays().get(2).getDepartureTime().toString());
    }
    @Test
    public void testValSigno() {
        String signo="=";
        boolean resE=true;
        boolean resA=UserM.valSigno("DIEGO=MO10:00-12:00,TH12:00-14:00,SU20:00-21:00", signo);
        assertEquals(resE, resA);
    }
    
}

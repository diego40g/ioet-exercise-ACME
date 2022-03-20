/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author User-pc
 */
public class User {
    private String name;
    private ArrayList<Workday> workDays;

    public User(String name, ArrayList<Workday> workDays) {
        this.name = name;
        this.workDays = workDays;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWorkDays(ArrayList<Workday> workDays) {
        this.workDays = workDays;
    }

    public String getName() {
        return name;
    }

    public ArrayList<Workday> getWorkDays() {
        return workDays;
    }

    public static String compare(User u1, User u2){
        int cont=0;
        for(int i=0;i<u1.getWorkDays().size();i++){
            for(int j=0;j<u2.getWorkDays().size();j++){
                String cTime1=u1.getWorkDays().get(i).getCheckTime();
                String time[]=cTime1.split(":");
                String h1=time[0];
                String h2=time[1];
                h1=h1.concat(time[1]);
                int valCTime1=Integer.parseInt(h1);
                String dTime1=u1.getWorkDays().get(i).getDepartureTime();
                time=dTime1.split(":");
                h1=time[0];
                h2=time[1];
                h1=h1.concat(time[1]);
                int valDTime1=Integer.parseInt(h1);
                
                String cTime2=u2.getWorkDays().get(j).getCheckTime();
                time=cTime2.split(":");
                h1=time[0];
                h2=time[1];
                h1=h1.concat(time[1]);
                int valCTime2=Integer.parseInt(h1);
                String dTime2=u2.getWorkDays().get(j).getDepartureTime();
                time=dTime2.split(":");
                h1=time[0];
                h2=time[1];
                h1=h1.concat(time[1]);
                int valDTime2=Integer.parseInt(h1);
                
                boolean val1=valDTime1>valCTime2;
                boolean val2=valDTime2>valCTime1;
                
                if(val1&&val2&&u1.getWorkDays().get(i).getDay().equals(u2.getWorkDays().get(j).getDay())){
                    cont++;
                }
            }
        }
        String result= u1.getName()+"-"+u2.getName()+": "+String.valueOf(cont);
        return result;
    }
    
    public static User userEntry(String data){
        String div[]=data.split("=");
        String name=div[0];
        ArrayList<Workday> workDays = new ArrayList<>();
        String dayInput=div[1];
        String workList[]=dayInput.split(",");
        boolean flag=true;
        for (int i=0;i<workList.length;i++){
            //Validación días
            if (workList[i].contains("MO")||workList[i].contains("TU")||workList[i].contains("WE")||workList[i].contains("TH")||workList[i].contains("FR")||workList[i].contains("SA")||workList[i].contains("SU")) {
                char[] dayData=workList[i].toCharArray();
                String day = cadenaDividida(dayData, 0, 2);
                String hourData=cadenaDividida(dayData, 2, dayData.length);
                
                String hour[]=hourData.split("-");
                String checkTime=hour[0];
                String departureTime=hour[1];
                Workday newDay=new Workday(day,checkTime,departureTime);
                workDays.add(newDay);
            }else{
                flag=false;
                System.out.println("Dato mal ingresado, revise el formato");
            }
            
        }
        if(flag==true){
            User user = new User(name, workDays);
            return user;
        }else{
            User user = null;
            return user;
        }
    }
    
    public static boolean valSigno(String data,String signo){
        return data.contains(signo);
    }

    public static ArrayList<User> inputUser(ArrayList<User>users){
        System.out.println("El formato para el ingreseo es Nombre '=' dos iniciales del día en ingles hora de entrada '-' hora de salida");
        System.out.println("Para agregar más días separados por comas");
        System.out.println("Ejm: ASTRID=MO10:00-12:00,TH12:00-14:00,SU20:00-21:00");
        System.out.println("Ingrese usuario: ");
        Scanner read=new Scanner(System.in);
        String input = read.nextLine();//ingreso datos

        if(User.userEntry(input)!=null){
            User user=User.userEntry(input);
            users.add(user);
            if(users.size()<=1){
                System.out.println("Usuarios insuficientes para comparar");
            }

            //total de combinaciones (RESPUESTA)
            for(int i=0;i<users.size();i++){
                for(int j=i;j<users.size();j++){
                    if(i!=j){
                        String result = User.compare(users.get(i),users.get(j));
                        System.out.println(result);
                    }
                }
            }
            return users;
        }else{
            return users;
        }
    }
    
    private static String cadenaDividida(char[] chr, int beg, int fin){
        char[] resultC=new char[fin-beg];
        int cont=0;
        while(cont<(fin-beg)){
            resultC[cont]=chr[beg+cont];
            cont++;
        }
        String result = new String(resultC);
        return result;
    }
}

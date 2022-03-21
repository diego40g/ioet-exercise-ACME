package solucionacme;
import models.WorkdayM;
import models.UserM;
import java.util.ArrayList;
import java.util.Scanner;
import views.*;
import models.*;
import controllers.*;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

public class Main {
    public static void main(String[] args) throws Exception {
        /*Scanner read=new Scanner(System.in);
        ArrayList<UserM>users=new ArrayList<>();
        System.out.println("-----------Bienvenido a ACME tabla de pares de empleados-----------");
        while(true){
            System.out.println("Menu presione el número para ingresar a la opción correcta: ");
            System.out.println("1.- Ingresar usuario");
            System.out.println("2.- Salir");
            int var=read.nextInt();
            switch (var) {
                case 1:
                    if(UserM.inputUser(users)!=null){
                        users=UserM.inputUser(users);
                        break;
                    }
                default:
                    System.out.println("Gracias por usar nuestro programa, vuelva pronto");  
                    return;
            }
        }*/
        
        UserW userView = new UserW();
        ArrayList<UserM>users=new ArrayList<>();
        UserC userController = new UserC(userView,users);
        
        userView.setVisible(true);
        userView.setSize(485, 494);
        userView.jPanel1.setVisible(false);
                
        /*ArrayList<UserM>users=new ArrayList<>();
        InputStream ins = new FileInputStream("F:\\Programacion\\ioet\\example4.txt");
        Scanner obj = new Scanner(ins);
        int cont=0;
        ArrayList<String> data = new ArrayList<>();
        while (obj.hasNextLine()){
            data.add(obj.nextLine());
            cont++;
            System.out.println(cont);
        }
        if(cont==0){
            System.out.println("Archivo vacio");
        }else{
            for (String input : data){
                //String input=obj.nextLine();
                if(UserM.userEntry(input)!=null){
                    UserM user=UserM.userEntry(input);
                    users.add(user);
                    
                }
            }
            if(users.size()<=1){
                System.out.println("Usuarios insuficientes para comparar");
            }

            //total de combinaciones (RESPUESTA)
            for(int i=0;i<users.size();i++){
                for(int j=i;j<users.size();j++){
                    if(i!=j){
                        String result = UserM.compare(users.get(i),users.get(j));
                        System.out.println(result);
                    }
                }
            }
        }*/
    }
}

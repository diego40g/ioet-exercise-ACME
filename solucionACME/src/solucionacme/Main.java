package solucionacme;
import models.Workday;
import models.User;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner read=new Scanner(System.in);
        ArrayList<User>users=new ArrayList<>();
        System.out.println("-----------Bienvenido a ACME tabla de pares de empleados-----------");
        while(true){
            System.out.println("Menu presione el número para ingresar a la opción correcta: ");
            System.out.println("1.- Ingresar usuario");
            System.out.println("2.- Salir");
            int var=read.nextInt();
            switch (var) {
                case 1:
                    if(User.inputUser(users)!=null){
                        users=User.inputUser(users);
                        break;
                    }
                default:
                    System.out.println("Gracias por usar nuestro programa, vuelva pronto");  
                    return;
            }
        }
    }
}

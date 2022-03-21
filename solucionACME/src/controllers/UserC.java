package controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;
import models.UserM;
import views.UserW;

public class UserC implements ActionListener{

    UserW viewUser = new UserW();
    ArrayList<UserM> users = new ArrayList<>();

    public UserC() {
    }
    
    public UserC(UserW viewUser, ArrayList<UserM> users){
        this.viewUser=viewUser;
        this.users=users;
        this.viewUser.btnAdd.addActionListener(this);
        this.viewUser.btnFileChooser.addActionListener(this);
        this.viewUser.btnFileChooser1.addActionListener(this);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==viewUser.btnAdd){
            String result="<html>";
            String data = viewUser.txtData.getText();
            if(UserM.userEntry(data)!=null){
                UserM user=UserM.userEntry(data);
                if(user!=null){
                    users.add(user);
                }
                if(users.size()<5){
                    //System.out.println("Usuarios insuficientes para comparar");
                    viewUser.txtResult.setText("Usuarios insuficientes para comparar minimo son 5, a ingresado un total de "+users.size()+" usuarios");
                }else{
                    //total de combinaciones (RESPUESTA)
                    for(int i=0;i<users.size();i++){
                        for(int j=i;j<users.size();j++){
                            if(i!=j){
                                String oneResult = UserM.compare(users.get(i),users.get(j));
                                result+="<p>"+oneResult+"</p>";
                            }
                        }
                    }
                    result+="</html>";
                    viewUser.txtResult.setText(result);
                }
            }else{
                viewUser.txtResult.setText("Dato mal ingresado, revise el formato");
            }
        }
        
        if((e.getSource()==viewUser.btnFileChooser)||(e.getSource()==viewUser.btnFileChooser1)){
            viewUser.jPanel1.setVisible(true);
            viewUser.jPanel2.setVisible(false);
            users.clear();
            String file="";
            String resultP="<html>";
            JFileChooser jFile= new JFileChooser();
            FileNameExtensionFilter filter = new FileNameExtensionFilter("TXT", "txt");
            jFile.setFileFilter(filter);

            int result=jFile.showOpenDialog(viewUser.btnFileChooser);

            if(result==JFileChooser.APPROVE_OPTION){
                file=jFile.getSelectedFile().getPath();

                //System.out.println(file);
            }
            //viewUser.file;
            //InputStream ins = new FileInputStream("F:\\Programacion\\ioet\\example4.txt");
            try{
                InputStream ins = new FileInputStream(file);
                Scanner obj = new Scanner(ins);
                int cont=0;
                ArrayList<String> data = new ArrayList<>();
                while (obj.hasNextLine()){
                    data.add(obj.nextLine());
                    cont++;
                }
                if(cont==0){
                    viewUser.txtResult.setText("Archivo vacio");
                }else{
                    for (String input : data){
                        //String input=obj.nextLine();
                        if(UserM.userEntry(input)!=null){
                            UserM user=UserM.userEntry(input);
                            if(user!=null){
                                users.add(user);
                            }
                        }
                    }
                    if(users.size()<5){
                        resultP+="Usuarios insuficientes para comparar minimos son 5, a ingresado un total de "+users.size()+" usuarios";
                        resultP+="</html>";
                        viewUser.txtResult.setText(resultP);
                    }else{
                        //total de combinaciones (RESPUESTA)
                         for(int i=0;i<users.size();i++){
                            for(int j=i;j<users.size();j++){
                                if(i!=j){
                                    String oneResult = UserM.compare(users.get(i),users.get(j));
                                    resultP+="<p>"+oneResult+"</p>";
                                }
                            }
                        }
                        resultP+="</html>";
                        viewUser.txtResult.setText(resultP);
                    }
                }
            }catch (FileNotFoundException ex) {
                Logger.getLogger(UserC.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
}

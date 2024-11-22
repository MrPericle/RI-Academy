package Esercizi_recap_22_11.MenuGenerico;

import java.util.ArrayList;
import java.util.Scanner;

public class PrintUsersHandler extends UsersHandler{

    Scanner stringScanner = new Scanner(System.in);
    

    public PrintUsersHandler(){
        super();
    }



    @Override
    public void handle() {
        for (String string : super.userList) {
            System.out.println(string);
        }
    
    }
        
    @Override
    public String printInfo() {
        return "Stampa utenti";
    }
    
}

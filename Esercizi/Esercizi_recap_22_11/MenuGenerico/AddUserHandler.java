package Esercizi_recap_22_11.MenuGenerico;

import java.util.ArrayList;
import java.util.Scanner;

public class AddUserHandler extends UsersHandler{

    Scanner stringScanner = new Scanner(System.in);
    

    public AddUserHandler(){
        super();
    }



    @Override
    public void handle() {
        System.out.print("Inserisci Utente>>");
        String userToAdd = stringScanner.nextLine();

        if(userToAdd!=null){
            super.userList.add(userToAdd);
        }
        
    }

    @Override
    public String printInfo() {
        return "Aggiungere un nuovo utente";
    }
    
}

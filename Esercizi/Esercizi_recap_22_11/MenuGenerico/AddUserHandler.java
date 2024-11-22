package Esercizi_recap_22_11.MenuGenerico;

import java.util.ArrayList;
import java.util.Scanner;

public class AddUserHandler implements IMenuHandler{

    ArrayList<String> fatherList = new ArrayList<>();
    Scanner stringScanner = new Scanner(System.in);
    

    public AddUserHandler(ArrayList<String> fatherList){
        this.fatherList = fatherList;
    }



    @Override
    public void handle() {
        System.out.print("Inserisci Utente>>");
        String userToAdd = stringScanner.nextLine();

        if(userToAdd!=null){
            fatherList.add(userToAdd);
        }
        
    }

    @Override
    public String printInfo() {
        return "Aggiungere un nuovo utente";
    }
    
}

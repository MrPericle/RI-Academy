package Esercizi_recap_22_11.MenuGenerico;

import java.util.ArrayList;
import java.util.Scanner;

public class PrintUsers implements IMenuHandler{

    ArrayList<String> fatherList = new ArrayList<>();
    Scanner stringScanner = new Scanner(System.in);
    

    public PrintUsers(ArrayList<String> fatherList){
        this.fatherList = fatherList;
    }



    @Override
    public void handle() {
        for (String string : fatherList) {
            System.out.println(string);
        }
    
    }
        


    @Override
    public String printInfo() {
        return "Stampa utenti";
    }
    
}

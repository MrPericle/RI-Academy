package Eesercizi_recap_21_11.Ereditarieta;

import java.util.ArrayList;

public class Ristorante {

    protected static ArrayList<String> piatti = new ArrayList<>();
    protected static ArrayList<String> recensioni = new ArrayList<>();

    @Override
    public String toString(){
        String retString1="Piatti:";
        String retString2="Recensioni: ";
        for (String piatto : piatti) {
            retString1+=piatto;
        }
        for (String recensione : recensioni) {
            retString2+=recensione;
        }
        return retString1+" "+retString2;
    }
    
    public void addPiatti(String piatto){
        System.out.println("impossibile aggiungere nuovi piatti");
    }

    public void addRecensioni(String recensione){
        System.out.println("impossibile aggiungere recensioni");
    }
    
}

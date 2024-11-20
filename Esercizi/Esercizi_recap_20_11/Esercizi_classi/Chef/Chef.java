package Esercizi_recap_20_11.Esercizi_classi.Chef;

import java.util.ArrayList;

public class Chef {
    public String nome;
    public String tipo;
    public ArrayList<String> ingredienti;

    public Chef(String nome, String tipo, ArrayList<String> ingredienti) {
        this.nome = nome;
        this.tipo = tipo;
        this.ingredienti = ingredienti;
    }

    public String helperComposer(){
        String retString = "";
        switch (tipo.toLowerCase()) {
            case "stellato":
                retString = "gourmet";
                break;
            case "casereccio":
                retString = "come a casa della nonna";
                break;
            case "fusion":
                retString = "con sapori orientali";
                break;
            case "poke":
                retString = "su una ciotola di riso";
                break;
            case "pub":
                retString = "servito con birra alla spina";
                break;
        
        
            default:
                break;
        }
        return retString;
    }

    public void componiPiatto(){
        for (String ingrediente : ingredienti) {
            switch (ingrediente.toLowerCase()) {
                case "carne":
                    System.out.println("Posso prepara una grigliata "+helperComposer());
                    break;
                case "pesce":
                    System.out.println("Posso prepara una frittura di pesce "+helperComposer());
                    break;
                case "verdure":
                    System.out.println("Posso prepara un contorno "+helperComposer());
                    break;
                case "uova":
                    System.out.println("Posso prepara una frittata "+helperComposer());
                    break;
                case "pasta":
                    System.out.println("Posso prepara un piatto di pasta");
                default:
                    System.out.println("Posso prepara un piatto a sorpresa "+helperComposer());
                    break;
            }
        }
    }
    
}

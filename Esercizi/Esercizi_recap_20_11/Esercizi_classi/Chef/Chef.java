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
            case "gourmet":
                retString = "Fancy";
                break;
            case "casereccio":
                retString = "Come a casa";
                break;
            case "fusion":
                retString = "Orientale";
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
                    System.out.println("Prepara una grigliata "+helperComposer());
                    break;
                case "pesce":
                    System.out.println("Prepara una frittura di pesce "+helperComposer());
                    break;
                case "verdure":
                    System.out.println("Prepara un contorno "+helperComposer());
                    break;
                case "uova":
                    System.out.println("Prepara una frittata "+helperComposer());
                    break;
            
                default:
                    System.out.println("Piatto a sorpresa "+helperComposer());
                    break;
            }
        }
    }
    
}

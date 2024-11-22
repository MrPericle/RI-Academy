package Esercizi_recap_22_11.Polimorfismo1;

public class Pirata extends Persona {

    public Pirata(String nome){
        super(nome);
    }

    @Override
    public void saluta(){
        System.out.println("Sono una normalissima persona per nulla sospetta");
    }
    
}

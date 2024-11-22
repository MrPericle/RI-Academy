package Esercizi_recap_22_11.Polimorfismo1;

public class Persona {
    private String nome;

    public Persona(String nome){
        this.nome = nome;
    }

    public void saluta(){
        System.out.println("Ciao, sono "+this.nome);
    }
}

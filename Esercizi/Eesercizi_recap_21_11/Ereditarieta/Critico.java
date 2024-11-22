package Eesercizi_recap_21_11.Ereditarieta;

public class Critico extends Utente {

    Critico(String nome, String email){
        super(nome, email);
    }

    @Override
    public void addRecensioni(String recensione){
        recensioni.add(recensione+ " di " + this.getNome());
        System.out.println("Ho aggiunto una recensione: "+recensione);
    }

    @Override
    public String toString(){
        return super.toString()+" Ruolo: Critico";
    }
    
}

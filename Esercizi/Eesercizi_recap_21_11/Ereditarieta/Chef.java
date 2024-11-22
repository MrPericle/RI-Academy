package Eesercizi_recap_21_11.Ereditarieta;

public class Chef extends Utente {
    Chef(String nome, String email){
        super(nome, email);
    }

    @Override
    public void addPiatti(String piatto){
        piatti.add(piatto + " di " + this.getNome());
        System.out.println("Ho aggiunto un piatto: "+ piatto);
    }

    @Override
    public String toString(){
        return super.toString()+" Ruolo:Chef";
    }
}

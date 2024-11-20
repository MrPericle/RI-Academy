package Esercizi_recap_20_11.Esercizi_classi.Football;

public class Player {
    public String nomeGiocatore;
    public int numeroMaglia;
    

    public Player(String nomeGiocatore, int numeroMaglia) {
        this.nomeGiocatore = nomeGiocatore;
        this.numeroMaglia = numeroMaglia;
    }

    public String getPlayerInfo(){
        return "Player: "+this.nomeGiocatore+" numero maglia:" +this.numeroMaglia;
    }
}

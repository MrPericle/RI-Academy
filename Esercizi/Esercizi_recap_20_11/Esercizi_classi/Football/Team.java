package Esercizi_recap_20_11.Esercizi_classi.Football;

import java.util.ArrayList;

public class Team {
    public ArrayList<Player> teamComp = new ArrayList<>();
    public ArrayList<Integer> numeriMagliaPresi = new ArrayList<>();
    public ArrayList<String> nomiUsati = new ArrayList<>();

    public boolean isValidTeam(){
        return teamComp.size()==12&&numeriMagliaPresi.size()==12&&nomiUsati.size()==12;
    }
    
    public void addPlayer(Player...players){
        int postiLiberi = 12 - teamComp.size();
        for(Player player:players){
            if(postiLiberi == 0){
                System.out.println("Squadra al completo");
                break;
            }
            if(!numeriMagliaPresi.contains(player.numeroMaglia) && !nomiUsati.contains(player.nomeGiocatore)){
                teamComp.add(player);
                numeriMagliaPresi.add(player.numeroMaglia);
                nomiUsati.add(player.nomeGiocatore);
                postiLiberi--;
                System.out.println(player.getPlayerInfo()+" aggiunto correttamente");
            }
            else{
                System.out.println(player.getPlayerInfo()+" non aggiunto");
            }
        }
    }
    
}

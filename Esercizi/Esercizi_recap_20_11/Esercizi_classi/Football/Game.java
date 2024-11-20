package Esercizi_recap_20_11.Esercizi_classi.Football;
import java.util.Random;

public class Game {
    public Team team1 = new Team();
    public Team team2 = new Team();
    public Random resultGenerator = new Random();
    int result;

    public Game(Team team1, Team team2) {
        this.team1 = team1;
        this.team2 = team2;
    }

    public void playFootballMatch(){
        if(!team1.isValidTeam() || !team2.isValidTeam()){
            System.out.println("Impossibile giocare la partita");
        }
        else{
            result=resultGenerator.nextInt(2);
            switch (result) {
                case 0:
                    System.out.println("Team 0 vince");
                    break;
                case 1:
                    System.out.println("Team 1 vince");
                    break;
                case 2:
                    System.out.println("Pareggio");
                    break;
            
                default:
                    break;
            }
        }
    }
}

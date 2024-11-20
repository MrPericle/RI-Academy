package Esercizi_recap_20_11.Esercizi_classi.Football;

public class FootballTest {
    public static void main(String[] args) {
        Team team1 = new Team();
        Team team2 = new Team();
        Game correcGame = new Game(team1, team2);
        Team wrongTestTeam1 = new Team();
        Team wrongTestTeam2 = new Team();
        Team wrongTestTeam3 = new Team();
        Team wrongTestTeam4 = new Team();
        Game wrongGame = new Game(team1, wrongTestTeam4);
        

        //Test inserimento corretto
        for(int newPlayerdx=0; newPlayerdx<12; newPlayerdx++){
            team1.addPlayer(new Player("playerTeam1_"+newPlayerdx, newPlayerdx ));
            team2.addPlayer(new Player("playerTeam2_"+newPlayerdx, newPlayerdx ));
        }

        for(int newPlayerdx=0; newPlayerdx<12; newPlayerdx++){
            wrongTestTeam1.addPlayer(new Player("playerWrongTestTeam1_"+newPlayerdx, 10 ));
        }

        for(int newPlayerdx=0; newPlayerdx<15; newPlayerdx++){
            wrongTestTeam2.addPlayer(new Player("playerWrongTestTeam2_"+newPlayerdx, newPlayerdx ));
        }

        for(int newPlayerdx=0; newPlayerdx<12; newPlayerdx++){
            wrongTestTeam3.addPlayer(new Player("playerWrongTestTeam3", newPlayerdx ));
        }

        for(int newPlayerdx=0; newPlayerdx<5; newPlayerdx++){
            wrongTestTeam4.addPlayer(new Player("playerWrongTestTeam4_"+newPlayerdx, newPlayerdx ));
        }

        correcGame.playFootballMatch();
        wrongGame.playFootballMatch();
        
    }
    
}

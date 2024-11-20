package Esercizi_recap_20_11.Esercizi_classi.Chef;

import java.util.ArrayList;
import java.util.Arrays;

public class ChefTest {
    public static void main(String[] args) {
        ArrayList<String> ingredienti = new ArrayList<>(Arrays.asList("Carne", "Pesce", "Uova", "Verdure", "Pasta"));
        Chef starChef = new Chef("Barbieri", "Gourmet", ingredienti);
        starChef.componiPiatto();
    }
    
}

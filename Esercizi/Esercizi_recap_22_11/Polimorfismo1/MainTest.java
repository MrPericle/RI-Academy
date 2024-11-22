package Esercizi_recap_22_11.Polimorfismo1;

import java.util.ArrayList;

public class MainTest {
    public static void main(String[] args) {

        ArrayList<Persona> listaPersone = new ArrayList<>();

        listaPersone.add(new Persona("Stegosandro"));
        listaPersone.add(new Persona("Mariangiangiangela"));
        listaPersone.add(new Pirata("Barbanera"));

        for (Persona persona : listaPersone) {
            persona.saluta();
        }

    }
}

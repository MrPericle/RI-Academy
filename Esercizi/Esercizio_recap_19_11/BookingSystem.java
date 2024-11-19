package l19_11.esercizi.Esercizio_recap;

import java.util.ArrayList;
import java.util.Scanner;

// Sistema di gestione prenotazioni
// Punti: 
//1. Prenotare posto specifico
//2. Cercare per nome/attributo
//3. Visualizzare tutti i posti disponibili e prenotati
//4. Creare un report abbinando posti liberi e occupati (percentuale)
//5. Poter chiudere il ciclo

public class BookingSystem {
    public static void main(String[] args) {
        boolean running = true;
        int menuChoice = 0;
        int postiOccupati=0;
        int postiTotali=24;
        String nome, prenotazione, pattern;
        int rowIdx, colIdx;
        ArrayList<String> booking = new ArrayList<>();
        Scanner intScanner = new Scanner(System.in);
        Scanner stringScanner = new Scanner(System.in);

        boolean[][] posti = new boolean[3][8];

        for(int row = 0; row < posti.length;row++){
            for(int postoIdx = 0; postoIdx < posti[row].length; postoIdx++){
                posti[row][postoIdx] = false;
            }
        }
        
        System.out.println("Menu");
        while(running){
            System.out.println("1.Aggiungi prenotazione");
            System.out.println("2.Cerca prenotazione");
            System.out.println("3.Visualizza prenotazioni disponibili");
            System.out.println("4.Report");
            System.out.println("0.Esci");

            menuChoice = intScanner.nextInt();

            switch (menuChoice) {
                case 1:
                    System.out.println("Inserire nome prenotazione: ");
                    nome = stringScanner.nextLine();
                    System.out.println("inserire riga (0-2): ");
                    rowIdx = intScanner.nextInt();
                    while (rowIdx<0 || rowIdx>=posti.length) {
                        System.out.println("inserire una riga valida.");
                        rowIdx = intScanner.nextInt();
                    }
                    System.out.println("inserire colonna (0-7): ");
                    colIdx = intScanner.nextInt();
                    while (colIdx<0 || rowIdx>=posti[0].length) {
                        System.out.println("inserire una riga valida.");
                        rowIdx = intScanner.nextInt();
                    }
                    if(!posti[rowIdx][colIdx]){
                        System.out.println("Prenotazione effettuata");
                        posti[rowIdx][colIdx] = true;
                        booking.add(nome+" "+rowIdx+"-"+colIdx);
                        postiOccupati++;
                    }
                    else{
                        System.out.println("Posto occupato, impossibile prenotare.");
                    }

                    break;
                case 2:
                    System.out.println("Nome prenotazione: ");
                    prenotazione = stringScanner.nextLine();
                    boolean found = false;
                    for(String booked: booking){
                        if(booked.startsWith(prenotazione)){
                            String postoPrenotato = booked.substring(prenotazione.length());
                            System.out.println("Prenotazione trovata al posto: "+ postoPrenotato);
                            found = true;
                        }
                    }
                    if(!found){
                        System.out.println("Prenotazione non trovata.");
                    }

                    break;
                case 3:
                    for(int row = 0; row < posti.length;row++){
                        for(int postoIdx = 0; postoIdx < posti[row].length; postoIdx++){
                            System.out.println("Posto "+row+"-"+postoIdx);
                            System.out.println("Occupato: "+posti[row][postoIdx]);
                        }
                    }
                    break;
                case 4:
                    System.out.println(postiOccupati);
                    float percentuale = ((float)postiOccupati/postiTotali) *100;
                    System.out.println("Percentuale posti occupati: "+percentuale+"%");
                    break;
                case 0:
                    System.out.println("Chiusura...");
                    running = false;
                    break;
               
                default:
                    System.out.println("Scelta non valida");
                    break;
            }

        }
        

    }
    
}




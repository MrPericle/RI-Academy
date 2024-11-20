import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;

public class PenSystem {

    public static ArrayList<String> penColors = new ArrayList<>(Arrays.asList("rosso","blu","verde","nero"));
    public static ArrayList<ArrayList<Integer>> spedizioni = new ArrayList<>();
    public static Scanner intScanner = new Scanner(System.in);
    public static Scanner stringScanner = new Scanner(System.in);
    public static Random batchGenerator = new Random();

    public static int min(int[] batch){
        int minimum = batch[0];
        for(int elem:batch){
            if(minimum<elem){
                minimum = elem;
            }
        }
        return minimum;
    }

    public static void generaSpedizioneAutomatica(){
        int[] batchPenne = new int[4];
        int daysTook = 0;
        int n = penColors.size() + 1;
        
        do{
            int colorGenerated = batchGenerator.nextInt(n);
            int quantityGenerated = batchGenerator.nextInt(100);
            batchPenne[colorGenerated] += quantityGenerated;
            daysTook++;
        } while(min(batchPenne)<100);

        
    }

    public static void initializeDailyExpedition(){
        // Metodo per inizializzare una nuova spedizione, idealmente superflua 
        spedizioni.add(new ArrayList<Integer>());
        for(int color=0;color < penColors.size();color++){
            spedizioni.get(spedizioni.size()-1).add(0);
        }
    }

    public static int[] helperSpedizioni(){
        // Metodo per creare una nuova spedizione: prende in input il numero di penne e il loro colore 

        int[] penneDaSpedire = new int[4];
        Arrays.fill(penneDaSpedire, 0); //inizializzo l'array di penne dove ogni indice corrisponde ad una posizione
        System.out.println("Quante penne spedire?");
        int numeroPenneDaSpedire = intScanner.nextInt();
        for(int penna = 0; penna < numeroPenneDaSpedire; penna++){
            System.out.println("inserire il colore della penna da inserire (rosso,blu,verde,nero)");
            String colorePenna = stringScanner.nextLine().toLowerCase();
            int color = penColors.indexOf(colorePenna); // utilizzo un array per indicizzare i vari colori in modo da renderlo robusto su future aggiunte di colori
            while(color < 0){ //controllo sulla validita dell'input
                System.out.println("Colore non disponibile");
                System.out.println("inserire il colore della penna da inserire (rosso,blu,verde,nero)");
                colorePenna = stringScanner.nextLine().toLowerCase();
                color = penColors.indexOf(colorePenna);
            }
            penneDaSpedire[color]++;
        }
        return penneDaSpedire;
    }

    public static void aggiungiSpedizione(){
        //metodo per aggiungere una nuova spedizione di penne
        initializeDailyExpedition();
        int[] pens = helperSpedizioni();
        for(int colorIdx=0;colorIdx<penColors.size();colorIdx++){
            spedizioni.get(spedizioni.size()-1).set(colorIdx, pens[colorIdx]);
        }
    }

    public static void printSpedizioni(){
        // Metodo per stampare le spedizioni divise in giorni
        int day = 0;
        for(ArrayList<Integer> spedizione: spedizioni){
            System.out.println("Day: "+day);
            for(int colorIdx = 0; colorIdx < penColors.size(); colorIdx++){
                System.out.println(spedizione.get(colorIdx) + " penne "+penColors.get(colorIdx)); //Utilizzo l'array penColor per avere un mapping indice-colore
            }
            day++;
        }
    }

    public static int[] totaleVendite(){
        //Metodo che ritorna il totale delle penne vendute divise per colore
        int[] totVendite = new int[4];
        Arrays.fill(totVendite, 0);

        for(ArrayList<Integer> spedizione: spedizioni){
            for(int colorIdx = 0; colorIdx < penColors.size(); colorIdx++){
                totVendite[colorIdx]+=spedizione.get(colorIdx);
            }
        }
        return totVendite;
    }

    public static void printTotaleSpedizioni(){
        //Metodo che stampa il totale delle vendite divise per colore
        int[] penneSpedite = totaleVendite();
        for(int colorIdx = 0; colorIdx<penColors.size(); colorIdx++){
            System.out.println(penneSpedite[colorIdx]+" penne "+penColors.get(colorIdx));
        }
    }

    public static String ricercaSpedizionePerColore(String color){
        //Metodo per ricercare il primo giorno in cui e stata venduta almeno una penna del colore di input
        int day = 0;
        int colorId = penColors.indexOf(color);
        boolean found = false;
        String result = "";
        for(ArrayList<Integer> spedizione: spedizioni){
            if(spedizione.get(colorId)>0){
                found = true;
                break;
            }
            day++;
        }
        if(found){
            result = "Il giorno " + day + " sono state vendute penne "+color;
        }
        else{
            result = "Non abbiamo mai venduto penne "+color;
        }
        return result;
    }

    public static boolean menuHandler(int choice){
        boolean running = true;
        switch (choice) {
            case 1:
                aggiungiSpedizione();
                break;
            case 2:
                printSpedizioni();
                break;
            case 3:
                printTotaleSpedizioni();;
                break;
            case 4:
                System.out.println("Colore>>");
                String colorToSearch = stringScanner.nextLine().toLowerCase();
                System.out.println(ricercaSpedizionePerColore(colorToSearch));
                break;
            case 0:
                running = false;
                break;
            default:
                System.out.println("Invalid choice");;
        }
        return running;
    }

    public static void menuPrinter(){
        //Metodo che stampa il menu e invoca le varie funzioni. Idealmente e divisibile in due funzioni

        int choice=0;
        boolean running = true;
        
        System.out.println("Spedizione penne:");
        
        while(running){
            System.out.println("1. Aggiungi spedizione");
            System.out.println("2. Visualizza spedizioni");
            System.out.println("3. Riepilogo vendite");
            System.out.println("4. Cerca spedizione per colore");
            System.out.println("0. Esci");

            
            choice = intScanner.nextInt();
           
            running = menuHandler(choice);

        }
        System.out.println("Chiusura menu...");
    }


    
    public static void main(String[] args) {
        menuPrinter();
        intScanner.close();
        stringScanner.close();
    }
    
}

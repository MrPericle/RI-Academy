import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class PenSystem {

    public static ArrayList<String> penColors = new ArrayList<>(Arrays.asList("rosso","blu","verde","nero"));
    public static ArrayList<ArrayList<Integer>> spedizioni = new ArrayList<>();
    public static Scanner intScanner = new Scanner(System.in);
    public static Scanner stringScanner = new Scanner(System.in);

    public static void initializeDailyExpedition(){
        spedizioni.add(new ArrayList<Integer>());
        for(int color=0;color < penColors.size();color++){
            spedizioni.get(spedizioni.size()-1).add(0);
        }
    }

    public static int[] helperSpedizioni(){
        int[] penneDaSpedire = new int[4];
        Arrays.fill(penneDaSpedire, 0);
        System.out.println("Quante penne spedire?");
        int numeroPenneDaSpedire = intScanner.nextInt();
        for(int penna = 0; penna < numeroPenneDaSpedire; penna++){
            System.out.println("inserire il colore della penna da inserire (rosso,blu,verde,nero)");
            String colorePenna = stringScanner.nextLine().toLowerCase();
            int color = penColors.indexOf(colorePenna);
            while(color < 0){
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
        initializeDailyExpedition();
        int[] pens = helperSpedizioni();
        for(int colorIdx=0;colorIdx<penColors.size();colorIdx++){
            spedizioni.get(spedizioni.size()-1).set(colorIdx, pens[colorIdx]);
        }
    }

    public static void printSpedizioni(){
        int day = 0;
        for(ArrayList<Integer> spedizione: spedizioni){
            System.out.println("Day: "+day);
            for(int colorIdx = 0; colorIdx < penColors.size(); colorIdx++){
                System.out.println(spedizione.get(colorIdx) + " penne "+penColors.get(colorIdx));
            }
            day++;
        }
    }

    public static int[] totaleVendite(){
        int[] totVendite = new int[4];
        Arrays.fill(totVendite, 0);
        for(ArrayList<Integer> spedizione: spedizioni){
            for(int colorIdx = 0; colorIdx < penColors.size(); colorIdx++){
                totVendite[colorIdx]+=spedizione.get(colorIdx);
            }
        }
        return totVendite;
    }

    public static void printTotaleSpedizini(){
        int[] penneSpedite = totaleVendite();
        for(int colorIdx = 0; colorIdx<penColors.size(); colorIdx++){
            System.out.println(penneSpedite[colorIdx]+" penne "+penColors.get(colorIdx));
        }
    }

    public static String ricercaSpedizionePerColore(String color){
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

    public static void menuPrinter(){
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
           

            switch (choice) {
                case 1:
                    aggiungiSpedizione();
                    break;
                case 2:
                    printSpedizioni();
                    break;
                case 3:
                    printSpedizioni();;
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

        }
        System.out.println("Chiusura menu...");
    }
    
    public static void main(String[] args) {
        menuPrinter();
        intScanner.close();
        stringScanner.close();
    }
    
}

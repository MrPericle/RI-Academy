package primo_esercizio_java.Esercizi;
import java.util.Scanner;

public class Esercizio {
    public static void main(String[] args) {
        Scanner intScanner = new Scanner(System.in);
        Scanner strScanner = new Scanner(System.in);

        System.out.println("username>>");
        String nomeUtente = strScanner.nextLine();
        if(nomeUtente.equals("Pippo")){
            System.out.print("Pippo: ");
        }
        else {
            System.out.println("Utente non riconosciuto");
        }

        System.out.println("password>>");
        String userPasswd = strScanner.nextLine();
        if (userPasswd.length() > 5 && !userPasswd.equals(nomeUtente)) {
            System.out.println("Password sicura");
        }
        else{
            System.out.println("Password non sicura");
        }

        System.out.println("userId>>");
        int idUser = intScanner.nextInt();
        if (idUser>0) {
            System.out.println("Id valido");
        }
        else{
            System.out.println("Id non valido");
        }

        intScanner.close();
        strScanner.close();
    }
}

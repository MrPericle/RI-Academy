import java.util.Scanner;

public class EsercizioWhile {
    public static void main(String[] args) {
        Scanner intScanner = new Scanner(System.in);
        Scanner strScanner = new Scanner(System.in);
        
        System.out.println("Quanti utenti loggare?");
        int userNumebers = intScanner.nextInt();
        int loggedUsers = 0;

        while (loggedUsers<userNumebers){
            System.out.println("username>>");
            String nomeUtente = strScanner.nextLine();
            if(nomeUtente.equals("Pippo"+loggedUsers)){
                System.out.print("Pippo"+loggedUsers+": ");
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
            loggedUsers++;
        }

        intScanner.close();
        strScanner.close();
    }
}

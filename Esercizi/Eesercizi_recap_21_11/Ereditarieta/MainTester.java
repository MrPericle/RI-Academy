package Eesercizi_recap_21_11.Ereditarieta;

import java.util.ArrayList;
import java.util.Scanner;

public class MainTester {
    public static void main(String[] args) {
        boolean running = true;
        ArrayList<Utente> utentiRegistrati = new ArrayList<>();
        Utente currentUser = new Utente();
        Scanner intScanner = new Scanner(System.in);
        Scanner stringScanner = new Scanner(System.in);

        while(running){
            System.out.println("Menu");
            System.out.println("1. Crea Profilo");
            System.out.println("2. Accedi");
            System.out.println("3. Aggiungi piatto");
            System.out.println("4. Aggiungi recensione");
            System.out.println("5. Stampa informazioni");
            System.out.println("0. Esci");

            int choice = intScanner.nextInt();

            switch (choice) {
                case 1:
                    Utente nuovoUtente = new Utente();
                    System.out.print("Nome utente>>");
                    String nuovoUsername = stringScanner.nextLine();
                    nuovoUtente.setNome(nuovoUsername);
                    System.out.println();
                    System.out.print("Email utente>>");
                    String nuovaEmail = stringScanner.nextLine();
                    nuovoUtente.setEmail(nuovaEmail);
                    System.out.println();
                    System.out.print("Password utente>>");
                    String nuovaPasswd = stringScanner.nextLine();
                    nuovoUtente.setPasswd(nuovaPasswd);
                    System.out.println();
                    if(!utentiRegistrati.contains(nuovoUtente))
                        utentiRegistrati.add(nuovoUtente);

                    else System.out.println("Profilo gia esistente");
                    break;
                case 2:
                    Utente logginUtente = new Utente();
                    System.out.print("Nome utente>>");
                    String loggingUsername = stringScanner.nextLine();
                    logginUtente.setNome(loggingUsername);
                    System.out.println();
                    System.out.print("Email utente>>");
                    String loggingEmail = stringScanner.nextLine();
                    logginUtente.setEmail(loggingEmail);
                    System.out.println();
                    System.out.print("Password utente>>");
                    String loggingPasswd = stringScanner.nextLine();
                    
                    System.out.println();
                    if(!utentiRegistrati.contains(logginUtente))
                        System.out.println("Profilo non esistente");
                    else{
                        Utente user = utentiRegistrati.get(utentiRegistrati.indexOf(logginUtente));
                        if(user.checkPasswd(loggingPasswd)){
                            System.out.println("Premere 1 per entrare come chef o 2 per entrare come critico");
                            int roleChoice = intScanner.nextInt();

                            switch (roleChoice) {
                                case 1:
                                    currentUser = new Chef(loggingUsername,loggingEmail);
                                    break;
                                case 2:
                                    currentUser = new Critico(loggingUsername,loggingEmail);
                                    break;
                            
                                default:
                                    break;
                            }
                        }
                        else{
                            System.out.println("Username o password sbagliati");
                        }
                    }
                    break;
                case 3:
                    System.out.print(">>");
                    currentUser.addPiatti(stringScanner.nextLine());
                    break;
                case 4:
                    System.out.print(">>");
                    currentUser.addRecensioni(stringScanner.nextLine());
                    break;
                case 5:
                    System.out.println(currentUser);
                    break;
                case 0:
                    running = false;
                default:
                    break;
            }
        }
    }
}

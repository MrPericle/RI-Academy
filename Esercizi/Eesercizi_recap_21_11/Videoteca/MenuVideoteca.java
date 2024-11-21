package Eesercizi_recap_21_11.Videoteca;

import java.util.ArrayList;
import java.util.Scanner;

public class MenuVideoteca {
    //Classe che gestisce il menu del sistema

    public Scanner intScanner = new Scanner(System.in);
    public Scanner stringScanner = new Scanner(System.in);

    public Videoteca miaVideoteca = new Videoteca();
    public ArrayList<Utente> userList = new ArrayList<>();

    public boolean menuHandler(int choice){
        //metodo che gestisce, in base alle scelte dell'utente, i metodi da invocare per gestire le richieste
        boolean running = true;
        switch (choice) {
            case 1:
                System.out.print("Nome film>>");
                String nomeFilmAggiunta = stringScanner.nextLine();
                System.out.println();
                System.out.print("Anno uscita>>");
                String dataUscitaAggiunta = stringScanner.nextLine();
                System.out.println();
                miaVideoteca.add(new Film(nomeFilmAggiunta,dataUscitaAggiunta));
                
                break;
            case 2:
                System.out.print("Nome film>>");
                String nomeFilmRimuovere = stringScanner.nextLine();
                System.out.println();
                System.out.print("Anno uscita>>");
                String dataUscitaRimuovere = stringScanner.nextLine();
                System.out.println();

                miaVideoteca.remove(new Film(nomeFilmRimuovere,dataUscitaRimuovere));
                
                break;
            case 3:
                System.out.print("ID utente>>");
                String idUtenteAggiungere = stringScanner.nextLine();
                System.out.println();
                System.out.print("Nome utente>>");
                String nomeUtenteAggiungere = stringScanner.nextLine();
                System.out.println();
                Utente possibileUtente = new Utente(idUtenteAggiungere, nomeUtenteAggiungere);
                if(!userList.contains(possibileUtente)){
                    userList.add(new Utente(idUtenteAggiungere, nomeUtenteAggiungere));
                    System.out.println("Utente aggiunto correttamente."); 
                    System.out.println();
                }
                else{
                    System.out.println("Utente gia registrato.");
                }
                break;
            case 4:
                System.out.print("ID utente>>");
                String idUtenteNoleggio = stringScanner.nextLine();
                System.out.println();
                System.out.print("Nome utente>>");
                String nomeUtenteNoleggio = stringScanner.nextLine();
                System.err.println();
                System.out.print("Nome film>>");
                String nomeFilmNoleggio = stringScanner.nextLine();
                System.out.println();
                System.out.print("Anno uscita>>");
                String dataUscitaNoleggio = stringScanner.nextLine();
                System.out.println();
                int idxUtente = userList.indexOf(new Utente(idUtenteNoleggio, nomeUtenteNoleggio));
                if(idxUtente >= 0){
                    Utente utenteNoleggio = userList.get(idxUtente);
                    Film filmToGet = miaVideoteca.getFilm(new Film(nomeFilmNoleggio, dataUscitaNoleggio));

                    if(filmToGet != null && utenteNoleggio.getFilmNoleggiati().size() <= Videoteca.MAX_FILM_CONSENTITI){
                        utenteNoleggio.noleggiaFilm(filmToGet);
                    }
                    else
                        System.out.println("Film non trovato. Impossibile concedere il noleggio.");
                }
                else 
                    System.out.println("Utente non trovato. Impossibile concedere il noleggio.");
                break;
                case 5:
                System.out.print("ID utente>>");
                String idUtenteRestituzione = stringScanner.nextLine();
                System.out.println();
                System.out.print("Nome utente>>");
                String nomeUtenteRestituzione = stringScanner.nextLine();
                System.err.println();
                System.out.print("Nome film>>");
                String nomeFilmRestituzione = stringScanner.nextLine();
                System.out.println();
                System.out.print("Anno uscita>>");
                String dataUscitaRestituzione = stringScanner.nextLine();
                System.out.println();
                int idxUtenteRestituzione = userList.indexOf(new Utente(idUtenteRestituzione, nomeUtenteRestituzione));
                if(idxUtenteRestituzione >= 0){
                    Utente utenteRestituzione = userList.get(idxUtenteRestituzione);
                    Film filmDaRestituire = miaVideoteca.restituzioneFilm(new Film(nomeFilmRestituzione, dataUscitaRestituzione));

                    if(filmDaRestituire != null && utenteRestituzione.getFilmNoleggiati().size() <= Videoteca.MAX_FILM_CONSENTITI){
                        utenteRestituzione.restituisciFilm(filmDaRestituire);
                    }
                    else
                        System.out.println("Film non trovato. Impossibile concedere il noleggio.");
                }
                else 
                    System.out.println("Utente non trovato. Impossibile concedere il noleggio.");
                break;
            case 6:
                System.out.println(miaVideoteca);
                break;
            case 7:
                for (Utente utente : userList) {
                    System.out.println(utente);
                };
                break;
            case 8:
                System.out.print("Premere 1 per cercare per nome; premere 2 per cercare per data>>");
                int searchCoice = intScanner.nextInt();
                while (searchCoice != 1 && searchCoice != 2) {
                    System.out.println("Inserire una opzione valida");
                    System.out.print("Premere 1 per cercare per nome; premere 2 per cercare per data>>");
                    searchCoice = intScanner.nextInt();
                }

                switch (searchCoice) {
                    case 1:
                        System.out.print("Nome film>>");
                        String nomeFilmNRicerca = stringScanner.nextLine();
                        System.out.println();
                        miaVideoteca.searchByName(nomeFilmNRicerca);
                        break;
                    case 2:
                        System.out.print("Nome film>>");
                        String dataFilmNRicerca = stringScanner.nextLine();
                        System.out.println();
                        miaVideoteca.searchByDate(dataFilmNRicerca);
                        break;
                    default:
                        break;
                }
                break;
            case 0:
                running = false;
                break;
            default:
                System.out.println("Invalid choice");;
        }
        return running;
    }

    public void menuPrinter(){
        //Metodo che stampa il menu.

        int choice=0;
        boolean running = true;
        
        System.out.println("Spedizione penne:");
        
        while(running){
            System.out.println("1. Aggiungi film");
            System.out.println("2. Rimuovi film");
            System.out.println("3. Aggiungi utente");
            System.out.println("4. Noleggio film");
            System.out.println("5. Noleggio film");
            System.out.println("6. Lista film");
            System.out.println("7. Lista film noleggiati");
            System.out.println("8. Ricerca film");
            System.out.println("0. Esci");

            
            choice = intScanner.nextInt();
           
            running = menuHandler(choice);

        }
        System.out.println("Chiusura menu...");
        intScanner.close();
        stringScanner.close();
    }
}

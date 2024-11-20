package Esercizi_recap_20_11.Esercizi_classi.Biblioteca;

import java.util.ArrayList;

public class Biblioteca {
    public ArrayList<Book> listaLibri = new ArrayList<>();

    public void addBook(Book newBook){
        //aggiunge un libro ad una libreria
        this.listaLibri.add(newBook);
    }

    public void printAllBooks(){
        //Stampa le info di tutti i libri
        for(Book book: listaLibri){
            System.out.println(book.printBook()); //lascio la responsabilita della stampa alla classe libro per estendibilita
        }
    }

    public void ricercaPerAutore(String nomeAutore){
        //Ricerca un libro per autore. Se lo trova stampa le sue info
        Book foundBook = null;
        for(Book book: listaLibri){
            if(book.nomeAutore.equals(nomeAutore)){
                foundBook = book;
                System.out.println("Trovato il libro: "+ foundBook.printBook());
                break;
            }
        }
        if(foundBook == null){
            System.out.println("No book found");
        }
    }

    public void ricercaPerNumeroPagineMassime(int numPagineMax){
        //Ricerca un libro numero di pagine. Se lo trova stampa le sue info
        Book foundBook = null;
        for(Book book: listaLibri){
            if(book.numeroPagine<=numPagineMax){
                foundBook = book;
                System.out.println("Trovato il libro: "+ foundBook.printBook());
                break;
            }
        }
        if(foundBook == null){
            System.out.println("No book found");
        }
    }

    public void createBook(String nomeAutore, int numeroPagine){
        //Crea un nuovo libro e lo aggiunge alla libreria
        Book newBook = new Book(nomeAutore, numeroPagine);
        this.addBook(newBook);
        System.out.println("Nuovo libro aggiunto");
    }
    
}

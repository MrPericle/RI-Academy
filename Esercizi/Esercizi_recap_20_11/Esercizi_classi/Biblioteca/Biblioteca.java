package Esercizi_recap_20_11.Esercizi_classi.Biblioteca;

import java.util.ArrayList;

public class Biblioteca {
    public ArrayList<Book> listaLibri = new ArrayList<>();

    public void addBook(Book newBook){
        this.listaLibri.add(newBook);
    }

    public void printAllBooks(){
        for(Book book: listaLibri){
            System.out.println(book.printBook());
        }
    }

    public Book ricercaPerAutore(String nomeAutore){
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
        return foundBook;
    }

    public Book ricercaPerNumeroPagineMassime(int numPagineMax){
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
        return foundBook;
    }

    public void createBook(String nomeAutore, int numeroPagine){
        Book newBook = new Book(nomeAutore, numeroPagine);
        this.addBook(newBook);
        System.out.println("Nuovo libro aggiunto");
    }
    
}

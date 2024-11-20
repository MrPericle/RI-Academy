package Esercizi_recap_20_11.Esercizi_classi.Biblioteca;

public class Book {

    public String nomeAutore;
    public int numeroPagine;

    public Book(String autore, int numPagine){
        this.nomeAutore=autore;
        this.numeroPagine=numPagine;
    }

    public String printBook(){
        //stampa le info sul libro
        return "Autore: "+nomeAutore+". "+numeroPagine+"p.";
    }
    
}

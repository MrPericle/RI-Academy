package Esercizi_recap_20_11.Esercizi_classi.Biblioteca;

public class BibliotecaTest {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();
        biblioteca.printAllBooks();
        biblioteca.createBook("Autore", 1000);
        biblioteca.createBook("Autore1", 500);
        biblioteca.createBook("Autore2", 800);
        biblioteca.createBook("Autore3", 250);
        biblioteca.printAllBooks();
        biblioteca.ricercaPerAutore("Autore2");
        biblioteca.ricercaPerNumeroPagineMassime(400);
        biblioteca.ricercaPerAutore("Autore4");

    }
    
}

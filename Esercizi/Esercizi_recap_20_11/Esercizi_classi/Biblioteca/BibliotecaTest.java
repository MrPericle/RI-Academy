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
        Book libro = biblioteca.ricercaPerAutore("Autore2");
        Book libro2 = biblioteca.ricercaPerNumeroPagineMassime(400);
        Book nullBook = biblioteca.ricercaPerAutore("Autore4");

    }
    
}

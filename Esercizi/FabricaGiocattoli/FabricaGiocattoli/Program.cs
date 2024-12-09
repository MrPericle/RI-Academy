public class Program{
    public static void Main(string[] args){
        FabricaGiocattoli fabricaGiocattoli = new FabricaGiocattoli();
        fabricaGiocattoli.aggiungiGiocattolo(new Giocattolo("Macchinina", "Plastica", 1, 10));
        fabricaGiocattoli.aggiungiGiocattolo(new Giocattolo("Aeroplano", "Plastica", 2, 50));
        fabricaGiocattoli.aggiungiGiocattolo(new Giocattolo("Marionetta", "Plastica", 1, 5));
        fabricaGiocattoli.aggiungiGiocattolo(new Giocattolo("Macchinina", "Metallo", 1, 30));
        fabricaGiocattoli.aggiungiGiocattolo(new Giocattolo("Macchinina", "Plastica", 1, 10));

        fabricaGiocattoli.stampaGiocattoli();
        Console.WriteLine($"Guadagno totale: {fabricaGiocattoli.getTotal()}");
    }
}
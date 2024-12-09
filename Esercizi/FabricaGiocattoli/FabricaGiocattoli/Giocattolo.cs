public class Giocattolo{
    public string Nome{get; set;}
    public string Materiale{get; set;}
    public decimal PrezzoProduzione{get; set;}
    public decimal PrezzoVendita{get; set;}

    public Giocattolo(string nome, string materiale, decimal prezzoProduzione, decimal prezzoVendita){
        Nome = nome;
        Materiale = materiale;
        PrezzoProduzione = prezzoProduzione;
        PrezzoVendita = prezzoVendita;
    }

    public decimal guadagnoNetto(){
        return PrezzoVendita-PrezzoProduzione;
    }

    public override string ToString()
    {
        return "Nome: " + Nome + " " + Materiale +" Prezzo vendita: "+ PrezzoVendita +"$";
    }

}
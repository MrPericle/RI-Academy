using System.Linq;

public class FabricaGiocattoli{
    public List<Giocattolo> ListaGiocattoli{get;}

    public void aggiungiGiocattolo(Giocattolo giocattolo){
        ListaGiocattoli.Add(giocattolo);
    }

    public void stampaGiocattoli(){
        ListaGiocattoli.ForEach(
            giocattolo=> Console.WriteLine(giocattolo)
        );
    }

    public decimal getTotal(){
        return ListaGiocattoli.Sum(giocattolo => giocattolo.guadagnoNetto());
    }
    public FabricaGiocattoli(){
        ListaGiocattoli = new List<Giocattolo>();
    }

}
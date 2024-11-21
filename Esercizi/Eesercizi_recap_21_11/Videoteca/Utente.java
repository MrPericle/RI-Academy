package Eesercizi_recap_21_11.Videoteca;

import java.util.ArrayList;

public class Utente {
    private String idUtente;
    private String nome;
    private ArrayList<Film> filmNoleggiati = new ArrayList<>();

    public Utente(String idUtente, String nome) {
        this.idUtente = idUtente;
        this.nome = nome;
    }

    public Utente() {
    }

    public String getIdUtente() {
        return idUtente;
    }

    public void setIdUtente(String idUtente) {
        this.idUtente = idUtente;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public ArrayList<Film> getFilmNoleggiati() {
        return filmNoleggiati;
    }

    public void noleggiaFilm(Film aFilm){
        filmNoleggiati.add(aFilm);
    }

    public void restituisciFilm(Film aFilm){
        if(filmNoleggiati.contains(aFilm))
            filmNoleggiati.remove(aFilm);
        else
            System.out.println("Utente non possiede quel film.");
    }

    @Override
    public boolean equals(Object obj){
        boolean retVal = false;
        if(this == obj)
        retVal = true;
        if(obj == null || this.getClass() != obj.getClass()){
            retVal = false;
        }
        Utente otherUser = (Utente) obj;
        if(this.idUtente.toLowerCase().equals(otherUser.getIdUtente().toLowerCase())&&this.nome.equals(otherUser.getNome())){
            retVal = true;
        }


        return retVal;
    }

    @Override
    public String toString() {
        return "Utente [idUtente=" + idUtente + ", nome=" + nome + ", filmNoleggiati=" + filmNoleggiati + "]";
    }
    
    
}

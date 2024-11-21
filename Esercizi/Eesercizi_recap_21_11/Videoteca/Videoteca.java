package Eesercizi_recap_21_11.Videoteca;

import java.util.ArrayList;

public class Videoteca {
    //costante che stabilisce il numero massimo di film noleggiabili da un singolo utente
    public static final int MAX_FILM_CONSENTITI = 3;

    private ArrayList<Film> availableFilms = new ArrayList<>();
    private ArrayList<Film> filmNoleggaiti = new ArrayList<>();

    public void add(Film aFilm){
        availableFilms.add(aFilm);
    }

    public void remove(Film aFilm){
        if(availableFilms.contains(aFilm)){
            availableFilms.remove(aFilm);
            System.out.println("Film Rimosso con successo");
        }
        else
            System.out.println("Film non esistente");
    }


    public Film getFilm(Film filmToGet){
        //Metodo per noleggiare un film
        int filmIdx = availableFilms.indexOf(filmToGet);
        Film aFilm = null;
        if(filmIdx >= 0){
            System.out.println("Prendo il film");
            aFilm = availableFilms.get(filmIdx);
            filmNoleggaiti.add(aFilm);
            availableFilms.remove(filmIdx);
        }
        return aFilm;
    }
    public Film restituzioneFilm(Film filmToGet){
        //Metodo per restituire un film
        int filmIdx = filmNoleggaiti.indexOf(filmToGet);
        Film aFilm = null;
        if(filmIdx >= 0){
            System.out.println("Prendo il film");
            aFilm = filmNoleggaiti.get(filmIdx);
            availableFilms.add(aFilm);
            filmNoleggaiti.remove(filmIdx);
        }
        return aFilm;
    }

    @Override 
    public String toString(){
        String filmString = "[";
        for (Film film : availableFilms) {
            filmString+=""+film.toString();
            filmString+=";";
        }
        filmString+="]";
        return filmString;
    }

    public void searchByName(String nomeFilm){
        //Metodo che ricerca o il nome completo o una iniziale
        for (Film film : availableFilms) {
            if(film.getTitolo().equals(nomeFilm) || film.getTitolo().startsWith(nomeFilm))
                System.out.println(film);
        }
    }

    public void searchByDate(String dataFilm){
        //Metodo che cerca per data esatta
        for (Film film : availableFilms) {
            if(film.getDataUscita().equals(dataFilm))
                System.out.println(film);
        }
    }
    
}

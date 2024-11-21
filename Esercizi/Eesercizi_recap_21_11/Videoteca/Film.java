package Eesercizi_recap_21_11.Videoteca;

public class Film {

    private String titolo;
    private String dataUscita;

    
    public Film() {
        this("", "");
    }


    public Film(String titolo, String dataUscita) {
        this.titolo = titolo;
        this.dataUscita = dataUscita;
    }


    public String getTitolo() {
        return titolo;
    }


    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }


    public String getDataUscita() {
        return dataUscita;
    }


    public void setDataUscita(String dataUscita) {
        this.dataUscita = dataUscita;
    }


    @Override
    public String toString() {
        return "Film [titolo=" + titolo + ", dataUscita=" + dataUscita + "]";
    }


    @Override
    public boolean equals(Object obj) {
        boolean retVal = false;
        if(this == obj)
        retVal = true;
        if(obj == null || this.getClass() != obj.getClass()){
            retVal = false;
        }
        Film otherFilm = (Film) obj;
        if(this.titolo.toLowerCase().equals(otherFilm.getTitolo().toLowerCase())&&this.dataUscita.equals(otherFilm.getDataUscita())){
            retVal = true;
        }


        return retVal;
    }

    

    @Override
    public int hashCode() {
        return titolo.hashCode()+dataUscita.hashCode()*31;
    }

    

    
    
}

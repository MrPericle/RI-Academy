package Eesercizi_recap_21_11.Ereditarieta;

import java.util.Random;

public class Utente extends Ristorante {

    private String nome;
    private String email;
    private float soldi;
    private String passwd;
    private Random randMoneyGenerator = new Random();

    public Utente(){
        this.soldi = randMoneyGenerator.nextFloat();
    }

    

    public Utente(String nome, String email) {
        this();
        this.nome = nome;
        this.email = email;
    }



    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPasswd(String passwd){
        this.passwd=passwd;
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
        if(this.nome.equals(otherUser.getNome())&&this.email.equals(otherUser.getEmail())){
            retVal = true;
        }


        return retVal;
    }

    public boolean checkPasswd(String passwd){
        boolean login = false;
        if(this.passwd.equals(passwd))
            login = true;
        return login; 
    }

    @Override
    public String toString() {
        return super.toString()+" Utente [nome=" + nome + ", email=" + email + "]";
    }

    
    
}

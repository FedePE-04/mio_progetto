package Model;
import Service.Biblioteca;


public class Utente extends Biblioteca {
    String nome;
    int id;   
    
    public Utente(String sede ,String nome, int id){
        super(sede);
        this.nome = nome;
        this.id = id ;
    }

    public String getNome(){
        return nome;
    }

    public int getId(){
        return id;
    }

    public void setNome(String nuovoNome){
        this.nome = nuovoNome;
    }

    
    public void setId(int nuovoId){
        this.id = nuovoId;
        }



    // Implementare la visualizzazione dei soli libri disponibili.

    // Obiettivo: introdurre la gestione dello stato e collegare più classi tra loro.

}

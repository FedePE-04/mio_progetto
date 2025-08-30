public class Prodotto {
    private String nome;
    double prezzoBase;


// costruttore
public Prodotto(String nome, double prezzoBase) {
    this.nome = nome;
    this.prezzoBase = prezzoBase;
    
}

// metodo calcolaPrezzoFinale
public double calcolaPrezzoFinale(double sconto) {
    double prezzo_finale = prezzoBase - sconto / 100;
    System.out.println("Il prezzo finale è: " + prezzo_finale);
    return prezzo_finale;
}
// metodo get-set
public String getNome(){
    return nome;
}
public double getPrezzoBase(){
    return prezzoBase;
}


public void setNome(String nuovoNome){
    this.nome= nuovoNome;
}
public void setPrezzoBase(double nuovoPrezzoBase){
    this.prezzoBase = nuovoPrezzoBase;
}

}

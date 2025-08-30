public class Prodotto{
    private String nome;
    private double prezzo_base;
   

    //costruttore
    public Prodotto(String nome, double prezzo_base){
        this.nome = nome;
        this.prezzo_base = prezzo_base;
    }

    //metodi
    public double calcolaPrezzoFinale(double sconto){
        double prezzo_finale = prezzo_base - sconto / 100;
        System.out.println("il prezzo finale è: " + prezzo_finale);
        return prezzo_finale;
    }
    //get e set
    
    public String getNome(){
        return nome;
    }
    public double getPrezzo_base(){
        return prezzo_base;
    }
  
    
    //set
    public void setNome(String nuovoNome){
        this.nome = nuovoNome;
    }
    public void setPrezzo_base(double nuovoPrezzoBase){
        this.prezzo_base = nuovoPrezzoBase;
    }
  
    }

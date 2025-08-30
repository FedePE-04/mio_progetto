package task2_catalogo;

public class Prodotto{
    private String nome;
    private double prezzo_base;
    


    public Prodotto(String nome, double prezzo_base){
        this.nome= nome;
        this.prezzo_base = prezzo_base;
        }

    public double calcolaPrezzoFinale(double sconto, int data_scadenza, boolean garanzia, boolean Isstudente){
        double prezzo_finale;
        prezzo_finale =  (prezzo_base - sconto / 100);
        System.out.println("il prodotto: " + nome + " ha come prezzo finale: "+ prezzo_finale+ " lo sconto applicato è del: " + sconto+"%");
        return prezzo_finale;
        }

    public String getNome(){
        return nome;
    }

    public double getPrezzo_base(){
        return prezzo_base;
    }

    public void setNome(String nuovo_prodotto){
        nome = nuovo_prodotto;
    }
    
    public void setPrezzo_base(int prezzo_nuovo_prodotto){
        prezzo_base = prezzo_nuovo_prodotto;
    }
    
    
}
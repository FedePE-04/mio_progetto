public class Prodotto_Libro extends Prodotto {
    boolean Isstudente;
    public Prodotto_Libro(String nome, double prezzo_base, boolean Isstudente ){
        super(nome, prezzo_base);
        this.Isstudente = Isstudente;
    }

    public boolean getIsstudente(){
        return Isstudente;
    }
// ProdottoLibro: applica sconto studenti del 15% se il flag studente è true.
    @Override
    public double calcolaPrezzoFinale (double sconto){
        double sconto_da_applicare= 25;
        if(getIsstudente() == true){
            double prezzo_finale;
            prezzo_finale = getPrezzo_base()- sconto_da_applicare /100;
            System.out.println("Sconto attivato sul prodotto acquistato, importo da pagare: "+ prezzo_finale);
        }
        else{
            System.out.println("Sconto studenti non applicabile, importo da pagare: "+ getPrezzo_base());
        }
        return sconto_da_applicare;
        }
    
}


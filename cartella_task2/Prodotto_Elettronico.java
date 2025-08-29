public class Prodotto_Elettronico extends Prodotto {
    Boolean garanzia;
    public Prodotto_Elettronico(String nome, double prezzo_base){
        super(nome, prezzo_base);
        this.garanzia = garanzia;
    };

    // applica garanzia (+10% del prezzo) se scelta dall’utente.

    @Override   
    public double calcolaPrezzoFinale (double sconto, int data_scadenza, boolean garanzia, boolean Isstudente){
        double sconto_da_applicare= 10;
        if(garanzia == true){
            double prezzo_finale;
            prezzo_finale = getPrezzo_base() + sconto_da_applicare /100 ;
            System.out.println("il prezzo finale del prodotto: "+ getNome() + " è di: "+ prezzo_finale + "euro");
        }
        else{
            System.out.println("il prezzo finale è: " + getPrezzo_base());
        }
        return sconto_da_applicare;
    }
}
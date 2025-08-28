public class ProdottoAlimentare extends Prodotto {
        int dataScadenza;
        public ProdottoAlimentare(String nome, double prezzoBase){
        super(nome, prezzoBase);
        this.dataScadenza = dataScadenza;
    }
    @Override
    public double calcolaPrezzoFinale(double sconto) {
        double prezzo_finale;
        if (dataScadenza<=3){
            prezzo_finale=getPrezzoBase()-(getPrezzoBase()*20/100);
            System.out.println("Il prezzo finale è: " + prezzo_finale);
        }
        else{
            prezzo_finale = getPrezzoBase();
            System.out.println("Il prezzo finale è: " + prezzo_finale);
        }
        return prezzo_finale;
        
        
    }
    
}
    



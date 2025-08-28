public class ProdottoAlimentare extends Prodotto{
        int data_scadenza;
        public ProdottoAlimentare(String nome, double prezzo_base) {
        super(nome, prezzo_base);
        this.data_scadenza = data_scadenza;
        
    }
    @Override
       public double calcolaPrezzoFinale(double sconto){
        double PrezzoFinale;
        if (data_scadenza <= 3){
          PrezzoFinale=getPrezzo_base()-(getPrezzo_base()*20/100);
          System.out.println("il prezzo finale è: "+PrezzoFinale);
        }
        else{
            PrezzoFinale = getPrezzo_base();
            System.out.println("il prezzo finale è: "+PrezzoFinale);
        }
        return PrezzoFinale;
       }
    }


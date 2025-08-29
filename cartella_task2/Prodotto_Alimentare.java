public class Prodotto_Alimentare extends Prodotto {
    private int data_scadenza;

    
    public Prodotto_Alimentare(String nome, double prezzo_base){
        super(nome, prezzo_base);
        this.data_scadenza = data_scadenza;
    };


    public double getData_scadenza(){
        return data_scadenza;
    }


    // applica sconto del 20% se la dataScadenza è entro 3 giorni.
    @Override
    public double calcolaPrezzoFinale(double sconto, int data_scadenza, boolean garanzia, boolean Isstudente){
        double PrezzoFinale;
        if (data_scadenza <= 3){            
          PrezzoFinale=getPrezzo_base()-sconto/100;
          System.out.println("il prezzo finale è: "+PrezzoFinale);
        }
        else{
            PrezzoFinale = getPrezzo_base();
            System.out.println("il prezzo finale è: "+PrezzoFinale);
        }
        return PrezzoFinale;
       }
 }
public class Prodotto_Alimentare extends Prodotto {
    private int data_scadenza;

    
    public Prodotto_Alimentare(String nome, double prezzo_base, int data_scadenza){
        super(nome, prezzo_base);
        this.data_scadenza = data_scadenza;
    };


    public int getData_scadenza(){
        return data_scadenza;
    }


    // applica sconto del 20% se la dataScadenza è entro 3 giorni.
    @Override
    public double calcolaPrezzoFinale(double sconto ){
        double PrezzoFinale;
        if (getData_scadenza() <= 3){            
          PrezzoFinale=getPrezzo_base()-sconto/100;
          System.out.println("il prodotto " + getNome()+ " ha come prezzo finale: "+PrezzoFinale);
          System.out.println("il prodotto: " + getNome()+ " scade fra: "+ getData_scadenza()+ " giorni");
        }
        else{
            PrezzoFinale = getPrezzo_base();
            System.out.println("il prezzo finale è: "+PrezzoFinale);
        }
        return PrezzoFinale;
       }
 }
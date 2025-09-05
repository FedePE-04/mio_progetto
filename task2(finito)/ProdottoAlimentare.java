import java.util.ArrayList;
import java.util.List;

public class ProdottoAlimentare extends Prodotto{
     
        int data_scadenza;
        double prezzo_finale;
        public ProdottoAlimentare(String nome, double prezzo_base, int data_scadenza, double prezzo_finale) {
        super(nome, prezzo_base);
        this.data_scadenza = data_scadenza;
        this.prezzo_finale = prezzo_finale;
        
    }
    @Override
       public double calcolaPrezzoFinale(){
        if (data_scadenza <= 3){
         prezzo_finale = (getPrezzo_base()- getPrezzo_base()*20/100);
          System.out.println("il prezzo finale è: "+ prezzo_finale);
        }
        else{
            getPrezzo_base();
            System.out.println("il prezzo finale è: " + getPrezzo_base());
        }
        return prezzo_finale;
       
       }


    }


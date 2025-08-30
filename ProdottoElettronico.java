public class ProdottoElettronico extends Prodotto{
    boolean garanzia = true;
    double prezzo_finale;
    public ProdottoElettronico(String nome, double prezzo_base,boolean garanzia, double prezzo_finale){
        super(nome,prezzo_base);
        this.garanzia = garanzia;
        this.prezzo_finale = prezzo_finale;
    }
@Override
public double calcolaPrezzoFinale(){
    if(garanzia == true){
        prezzo_finale = (getPrezzo_base()+ getPrezzo_base()*10/100);
        System.out.println("il prezzo finale è: "+ prezzo_finale);
    }else {
        System.out.println("il prezzo finale è: " + getPrezzo_base());
    }
    return prezzo_finale;
        
    }

    
    
}
    


public class ProdottoLibro extends Prodotto {
    boolean studente = true;
    double prezzo_finale;
    public ProdottoLibro(String nome, double prezzo_base,boolean studente, double prezzo_finale){
        super(nome,prezzo_base);
        this.studente = studente;
        this.prezzo_finale = prezzo_finale;
    }
    @Override
    public double calcolaPrezzoFinale(){
        if(studente == true){
            prezzo_finale = (getPrezzo_base()- getPrezzo_base()*15/100);
            System.out.println("il prezzo finale è: "+ prezzo_finale);
        }
        else{
            System.out.println("il prezzo finale è: "+ getPrezzo_base());
        }
        return prezzo_finale;
    }
}

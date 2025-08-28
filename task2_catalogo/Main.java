public class Main{
    public static void main(String []args) {
        Prodotto p1 = new Prodotto("Scarpa", 20);
        p1.calcolaPrezzoFinale( 5);
        ProdottoAlimentare p2 = new ProdottoAlimentare("Pesca",5);
        p2.calcolaPrezzoFinale(5);
    }
}
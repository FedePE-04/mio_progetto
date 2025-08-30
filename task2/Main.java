public class Main {
    public static void main(String[] args) {
        Prodotto p1 = new Prodotto("scarpa",20);
        ProdottoAlimentare p2 = new ProdottoAlimentare("melone",20,3, 0);
        ProdottoElettronico p3 = new ProdottoElettronico("computer",400,true, 0);
        ProdottoLibro p4 = new ProdottoLibro("il signore degli anelli",40,true,0);
        p1.calcolaPrezzoFinale();
        p2.calcolaPrezzoFinale();
        p3.calcolaPrezzoFinale();
        p4.calcolaPrezzoFinale();

        //arraylist con prodotti misti
        Prodotto[] carrello = {p1,p2,p3,p4};
}
}
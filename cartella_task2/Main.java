import java.util.ArrayList;
import java.util.Scanner;

public class Main {
        public static void main(String[] args) {
        //     Prodotto p = new Prodotto("Scarpe", 100);
        //     System.out.println("nome Prodotto "+ p.getNome());
        //     System.out.println("prezzo base "+ p.getPrezzo_base());
        //     p.calcolaPrezzoFinale(20, 10, true,true);


        //     Prodotto_Alimentare p2 = new Prodotto_Alimentare("Mortadella", 20);
        //     System.out.println("nome Prodotto alimentare "+ p2.getNome());
        //     System.out.println("prezzo base "+ p2.getPrezzo_base());
        //     p2.calcolaPrezzoFinale(20, 3, false,false); 


        //     Prodotto_Elettronico p3 = new Prodotto_Elettronico("Smarthphone", 120);
        //     System.out.println("nome Prodotto elettronico "+ p3.getNome());
        //     System.out.println("prezzo base "+ p3.getPrezzo_base());
        //     p3.calcolaPrezzoFinale(0, 0, false, false);

        //     Prodotto_Libro p4 = new Prodotto_Libro("Marco e il paese delle meraviglie", 20);
        //     System.out.println("nome Libro "+ p4.getNome());
        //     System.out.println("prezzo base "+ p4.getPrezzo_base());
        //     p4.calcolaPrezzoFinale(0, 0, false, true);
        Prodotto_Alimentare p5 = new Prodotto_Alimentare("formaggio", 22.30, 5);
        p5.calcolaPrezzoFinale(20);
        


        // Crea un catalogo (ArrayList) con prodotti misti.
        // Chiedi all’utente con Scanner di inserire il tipo di prodotto e simula il calcolo del prezzo finale.
        // Stampa il totale del carrello.

        ArrayList<Prodotto> ListaProdotti = new ArrayList<>();
        ListaProdotti.add(new Prodotto_Alimentare("Pane", 1.20, 8));
        ListaProdotti.add(new Prodotto_Alimentare("Nutella", 4.20, 9));
        ListaProdotti.add(new Prodotto_Elettronico("Televisore", 1220, false));
        ListaProdotti.add(new Prodotto_Elettronico("Mouse", 20, true));
        ListaProdotti.add(new Prodotto_Libro("A Clockwork Orange", 20.9, false));
        ListaProdotti.add(new Prodotto_Libro("L'ultimo a morire", 22.50, true));

        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Inserisci il nuovo prodotto");
        String nuovo_prodotto = myObj.nextLine();  // Read user input

        System.out.println("Inserisci il prezzo del nuovo prodotto");
        Double prezzo_nuovo_prodotto = myObj.nextDouble();  // Read user input

        System.out.println("Il nuovo prodotto inserito è: " + nuovo_prodotto );
        System.out.println("ed il suo prezzo è di: " + prezzo_nuovo_prodotto );  // Output user input 

        myObj.close();

        }



        
    
    



}

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Creazione dei prodotti da inserire nel catalogo.
        Prodotto p1 = new Prodotto("scarpa", 20);
        ProdottoAlimentare p2 = new ProdottoAlimentare("melone", 20, 3, 0);
        ProdottoElettronico p3 = new ProdottoElettronico("computer", 400, true, 0);
        ProdottoLibro p4 = new ProdottoLibro("il signore degli anelli", 40, true, 0);

        // Crea un catalogo (ArrayList) con prodotti misti.
        List<Prodotto> catalogo = new ArrayList<>();
        catalogo.add(p1);
        catalogo.add(p2);
        catalogo.add(p3);
        catalogo.add(p4);

        Scanner scanner = new Scanner(System.in);
        double totaleCarrello = 0.0;
        String risposta;
        
        System.out.println("Benvenuto nel catalogo prodotti!");

        // Ciclo do-while per permettere all'utente di aggiungere prodotti finché non decide di uscire.
        do {
            // Stampa l'elenco dei prodotti disponibili nel catalogo.
            System.out.println("\nCatalogo Prodotti:");
            for (int i = 0; i < catalogo.size(); i++) { //scorre elementi dell'array
                System.out.println( (i + 1)/*si aggiunge i + 1 perchè gli umani contano da 1 anzichè 0 */ + ". " + catalogo.get(i).getNome())/*questa parte, per ogni indice corrispondente a un oggetto applica il getter per restituire i nomi degli oggetti */; //stampa elementi dell'array
            }

            // Chiede all'utente di selezionare un prodotto.
            System.out.print("\nSeleziona un prodotto da aggiungere al carrello (1-" + catalogo.size()/*indica semplicemente il numero degli oggetti presente nell'array anzichè scrivere 4 in formato stringa */ + "): ");
            
            
                int scelta = scanner.nextInt();
                scanner.nextLine(); //serve a pulire il buffer, quando si fa un invio oltre che il numero-lettere viene salvato \n perchè schiacciamo il tasto invio, questo causa un errore nel programma.
                
                if (scelta >= 1 && scelta <= catalogo.size()) {
                    Prodotto prodottoScelto = catalogo.get(scelta -1 /*per migliorare la leggibilià faccio in modo che l'utente scelga da 1-4 e non da 0-3, quindi sottraggo 1 */);
                    double prezzoFinale = prodottoScelto.calcolaPrezzoFinale();
                    
                    // Aggiunge il prezzo finale del prodotto al totale del carrello.
                    totaleCarrello += prezzoFinale;
                    System.out.println("Prodotto aggiunto al carrello. Totale parziale: " + totaleCarrello + " euro.");
            }
            
            // Chiede all'utente se vuole aggiungere altri prodotti.
            System.out.print("\nVuoi aggiungere un altro prodotto? (s/n): ");
            risposta = scanner.nextLine();
            
        } while (risposta.equalsIgnoreCase("s")); //Il ciclo while offre la possibilità di eseguire un numero qualsiasi di istruzioni, purché una condizione precedentemente definita sia vera.
        while (!risposta.equalsIgnoreCase("n")); //! è l'operatore not, quindi rende il valore di risposta false, quindi il programma termina

        // Stampa il totale finale del carrello e termina il programma.
        System.out.println("\n Riepilogo Carrello ");
        System.out.printf("Il totale finale del carrello è: " + totaleCarrello);
        
        
        scanner.close(); // Chiude lo scanner.
    }
}
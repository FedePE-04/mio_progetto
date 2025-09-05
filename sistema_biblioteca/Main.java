import Model.Libro;
import Service.Biblioteca;

public class Main {
     public static void main(String[] args) {
        //String[] newLibro = ["Harry Potter","autore","100"];
        Biblioteca b1 = new Biblioteca("Vasto");

        Libro l1 = new Libro("Vasto", "Adesso parlo io!","Federico Pavone", 2004, true);
        Libro l2 = new Libro("Gamberale", "Piove", "Alessio", 2003, false);
        Libro l3 = new Libro("Vacri", "La funzione era sbagliata", "Domenico", 2007, true);



        
        b1.aggiungereLibro(l1);
        b1.aggiungereLibro(l2);
        b1.aggiungereLibro(l3);

        //b1.visualizzaElenco(); --METODO ELIMINATO--

        //facciamo una ricerca libro per titolo
        b1.cercaLibroPerTitolo("piove");  
        b1.cercaLibroPerTitolo("la funzione era sbagliata");
        b1.cercaLibroPerTitolo("Adesso parlo io!");



        //visualizziamo i libri disponibili
        b1.libri_disponibili();

        //prendiamo in prestito un libro
        b1.prestito_Libro(l1);

        //non da nessun risultato perchè il libro non è disponibile
        b1.prestito_Libro(l2);

        // ora l1 non è piu disponibile
        b1.libri_disponibili();


        // ora l1 è stato restituito
        b1.retituisci_libro(l1);
        b1.retituisci_libro(l2);

        //possiamo ora notare che tutti i libri sono sttati restituiti quindi ora sono disponibili
        b1.libri_disponibili();




        System.out.println();

}

}

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


        b1.cercaLibroPerTitolo("Piove");

        b1.prestito_Libro("Adesso parlo io!");

        // ora l1 non è piu disponibile
        b1.prestito_Libro("Adesso parlo io!");

        b1.prestito_Libro("la funzione era sbagliata");


        System.out.println();

}

}

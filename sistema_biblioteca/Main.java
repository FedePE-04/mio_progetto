public class Main {
     public static void main(String[] args) {
        //String[] newLibro = ["Harry Potter","autore","100"];
        Biblioteca b1 = new Biblioteca("Vasto");
        Libro l1 = new Libro("CIao", "FEderico", 2004, "Vasto");
        Libro l2 = new Libro("Piove", "Alessio", 2004, "Gamberale");

        b1.aggiungereLibro(l1);
        b1.aggiungereLibro(l2);
        b1.visualizzaElenco();


        b1.cercaLibroPerTitolo("Piove");



}

}

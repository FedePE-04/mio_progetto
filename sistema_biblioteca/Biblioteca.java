import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Biblioteca {
    public List<Libro> lista_libri = new ArrayList<>();
    private String sede;
    public Biblioteca(String sede) {
        this.sede = sede;
    }

    //metodo aggiungi libro
    public void aggiungereLibro(Libro libro){
        lista_libri.add(libro);
        System.out.println("il libro si chiama: " + libro.getTitolo() + " e il suo autore è:  " + libro.getAutore() + " è stato prodotto nell'anno " + libro.getAnno() );
    }

    //visualizza elenco libri
    public List<Libro> visualizzaElenco(){
        for (Libro libro : lista_libri){
            System.out.println("titolo: " + libro.getTitolo() + ", autore: " + libro.getAutore() + ", anno: " + libro.getAnno());
        }
        return lista_libri;
    }

    public void cercaLibroPerTitolo(String titolo){
        List<Libro> libri_trovati = new ArrayList<>();
        System.out.println("\n\nLista libri trovati: ");
        for (Libro libro : lista_libri){
            if(libro.getTitolo().equalsIgnoreCase(titolo)) {
                libri_trovati.add(libro);
                System.out.println(libro.getTitolo() + ", " + libro.getAutore() + ", " + libro.getAnno());
            }
        }
    }
}
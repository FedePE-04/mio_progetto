package Service;
import java.util.ArrayList;
import java.util.List;

import Model.Libro;

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

    public String getSede(){
        return sede;
    }
    public void setSede(String nuovaSede){ this.sede = nuovaSede;}
    // //visualizza elenco libri ----ELIMINATO----
    // public List<Libro> visualizzaElenco(){
    //     for (Libro libro : lista_libri){
    //         System.out.println("titolo: " + libro.getTitolo() + ", autore: " + libro.getAutore() + ", anno: " + libro.getAnno());
    //     }
    //     return lista_libri;
    // }

    // STEP 4Rimuovere temporaneamente la ricerca per titolo (regressione intenzionale):

    // public void cercaLibroPerTitolo(String titolo){
    //     List<Libro> libri_trovati = new ArrayList<>();
    //     System.out.println("\n\nLista libri trovati: ");
    //     for (Libro libro : lista_libri){
    //         if(libro.getTitolo().equalsIgnoreCase(titolo)) {
    //             libri_trovati.add(libro);
    //             System.out.println(libro.getTitolo() + ", " + libro.getAutore() + ", " + libro.getAnno());
    //         }
    //     }
    // }

    // Introdurre la funzione di prestito libro:
    // un utente può prendere in prestito un libro, che diventa non disponibile.

    public void prestito_Libro(String titilo){
        List<Libro> libri_disponibili = new ArrayList<>();
        for (Libro libro : lista_libri)
        if (libro.getDisponibilita() == true){
            libri_disponibili.add(libro);
            System.out.println("libro: " + libro.getTitolo() + ", " + libro.getAutore() + ", " + libro.getAnno()+ " disponibile");  
            libro.setDisponibilita(false);                      
        } 
        // else {
        //     System.out.println("libro: " + libro.getTitolo() + ", " + libro.getAutore() + ", " + libro.getAnno()+ " non disponibile");
        // }
    }
}
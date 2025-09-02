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
        return lista_libri;
    }


    
}


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Biblioteca {
    private String sede;
    public Biblioteca(String sede) {
        this.sede = sede;
    
      
    }

    public List<Libro> lista_libri = new ArrayList<>();


   //metodo aggiungi libro
    public void aggiungereLibro(Libro libro){
        lista_libri.add(libro);
        System.out.println("il libro: " + libro);
        
        
    }

    //visualizza elenco libri
     public List<Libro> visualizzaElenco(){
        return lista_libri;
    }


    
}


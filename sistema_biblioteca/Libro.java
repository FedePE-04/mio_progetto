public class Libro extends Biblioteca{
    String titolo;
    String autore;
    int anno;
    boolean disponibilita;

    public Libro( String sede, String titolo,String autore,int anno, boolean disponibilita){
        super(sede);
        this.titolo = titolo;
        this.autore = autore;
        this.anno = anno;
        this.disponibilita = disponibilita;
    }


    //get
    public String getTitolo(){ return titolo; }
    public String getAutore(){ return autore; }
    public int getAnno(){ return anno; }
    public boolean getDisponibilita(){ return disponibilita; }

    //set
    public void setTitolo(String nuovoTitolo){ this.titolo = nuovoTitolo; }
    public void setAutore(String nuovoAutore){ this.autore = nuovoAutore; }
    public void setAnno(int nuovoAnno){ this.anno = nuovoAnno; }
    public void setDisponibilita(boolean nuovaDisponibilita){ this.disponibilita = nuovaDisponibilita; }

}
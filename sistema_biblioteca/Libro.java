public class Libro extends Biblioteca{
    String titolo;
    String autore;
    int anno;

    public Libro(String titolo,String autore,int anno, String sede){
        super(sede);
        this.titolo = titolo;
        this.autore = autore;
        this.anno = anno;
    }


    //get
    public String getTitolo(){ return titolo; }
    public String getAutore(){ return autore; }
    public int getAnno(){ return anno; }

    //set
    public void setTitolo(String nuovoTitolo){ this.titolo = nuovoTitolo; }
    public void setAutore(String nuovoAutore){ this.autore = nuovoAutore; }
    public void setAnno(int nuovoAnno){ this.anno = nuovoAnno; }
}
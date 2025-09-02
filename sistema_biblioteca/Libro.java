

public class Libro extends Biblioteca{
    String Titolo;
    String Autore;
    int Anno;
public Libro(String Titolo,String Autore,int Anno, String sede){
    super(sede);
    this.Titolo = Titolo;
    this.Autore = Autore;
    this.Anno = Anno;
}


//get
 public String getTitolo(){
        return Titolo;}

  public String getAutore(){
        return Autore;
    }       
 public int getAnno(){
        return Anno;
    }

    //set
    public void setTitolo(String nuovoTitolo){
        this.Titolo = nuovoTitolo;
    }

public void setAutore(String nuovoAutore){
        this.Autore = nuovoAutore;
    }
public void setAnno(int nuovoAnno){
        this.Anno = nuovoAnno;
    }

}
    



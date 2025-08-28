package sistema_prenotazioni;

public class Prenotazione {
    private String cliente;
    private int data;
    private int postiRichiesti;

    public boolean validaPrenotazione(int postiDisponibili){
        if(postiRichiesti == postiDisponibili){
            System.out.println("La tua prenotazione è andata con successo!");
            return true;
            
        }else{ 
            System.out.println("non ci sono posti disponibili!");
            return false;
        }
    }

    public void stampaDettagli(){
        System.out.println("Il nome del cliente è: "+ cliente + "e la data della prenotazione è: " + data);
    }
    //costruttore
    public Prenotazione(String cliente, int data, int postiRichiesti){
        this.cliente = cliente;
        this.data = data;
        this.postiRichiesti = postiRichiesti;
    }

    //get 
    public String getCliente(){
        return cliente;
    }
    public int getData(){
        return data;
    }
    public int getpostiRichiesti(){
        return postiRichiesti;
    }
    //set
    public void setCliente(String nuovoCliente){
        this.cliente = nuovoCliente;
    }
    public void setData(int nuovaData){
        this.data = nuovaData;
    }
    public void setPostiRichiesti(int nuovoPosto){
        this.postiRichiesti = nuovoPosto;
    }
}

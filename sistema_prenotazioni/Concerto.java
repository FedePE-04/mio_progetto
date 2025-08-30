package sistema_prenotazioni;

public class Concerto extends Prenotazione{
    public Concerto(String cliente,int data, int postiRichiesti){
        super(cliente,data,postiRichiesti);
    }
    @Override
    public boolean validaPrenotazione(int postiDisponibili){
        if(getpostiRichiesti() <= postiDisponibili && getpostiRichiesti() <= 5){
            System.out.println("La tua prenotazione è andata con successo!");
            return true;
        }else{
            System.out.println("non ci sono posti disponibili!");
            return false;
        }
    }
}
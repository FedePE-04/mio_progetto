package sistema_prenotazioni;

public class Aereo extends Prenotazione {
    int classeEconomy;
    int classeBusiness;
    public Aereo (String cliente, int data, int postiRichiesti, int classeEconomy, int classeBusiness){
        super(cliente, data, postiRichiesti);
        this.classeEconomy = classeEconomy;
        this.classeBusiness = classeBusiness;
    }
    @Override
    public boolean validaPrenotazione(int postiDisponibili){
        if(getpostiRichiesti()<= postiDisponibili && getpostiRichiesti()<= classeEconomy || getpostiRichiesti()<=classeBusiness){
            System.out.println("La tua prenotazione è andata con successo!");
            return true;
        }else{
            System.out.println("non ci sono posti disponibili!");
            return false;
        }
        }
    }
    

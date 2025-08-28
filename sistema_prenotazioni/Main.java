package sistema_prenotazioni;

public class Main {
    public static void main(String[] args) {
        

        

Prenotazione p1 = new Prenotazione("mario rossi", 2024,6 );
Prenotazione p2 = new Concerto("massimo", 2023, 4);
Prenotazione p3 = new Aereo("federico", 2022, 2, 1, 0);

Prenotazione[] prenotazione = {p1,p2,p3};

for(int i = 0; i<prenotazione.length; i++){
    prenotazione[i].validaPrenotazione(4);
   
    }
}
    }

    





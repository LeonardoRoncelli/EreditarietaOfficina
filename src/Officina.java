public class Officina{
    public double ripara(Veicolo riparazione){
        double prezzo=0;
        if(riparazione.getGuasto()){
            riparazione.setGuasto(false);
            if(riparazione instanceof Vettura){
                prezzo=5000;
            }
            else if(riparazione instanceof Motociclo){
                prezzo=2000;
            }
        }
        return prezzo;
    }
}
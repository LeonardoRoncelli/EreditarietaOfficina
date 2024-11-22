public class UsaVeicoli {
    public static void main(String[]args){
        Officina officina=new Officina();
        Vettura auto1=new Vettura("Gran Turismo","GN108WB","Porsche","911 Carrera",true);
        Vettura auto2=new Vettura("Utilitaria","AS246CG","Fiat","Panda",true);
        Motociclo moto1=new Motociclo(125,"DE71464","Piaggio","Vespa Primavera",true);
        Veicolo[]veicoli={auto1,auto2,moto1};
        System.out.println("Il veicolo riparato è targato: "+veicoli[1].getTarga()+", prezzo riparazione: "+officina.ripara(auto2));
        System.out.println("Il veicolo riparato è targato: "+veicoli[2].getTarga()+", prezzo riparazione: "+officina.ripara(moto1));
        for(int i=0;i< veicoli.length;i++){
            if(veicoli[i].getGuasto()){
                System.out.println("Veicolo ancora guasto da riparare: "+veicoli[i].getTarga()+ ", costo di riparazione: "+officina.ripara(auto1));
            }
        }
    }
}
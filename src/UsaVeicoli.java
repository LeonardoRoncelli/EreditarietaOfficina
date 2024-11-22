public class UsaVeicoli {
    public static void main(String[]args){
        Vettura auto1=new Vettura("Gran Turismo","GN108WB","Porsche","911 Carrera",false);
        Vettura auto2=new Vettura("Utilitaria","AS246CG","Fiat","Panda",true);
        Motociclo moto1=new Motociclo(125,"DE71464","Piaggio","Vespa Primavera",false);
        Veicolo[]veicoli={auto1,auto2,moto1};
        for(int i=0;i< veicoli.length;i++){
            if(veicoli[i].getGuasto()){
                System.out.println(veicoli[i].getTarga());
            }
        }
    }
}
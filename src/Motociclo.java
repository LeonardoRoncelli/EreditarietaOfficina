public class Motociclo extends Veicolo{
    private int cilindrata;
    public Motociclo(int cilindrata,String targa,String marca,String modello,boolean guasto){
        super(targa,marca,modello,guasto);
        this.cilindrata=cilindrata;
    }
    public void setCilindrata(int cilindrata){
        this.cilindrata=cilindrata;
    }
    public int getCilindrata(){
        return cilindrata;
    }
}
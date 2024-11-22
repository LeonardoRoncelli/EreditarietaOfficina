public class Vettura extends Veicolo{
    private String tipologia;
    public Vettura(String tipologia,String targa,String marca,String modello,boolean guasto){
        super(targa,marca,modello,guasto);
        this.tipologia=tipologia;
    }
    public void setTipologia(String tipologia){
        this.tipologia=tipologia;
    }
    public String getTipologia(){
        return tipologia;
    }
}
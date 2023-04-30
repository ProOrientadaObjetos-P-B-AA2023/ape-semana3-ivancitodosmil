package problema4;
public class Problema4 {
        public static void main(String[] args) {
        Celular equipo= new Celular("ios",4.1,960.50,12.0,"00:1A:55:12:2A:C3","021928/11/358027/9");
        equipo.calcularIvaCostoInicial();
        equipo.calcularCostoFinal();
        System.out.println(equipo);
    }
}
class Celular{
    private String sistemaoperativo;
    private double tamañopantalla;
    private double costoinicial;
    private double ivaporcentaje;
    private double ivacostoinicial;
    private double costofinal;
    private String direccionmac;
    private String informacionimei;
    //Constructores
    public Celular(){}
    public Celular(String sistemaoperativo, double tamañopantalla, double costoinicial,double ivaporcentaje,String direccionmac, String informacionimei){
        this.sistemaoperativo=sistemaoperativo;
        this.tamañopantalla=tamañopantalla;
        this.costoinicial=costoinicial;
        this.ivaporcentaje=ivaporcentaje;
        this.direccionmac=direccionmac;
        this.informacionimei=informacionimei;
    }
    
    public void calcularIvaCostoInicial(){
        this.ivacostoinicial=(this.costoinicial*(this.ivaporcentaje/100));
    }
    public void calcularCostoFinal(){
        this.costofinal=(this.costoinicial*(this.ivaporcentaje/100))+this.costoinicial;
    }
    
    public void setSistemaOperativo(String sistemaoperativo){
        this.sistemaoperativo=sistemaoperativo;
    }
    public void setTamañoPantalla(double tamañopantalla){
        this.tamañopantalla=tamañopantalla;
    }
    public void setCostoInicial(double costoinicial){
        this.costoinicial=costoinicial;
    }
    public void setIvaPorcentaje(double ivaporcentaje){
        this.ivaporcentaje=ivaporcentaje;
    }
    public void setIvaCostoInicial(double ivacostoinicial){
        this.ivacostoinicial=ivacostoinicial;
    }
     public void setCostoFinal(){
        this.costofinal=costofinal;
    }
    public void setDireccionMac(String direccionmac){
        this.direccionmac=direccionmac;
    }
    public void setInformacionIMEI(String infoimei){
        this.informacionimei=informacionimei;
    }
   
    public String getSistemaOperativo(){
        return this.sistemaoperativo;
    }
    public double getTamañoPantalla(){
        return this.tamañopantalla;
    }
    public double getCostoInicial(){
        return this.costoinicial;
    }
    public double getIvaPorcentaje(){
        return this.ivaporcentaje;
    }
    public double getIvaCostoInicial(){
        return this.ivacostoinicial;
    } 
    public double getCostoFinal(){
        return this.costofinal;
    }
    public String getDireccionMac(){
        return this.direccionmac;
    }
    public String getInformacionIMEI(){
        return this.informacionimei;
    }
     
    public String toString(){
        String presentar= String.format("Equipo Celular"+
                        "\n Sistema Operativo: %s"+
                        "\n Tamaño Pantalla: %.2f"+
                        "\n Costo Inicial: %.2f"+
                        "\n Iva Porcentaje: %.2f"+
                        "\n Iva Costo Inicial: %.2f" +
                        "\n Costo Final: %s"+
                        "\n Dirección MAC: %s" +
                        "\n Información IMEI: %s",
                this.getSistemaOperativo(),this.getTamañoPantalla(),this.getCostoInicial(), this.getIvaPorcentaje(), this.getIvaCostoInicial(),
                this.getCostoFinal(),this.getDireccionMac(), this.getInformacionIMEI());
        return presentar;
    }
}
    

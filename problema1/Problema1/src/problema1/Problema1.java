package problema1;
    class terreno{
    private double costoterreno;
    private double anchoterreno;
    private double largoterreno;
    private double areaterreno;
    private double valorMetroCuadrado;
    public terreno(){}
    public terreno(double anchoterreno, 
            double largoterreno, 
            double valorMetroCuadrado){
        this.anchoterreno = anchoterreno;
        this.largoterreno = largoterreno;
        this.valorMetroCuadrado = valorMetroCuadrado;
    }
    public void setAncho(double ancho_terreno){
        this.anchoterreno = anchoterreno;
    }
    public void setLargo(double largo_terreno){
        this.largoterreno = largoterreno;
    }
    public void setValorMetroCuadrado(double valorMetroCuadrado){
        this.valorMetroCuadrado = valorMetroCuadrado;
    }
      public void calcularAreaTerreno(){
        this.areaterreno = this.largoterreno*this.anchoterreno;
    }
     public void calcularCostoTerreno(){
        this.costoterreno = this.areaterreno*this.valorMetroCuadrado;
    }
    public double getCosto_Terreno(){
        return this.costoterreno;
    }
     public double getAncho(){
        return this.anchoterreno;
    }
     public double getLargo(){
        return this.largoterreno;
    }
     public double getArea(){
        return this.areaterreno;
    }
     public double getValorMetroCuadrado(){
        return this.valorMetroCuadrado;
    }
     
     public String toString(){
         String msj = String.format("DATOS DE TERRENO "
                 + "\nAncho del Terreno %.2f "
                 + "\nLargo del Terreno %.2f "
                 + "\nValor metro cuadrado del Terreno %.2f "
                 + "\nValor del area %.2f "
                 + "\nValor del terreno %.2f ",
                 this.getAncho(),this.getLargo(),
                 this.getValorMetroCuadrado(),this.getArea(),
                 this.getCosto_Terreno());
         return msj;
     }
}

public class Problema1 {
    public static void main(String[] args) {
        terreno terreno1 = new terreno(10,2,2);
        terreno1.calcularAreaTerreno();
        terreno1.calcularCostoTerreno();
        System.out.println(terreno1);
    }
    
}
package problema2;
public class Problema2 {
public static void main(String[] args) {
        Equivalentehora equivalencia = new Equivalentehora(35);
        equivalencia.CalcularDias();
        equivalencia.CalcularMinutos();
        equivalencia.CalcularSegundos();
        System.out.println(equivalencia);
    }
}
class Equivalentehora {
    private int horas;
    private double dias;
    private int minutos;
    private int segundos;
    
    //Constructores
    public Equivalentehora(){}
    public Equivalentehora(int horas) {
        this.horas=horas;
    }
    
      public void CalcularDias(){
        this.dias = (double) (this.horas / 24.0);
    }
    public void CalcularMinutos(){
        this.minutos = this.horas * 60;
    }
    public void CalcularSegundos(){
        this.segundos = this.horas * 3600;
    }
    
    public void setDias(double dias){
        this.dias=dias;
    }
    public void setHoras(int horas){
        this.horas=horas;
    }
    public void setMinutos(int minutos){
        this.minutos=minutos;
    }
    public void setSegundos(int segundos){
        this.segundos=segundos;
    }
    
    public double getDias() {
        return this.dias;
    }
    public int getHoras() {
        return this.horas;
    }

    public int getMinutos() {
        return this.minutos;
    }

    public int getSegundos() {
        return this.segundos;
    }
    
    public String toString() {
        String presentar = String.format("Equivalente"+
                        "\n Días: %.2f" +
                        "\n Horas: %d" +
                        "\n Minutos: %d" +
                        "\n Segundos: %d",
                getDias(), getHoras(), getMinutos(), getSegundos());
        return presentar;
    }
}
   
 

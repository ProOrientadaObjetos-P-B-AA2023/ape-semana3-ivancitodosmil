package problema3;
public class Problema3 {
 public static void main(String[] args) {
        Institucioneducativa institucion= new Institucioneducativa("La Dolorosa","Fiscomisional", 1500,30,1,500);
        institucion.Presupuesto();
        System.out.println(institucion);
    }
}

class Institucioneducativa {
    private String nombre;
    private String tipoinstitucion;
    private int numeroalumnos;
    private int numerodocentes;
    private int numerosedes;
    private double gastosproyectados;
    private double presupuesto;
    //Constructores
    public Institucioneducativa(){}
    public Institucioneducativa(String nombre, String tipoinstitucion, int numeroalumnos, int numerodocentes, int numerosedes, double gastosproyectados) {
        this.nombre = nombre;
        this.tipoinstitucion = tipoinstitucion;
        this.numeroalumnos = numeroalumnos;
        this.numerodocentes = numerodocentes;
        this.numerosedes = numerosedes;
        this.gastosproyectados = gastosproyectados;
    }
   
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    public void setTipoInstitucion(String tipoinstitucion){
        this.tipoinstitucion=tipoinstitucion;
    }
    public void setNumeroAlumnos(int numeroalumnos){
        this.numeroalumnos=numeroalumnos;
    }
    public void setNumeroDocentes(int numerodocentes){
        this.numerodocentes=numerodocentes;
    }
    public void setNumeroSedes(int numerosedes){
        this.numerosedes=numerosedes;
    }
    public void setGastosProyectados(double gastosproyectados){
        this.gastosproyectados=gastosproyectados;
    }
    
    public void Presupuesto(){
        this.presupuesto=this.numeroalumnos*this.gastosproyectados;
    }
    
    public String getNombre() {
        return this.nombre;
    }
    public String getTipoInstitucion() {
        return this.tipoinstitucion;
    }
    public int getNumeroAlumnos() {
        return this.numeroalumnos;
    }
    public int getNumeroDocentes() {
        return this.numerodocentes;
    }
    public int getNumeroSedes() {
        return this.numerosedes;
    }
    public double getGastosProyectados() {
        return this.gastosproyectados;
    }
    public double getPresupuesto() {
        return this.presupuesto;
    }

    public String toString() {
        String presentar = String.format("Institución Educativa"+
                        "\n Nombre: %s" +
                        "\n Tipo: %s" +
                        "\n Número Alumnos: %d" +
                        "\n Número Docentes: %d" +
                        "\n Número Sedes: %d" +
                        "\n Gastos Proyectados: %.2f" +
                        "\n Presupuesto: %.2f", 
                this.getNombre(), this.getTipoInstitucion(), this.getNumeroAlumnos(), this.getNumeroDocentes(), this.getNumeroSedes(),
                this.getGastosProyectados(), this.getPresupuesto());
        return presentar;
    }
}   


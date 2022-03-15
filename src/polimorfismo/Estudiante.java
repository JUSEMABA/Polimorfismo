
package polimorfismo;


public class Estudiante extends Persona {
    
    private double promedio;
    private String carrera;
    private String codigo;
    
    public void imprimir(){
        super.imprimir();
        System.out.println(getCodigo()+"\t"+getCarrera()+"\t"+getPromedio());
    }

    
    public double getPromedio() {
        return promedio;
    }

    
    public void setPromedio(double promedio) {
        this.promedio = promedio;
    }

    
    public String getCarrera() {
        return carrera;
    }

    
    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    
    public String getCodigo() {
        return codigo;
    }

    
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
}

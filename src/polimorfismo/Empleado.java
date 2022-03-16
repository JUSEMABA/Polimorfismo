
package polimorfismo;


public class Empleado extends Persona{
    private String cargo;
    private double salario;
    
    public void imprimir(){
        super.imprimir();
        System.out.println(getCargo()+"\t"+getSalario());
    }

    
    public String getCargo() {
        return cargo;
    }

   
    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    
    public double getSalario() {
        return salario;
    }

    
    public void setSalario(double salario) {
        this.salario = salario;
    }
}

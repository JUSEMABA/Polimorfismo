
package polimorfismo;

public class Persona {
    private String nombre;
    private long documento;
    private int edad;
    private String telefono;
    
    public void imprimir(){
        System.out.println(getNombre()+"\t"+getDocumento()+"\t"+getEdad()+"\t"+getTelefono());
    }

   
    public String getNombre() {
        return nombre;
    }

    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    
    public long getDocumento() {
        return documento;
    }

    
    public void setDocumento(long documento) {
        this.documento = documento;
    }

    
    public int getEdad() {
        return edad;
    }

    
    public void setEdad(int edad) {
        this.edad = edad;
    }

    
    public String getTelefono() {
        return telefono;
    }

    
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    
}

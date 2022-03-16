
package polimorfismo;

import java.util.*;
public class Principal {

    
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        ArrayList<Persona> lista=new ArrayList<Persona>();
        boolean salir=false;
        while(salir !=true){
            System.out.println("1.Agregar Persona");
            System.out.println("2.Agregar Estudiante");
            System.out.println("3.Agregar Empleado");
            System.out.println("4.Listar");
            System.out.println("5.Salir");
            switch(leer.nextInt()){
                case 1:
                    Persona per=new Persona();
                    System.out.println("Escriba el nombre");
                    per.setNombre(leer.next());
                    System.out.println("Escriba el documento");
                    per.setDocumento(leer.nextLong());
                    System.out.println("Escriba la edad");
                    per.setEdad(leer.nextInt());
                    System.out.println("Escriba el telefono");
                    per.setTelefono(leer.next());
                    lista.add(per);
                    break;
                case 2:
                    Estudiante est=new Estudiante();
                    System.out.println("Escriba el nombre");
                    est.setNombre(leer.next());
                    System.out.println("Escriba el documento");
                    est.setDocumento(leer.nextLong());
                    System.out.println("Escriba la edad");
                    est.setEdad(leer.nextInt());
                    System.out.println("Escriba el telefono");
                    est.setTelefono(leer.next());
                    System.out.println("Escriba el codigo");
                    est.setCodigo(leer.next());
                    System.out.println("Escriba el promedio");
                    est.setPromedio(leer.nextDouble());
                    System.out.println("Escriba la carrera");
                    est.setCarrera(leer.next());
                    lista.add(est);
                    break;
                case 3:
                    Empleado emp=new Empleado();
                    System.out.println("Escriba el nombre");
                    emp.setNombre(leer.next());
                    System.out.println("Escriba el documento");
                    emp.setDocumento(leer.nextLong());
                    System.out.println("Escriba la edad");
                    emp.setEdad(leer.nextInt());
                    System.out.println("Escriba el telefono");
                    emp.setTelefono(leer.next());
                    System.out.println("Escriba el cargo");
                    emp.setCargo(leer.next());
                    System.out.println("Escriba el salario");
                    emp.setSalario(leer.nextDouble());
                    lista.add(emp);
                    break;
                case 4:
                    for(int i=0;i<lista.size();i++){
                        lista.get(i).imprimir();
                    }
                    break;
                default :
                    salir=true;
            }
        }
       
    }
    
}

package sv.edu.udb.empleados;

/**
 *
 * @author Oscar Hernández
 */
import javax.swing.JOptionPane;
import java.util.*;
public class Segundo {   
    
    public static void main(String[] args) {       
     String salida;
     int numEmpleados;
     int horasExtra;
     String nombres,apellidos,dui,nit;           
     String entrada;     

        ArrayList <Analista> listaEmpleado = new ArrayList();
        entrada = JOptionPane.showInputDialog("¿Cuántos empleados desea almacenar?");
        numEmpleados = Integer.parseInt(entrada);
        
        for(int i =0;i<numEmpleados;i++){
        nombres = JOptionPane.showInputDialog("Ingrese nombres del empleado");
        apellidos = JOptionPane.showInputDialog("Ingrese apellidos del empleado");
        dui = JOptionPane.showInputDialog("Ingrese el número de DUI");
        nit = JOptionPane.showInputDialog("Ingrese el número de NIT");
        entrada = JOptionPane.showInputDialog("Ingrese la cantidad de horas extra trabajadas");
        horasExtra = Integer.parseInt(entrada);
        
        Analista empleadoAnalista = new Analista(nombres,apellidos,dui,nit,horasExtra);
        empleadoAnalista.calcularSalario(horasExtra);
        listaEmpleado.add(empleadoAnalista);
        }
        
        //Mostrar empleados
        for(int i = 0; i< listaEmpleado.size(); i++){
            salida = "******INFORMACIÓN DEL EMPLEADO******";
            salida += "\nEmpleado/a: "+ listaEmpleado.get(i).getNombres();
            salida += " "+listaEmpleado.get(i).getApellidos();
            salida +="\nSueldo sin descuentos: "+listaEmpleado.get(i).getSueldo();
            salida +="\n*******DESCUENTOS*******";
            salida +="\nISSS: " + listaEmpleado.get(i).getIsss();
            salida +="\nAFP: " + listaEmpleado.get(i).getAfp();
            salida +="\nISR: " + listaEmpleado.get(i).getIsr();
            salida +="\nSueldo liquido: "+ listaEmpleado.get(i).getSueldoLiquido();
            
            JOptionPane.showMessageDialog(null,salida,"Empleados",JOptionPane.PLAIN_MESSAGE);
        }
        
    }
}

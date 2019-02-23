package sv.edu.udb.empleados;

/**
 *
 * @author Oscar Hernández
 */
public abstract class Empleados {
    
    private String nombres;
    private String apellidos;
    private String dui;
    private String nit;
    /**
     * @return the nombres
     */
    public String getNombres() {
        return nombres;
    }

    /**
     * @param nombres the nombres to set
     */
    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    /**
     * @return the apellidos
     */
    public String getApellidos() {
        return apellidos;
    }

    /**
     * @param apellidos the apellidos to set
     */
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    /**
     * @return the dui
     */
    public String getDui() {
        return dui;
    }

    /**
     * @param dui the dui to set
     */
    public void setDui(String dui) {
        this.dui = dui;
    }

    /**
     * @return the nit
     */
    public String getNit() {
        return nit;
    }

    /**
     * @param nit the nit to set
     */
    public void setNit(String nit) {
        this.nit = nit;
    }
    public Empleados(String nombre, String apellido, String dui, String nit){
       this.nombres = nombre;
       this.apellidos = apellido;
       this.dui = dui;
       this.nit = nit;        
    }
    
    public Empleados(){
    
    }
}

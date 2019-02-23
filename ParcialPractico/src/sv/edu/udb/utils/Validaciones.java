package sv.edu.udb.utils;

/**
 *
 * @author Oscar Hernández
 */
public class Validaciones {
    
    public static boolean validarDui(String dui){
    
        return dui.matches("^[0-9]{8}[-]{1}[0-9]{1}$");
    }
    
    public static boolean validarNit(String nit){
    
    return nit.matches("^[0-9]{4}[-]{1}[0-9]{6}[-]{1}[1-9]{3}[-]{1}[0-9]{1}$");
    }
}

package sv.edu.udb.empleados;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 *
 * @author Oscar Hernández
 */
public class Analista extends Empleados {
    private int horasExtra;
    private double sueldo;
    private double sueldoLiquido;
    final private double sueldoBase = 800;
    private double isss;
    private double afp;
    private double isr;

    /**
     * @return the isss
     */
    public double getIsss() {
        return isss;
    }

    /**
     * @param isss the isss to set
     */
    public void setIsss(float isss) {
        this.isss = isss;
    }

    /**
     * @return the afp
     */
    public double getAfp() {
        return afp;
    }

    /**
     * @param afp the afp to set
     */
    public void setAfp(float afp) {
        this.afp = afp;
    }

    /**
     * @return the isr
     */
    public double getIsr() {
        return isr;
    }

    /**
     * @param isr the isr to set
     */
    public void setIsr(float isr) {
        this.isr = isr;
    }

    /**
     * @return the horas
     */
    public int getHoras() {
        return horasExtra;
    }

    /**
     * @return the sueldoLiquido
     */
    public double getSueldoLiquido() {
        return sueldoLiquido;
    }

    /**
     * @param sueldoLiquido the sueldoLiquido to set
     */
    public void setSueldoLiquido(double sueldoLiquido) {
        this.sueldoLiquido = sueldoLiquido;
    }

    /**
     * @param horas the horas to set
     */
    public void setHoras(int horas) {
        this.horasExtra = horas;
    }

    /**
     * @return the sueldo
     */
    public double getSueldo() {
        return sueldo;
    }

    /**
     * @param sueldo the sueldo to set
     */
    public void setSueldo(float sueldo) {
        this.sueldo = sueldo;
    }
    
    public Analista(String nombre,String apellido,String dui,String nit,int horasExtra){
        super(nombre,apellido,dui,nit);
        this.horasExtra = horasExtra;       
    }
    public Analista (){
    }
    
    public void calcularSalario(int horasExtra){
        
        if(horasExtra <= 20){
            sueldo = (sueldoBase + (horasExtra*9.25));
            this.sueldo = redondear(sueldo);
        }
        else if(horasExtra > 20){
            sueldo = (sueldoBase + ((horasExtra-20)*13.25)+(20*9.25));
            this.sueldo = redondear(sueldo);
        }
        isss=sueldo*0.0525;
        this.isss = redondear(isss);
        afp=sueldo*0.0688;
        this.afp = redondear(afp);
        isr=sueldo*0.10;
        this.isr = redondear(isr);
        sueldoLiquido = sueldo - (isss+afp+isr);
        this.sueldoLiquido = redondear(sueldoLiquido);
    }
    
    public double redondear(double Aux)
    {
        BigDecimal big = new BigDecimal(Aux);
        big = big.setScale(2, RoundingMode.HALF_UP);
        return big.doubleValue();
    }
}

package entidades;

/**
 *
 * @author franc
 */
public class Persona {
    private int edad;

    public Persona() {
    }

    public Persona(int edad) {
        this.edad = edad;
        
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    public boolean esMayorQue(){
        
        if (getEdad()>= 18) {
            System.out.println("Sos mayor de edad");
            return true;
        }else{
            System.out.println("Tomatela");
        }
        
        return false;
    }
}

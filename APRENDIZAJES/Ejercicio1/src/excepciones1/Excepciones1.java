package excepciones1;

import entidades.Persona;

/**
 *
 * @author franc
 */
public class Excepciones1 {

   
    public static void main(String[] args) {
       
        
        
        try{
            Persona persona = new Persona(null);
            persona.esMayorQue();
        }catch(Exception e){
            System.out.println("Error!"+e);
        }
        
        
    }

}

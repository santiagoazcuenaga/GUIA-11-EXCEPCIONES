package excepciones2;

import entidades.persona;

/**
 *
 * @author franc
 */
public class Excepciones2 {

   
    public static void main(String[] args) {
       
        try{
            
            persona [] vector = new persona [3];
            vector[0] = new persona("Franco");
            vector[1] = new persona("Lucas");
            vector[2] = new persona("Maxi");
            
            for (int i = 0; i < 4; i++) {
                System.out.println(vector[i].nombre);
            }
            
        }catch(Exception e){
            System.out.println("Error!!!!!! "+ e);
        }
        
        
    }

}

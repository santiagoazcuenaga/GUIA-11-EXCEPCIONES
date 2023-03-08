package excepcion3;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author franc
 */

/*
Defina una clase llamada DivisionNumero. En el método main utilice un Scanner para leer dos
números en forma de cadena. A continuación, utilice el método parseInt() de la clase Integer,
para convertir las cadenas al tipo int y guardarlas en dos variables de tipo int. Por ultimo realizar
una división con los dos numeros y mostrar el resultado.
 */
public class Excepcion3 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        try {
            String num = leer.next();
            String num2 = leer.next();
            int numero = Integer.parseInt(num);
            int numero2 = Integer.parseInt(num2);
            int Resultado = numero/numero2;
            System.out.println("Resultado: "+Resultado);

        } catch (InputMismatchException e) {
            System.out.println("Error!!1 "+e);
        }catch(NumberFormatException | ArithmeticException e){
            System.out.println("Error! "+e);
        }
    }

}

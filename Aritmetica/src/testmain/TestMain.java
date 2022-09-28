
package testmain;

import java.util.Scanner;
import operaciones.Operaciones;
/**
 *
 * @author jonat
 */
public class TestMain {
    
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        System.out.print("Cuantos numeros quieres operar:");
        int dimension = teclado.nextInt();
        int[] numeros = new int[dimension];
        
        for(int i=0; i<numeros.length; i++){
            System.out.print("Dame un numero: ");
            numeros[i] = teclado.nextInt();
            //System.out.println(dim[i]);
        }
        Operaciones num = new Operaciones(numeros);
        System.out.println("La suma de los numeros es: " + num.suma(numeros));
        System.out.println("La resta de los numeros es: " + num.resta(numeros));
        System.out.println("La multiplicacion de los numeros es: " + num.multiplicacion(numeros));
        num.division(numeros);
    }
}

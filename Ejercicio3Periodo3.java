
package ejercicio3.periodo3;
import java.util.Scanner;
public class Ejercicio3Periodo3 {
    public static void main(String[] args) {
        byte opcion = 0;
        Scanner lectura= new Scanner (System.in);
        do {
            System.out.println("1. Mostrar 100 numeros con un bucle for");
            System.out.println("2. Mostrar 100 numeros con un bucle while");
            System.out.println("3. Introduce un numero. Es mayor que cero?");
            System.out.println("Introduce un numero:");
            //Lo leemos y lo guardamos en la variable
            opcion = lectura.nextByte();
        } while (opcion<1 || opcion> 3);
        switch (opcion){
            case 1:
                System.out.println("opcion 1 ejecutada");
                break;
            case 2:
                System.out.println("opcion 2 ejecutada");
                break;
            case 3:
                System.out.println("opcion 3 ejecutada");
                break;
            default:
                System.out.println("Es imposible que el programa entre aqui");
        }
        
    }
    
}

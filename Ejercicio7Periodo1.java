
package ejercicio7.periodo1;
import java.util.Scanner;
public class Ejercicio7Periodo1 {
    public static void main(String[] args) {
        Scanner Entrada = new Scanner (System.in);
        float nota1, nota2, nota3, promedio;
        System.out.println ("Ingrese la primer nota");
        nota1= Entrada.nextFloat();
         System.out.println ("Ingrese la primer nota");
        nota2= Entrada.nextFloat();
         System.out.println ("Ingrese la primer nota");
        nota3= Entrada.nextFloat();
        promedio = (nota1 + nota2 + nota3) / 3;
         System.out.println ("El promedio es:" + promedio);
         if (promedio >= 7){
              System.out.println ("Promocionando");
         } else if (promedio >=4){
              System.out.println ("Regular");
         } else {
             System.out.println("Reprobado");
         }
    }
    
}
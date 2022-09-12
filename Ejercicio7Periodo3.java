
package ejercicio7.periodo3;
import java.util.Scanner;
public class Ejercicio7Periodo3 {
    public static void main(String[] args) {
     int Edad, suma = 0, contador =0, promedio=0;
     Scanner Teclado=new Scanner(System.in);
     do{
         System.out.println("Ingrese la edad de la persona");
         Edad= Teclado.nextInt();
         suma=suma+Edad;
         contador=contador+1;
         promedio=suma/contador;
         System.out.println("El promedio por ahora es" + promedio);
         if (promedio>25){
             break;
     }
    } while (Edad>0);
    System.out.println("La suma de la edad es:" +suma +"la cantidad de edades ingresadas fueron:"+contador);
    System.out.println("El promedio es igual a: " +promedio);
    if (promedio>25){
    System.out.println("El promedio fue mayor que 25 y ha finalizado ");
    }else {
        System.out.println("Reinicia el programa ya que el promedio no fue superior a 25");
}  
}
}
    


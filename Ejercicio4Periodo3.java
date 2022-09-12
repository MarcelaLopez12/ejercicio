
package ejercicio4.periodo3;
import java.util.Scanner;
public class Ejercicio4Periodo3 {
    public static void main(String[] args) {
        double peso;
        int cont1=0, cont2=0, piezas=0;
        Scanner entrada = new Scanner (System.in);
        
        do{
            System.out.println("Ingrese 0 para salir");
            System.out.println("Ingrese el peso:");
            peso = entrada.nextDouble();
            if (peso >=9.8 && peso <= 10.2);
            {
                cont1 = cont1 + 1;
                piezas++;
            }
            else if (peso > 0 && peso < 9.8){
                 cont2++;
                 piezas++;
            }
        }
      while (peso!=0);
        System.out.println("piezas entre 9.8 y 10.2:" +cont1);
        System.out.println("piezas menores a 9.8:" + cont2);
        System.out.println("cantidad de piezas:" +piezas);
    }
    
}

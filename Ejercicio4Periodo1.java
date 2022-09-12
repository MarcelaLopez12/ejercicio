
package ejercicio4.periodo1;
import java.util.Scanner
public class Ejercicio4Periodo1 {
    public static void main(String[] args) {
        int plato, cantidad;
        Scanner Entrada = new Scanner (System.in);
        System.out.println ("Ingrese 1 o 2 segun el plato que desea:");
        plato= Entrada.nextInt();
        System.out.println("Numero de ordenes:");
        cantidad = Entrada.nextInt();
        double totalInicial = 0, descuento, totalFinal = 0, precioplato1 = 5, precioplato2 = 7;
        if (plato ==1 ){
            if (cantidad >=1 & cantidad <=5){
                descuento = 0.05;
                totalInicial = cantidad * precioplato1;
                totalFinal = totalInicial-(totalInicial * descuento);
            } else if (cantidad >= 6 & cantidad <= 10){
                totalInicial = cantidad * precioplato2;
                descuento =0.07;
                totalFinal = totalInicial - (totalInicial * descuento);
            } else if (cantidad >= 11){
                totalInicial =cantidad * precioplato1;
                descuento = 0.09;
                totalFinal = totalInicial - (totalInicial * descuento);
            } else {
                System.out.println("Cantidad equivocada");
            }
        } else if (plato ==2){
      if (cantidad >=1 & cantidad <=5){
          totalInicial = cantidad * precioplato2;
          descuento = 0.06;
          totalFinal = totalInicial - (totalInicial * descuento);
      } else if (cantidad >= 6 & cantidad <= 10){
          totalInicial = cantidad * precioplato2;
          descuento = 0.09;
          totalFinal = totalInicial- (totalInicial *descuento);
      } else if (cantidad >= 11){
          totalInicial = cantidad * precioplato2;
          descuento = 0.12;
          totalFinal = totalInicial - (totalInicial * descuento);
      } else{
          System.out.println ("Cantidad equivocada");
      }
    } else{
            System.out.println("plato equivocado");
        }
        System.out.println ("El menu es:" + plato);
        System.out.println ("La cantidad es:" + cantidad);
        System.out.println ("El total inicial es:" + totalInicial);
        System.out.println ("El total final es:" + totalFinal);
    }
}

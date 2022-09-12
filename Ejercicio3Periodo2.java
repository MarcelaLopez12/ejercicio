
package ejercicio3.periodo2;
import java.util.Scanner;
public class Ejercicio3Periodo2 {
    public static void main(String[] args) {
       // programa de Java para demostrar 
       //declaraciones switch case anidadas
       String Branch = "CSE";
       int year = 2;
       
       switch (year)
       {
           case 1: 
               System.out.println ("cursos electivos: ingles, calculo");
               break;
           case 2:
               switch (Branch)//switch anidado
               {
                   case "CSE":
                   case "CCE":
                       System.out.println("Cursos electivos : Machine Learning, Big Data");
                       break;
                       
                   case "ECE":
                       System.out.println("Curso electivos : Programacion");
                       break;
                   default:
                       System.out.println("Cursos electivos : Ingenieria de Software");
               }
       }
    }
    
}

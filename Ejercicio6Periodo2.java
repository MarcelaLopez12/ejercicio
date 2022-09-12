
package ejercicio6.periodo2;
import java.util.Scanner;
public class Ejercicio6Periodo2 {
    public static void main(String[] args) {
        String tipoDia = "";
        String diaSemana = "Lunes";
        
        switch (diaSemana.toLowerCase()){
            case "Lunes":
                tipoDia = "Inicio de semana";
                break;
            case "martes":
            case "miercoles":
            case "jueves":
                tipoDia = "Mediados de semana";
                break;
            case "viernes":
                tipoDia = "Inicio de fin de semana";
                break;
            case "Sabado":
            case "Domingo":
                tipoDia = "Fin de semana";
                break;
                
        }
        System.out.println(diaSemana + "es" + tipoDia);
        
    }
    
}

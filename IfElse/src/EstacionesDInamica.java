import java.util.Scanner;
public class EstacionesDInamica {
public static void main (String args[]){
        
        var consola = new Scanner(System.in);
        
        System.out.println("Ingresa un mes en digito");
        var mes = Integer.parseInt(consola.nextLine());
        
        var estacion = "Estacion Desconocida";
        
        if (mes == 1 || mes == 2 || mes == 12){
            estacion = "Invierno";
        }
        else if (mes == 3 || mes == 4 || mes == 5){
            estacion = "Primavera";
        }
        else if (mes == 6 || mes == 7 || mes == 8){
            estacion = "Verano";
        }
        else if (mes == 9 || mes == 10 || mes == 11){
            estacion = "Otonio";
        }
        
        System.out.println("estacion = " + estacion);

}
}

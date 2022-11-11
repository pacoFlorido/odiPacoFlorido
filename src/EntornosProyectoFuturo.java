import java.util.Scanner;

public class EntornosProyectoFuturo {
    public static void main (String[] args){
        int modulos = 0, horas = 0;
        System.out.println("Estudiante " + args[0] + ": ");
        veredicto(modulos,horas);
    }
    private static String veredicto(int modulos, int horas){
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce  cuantos módulos tienes en tu grado: ");
        modulos = sc.nextInt();
        System.out.print("Introduce la cantidad de horas que dedicas al estudio a lo largo de la semana: ");
        horas = sc.nextInt();

        if (modulos == horas) System.out.println("Bien. Pero una hora de estudio para cada módulo puede ser insuficiente.");
        else if (modulos > horas) System.out.println("Poco tiempo de estudio. Debes dedicar más tiempo.");
        else System.out.println("Ideal. Trabajas los contenidos en casa.");
        return "Perfecto";
    }
}

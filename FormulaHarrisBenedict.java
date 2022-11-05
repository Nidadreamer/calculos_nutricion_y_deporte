import java.util.Scanner;

public class FormulaHarrisBenedict {

     /* Formula Harris - Benedict
        MB hombre: (10x peso en kg)+ (6.25 x altura en cm ) – (5 x edad en años) + 5
        MB mujer : (10 x peso en kg) + ( 6.25 x altura en cm ) – (5 x edad en años) – 161
     */

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce el peso en kg:");
            double peso = sc.nextDouble();
            double pesof = peso * 10;

        System.out.println("              ");
        System.out.println("Introduce la altura en cm:");
            double altura = sc.nextDouble();
            double alturaf = altura * 6.25;

        System.out.println("               ");
        System.out.println("Introduce la edad en años:");
            int years = sc.nextInt();
            int yearsf = years * 5;

        System.out.println("               ");
        System.out.println("Asigna la actividad estimada, introduce el número que corresponda <<usa la COMA entre los números>>:");
        System.out.println(" ");
        System.out.println("\33[35m  *********************************************************************************************");
        System.out.println("\33[39;49m1,2 ---> Poco o ningún ejercicio" + "                       " + "1,375 -> Ejercicio ligero (1-3 días a la semana)"+
            "\n1,55 --> Ejercicio moderado (3-5 días a la semana)" + "     " + "1,725 -> Ejercicio fuerte (6-7 días a la semana)"+
            "\n1,9 ---> Ejercicio muy fuerte (dos veces al día, entrenamientos muy duros)");
        System.out.println("\33[35m  *********************************************************************************************");
          double actividad = sc.nextDouble();

        System.out.println("             ");
        System.out.println("\33[39;49mIntroduce el sexo: \n1 si es hombres o 2 si es mujer");
            int sexo = sc.nextInt();

            if (sexo == 1) {
                double calculo = (pesof + alturaf - yearsf + 5) * actividad;
                System.out.println("\33[35m__________________________________________________________");
                System.out.println("\33[39;49m   Las calorías que necesita este hombre son: " + calculo );
                System.out.println("\33[35m__________________________________________________________");
            }
            else {
                double calculo = (pesof + alturaf - yearsf - 161) * actividad;
            System.out.println("\33[35m__________________________________________________________");
            System.out.println("\33[39;49m   Las calorías que necesita esta mujer son:  " + calculo );
            System.out.println("\33[35m__________________________________________________________");
            }

    }
}

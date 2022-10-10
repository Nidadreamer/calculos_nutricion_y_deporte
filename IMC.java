import java.util.Scanner;

public class IMC {

    /* Formula IMC Índice de Masa Corporal
        ¡¡Esta fórmula no da datos realistas en personas de alta masa muscular!!
        peso en kg / por la altura en metros al cuadrado
     */

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce el peso en kg:");
        double peso = scanner.nextDouble();

        System.out.println("                ");
        System.out.println("Introduce la altura en metros:");
        System.out.println("Por ejemplo: 1,75");
        double altura = scanner.nextDouble();
        double alturaF = altura * altura;

        double doubleImc = (peso / alturaF);
        float imc = (float) doubleImc;

        System.out.println("               ");
        System.out.println(" Tu índice de masa corporal es: " + String.format("%.2f", imc));
        // String.format("%.2f", nombre_variable) nos aplica 2 decimales máx al valor de la variable

    }



}

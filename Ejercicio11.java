import java.util.Scanner;

public class Ejercicio11 {
    
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa tu peso en kilogramos: ");
        double peso = scanner.nextDouble();

        System.out.print("Ingresa tu altura en metros: ");
        double altura = scanner.nextDouble();

        double imc       = calcularIMC(peso, altura);
        String categoria = determinarCategoriaIMC(imc);


        System.out.printf("Tu IMC es: %.2f%n", imc);
        System.out.println("Categoría: " + categoria);


        scanner.close();

    }
    
    public static double calcularIMC(double peso, double altura) {
        return peso / (altura * altura);
    }

    public static String determinarCategoriaIMC(double imc) {

        String mensaje = "Obesidad Grado III";

        if (imc < 18.5) {
            mensaje = "Bajo peso";
        } else if (imc >= 18.5 && imc < 24.9) {
            mensaje = "Peso normal";
        } else if (imc >= 25 && imc < 29.9) {
            mensaje = "Sobrepeso";
        } else if (imc >= 30 && imc < 34.9) {
            mensaje = "Obesidad Grado I";
        } else if (imc >= 35 && imc < 39.9) {
            mensaje = "Obesidad Grado II";
        }

        return mensaje;

    }

}

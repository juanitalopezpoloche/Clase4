import java.util.Scanner;

public class Ejercicio9 {
   
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Seleccione el tipo de interés que desea calcular: ");
        System.out.println("1. Interés Simple");
        System.out.println("2. Interés Compuesto");
        int tipoInteres = scanner.nextInt();

        double capital, tasa, tiempo;
        int numero = 0; 

        System.out.print("Ingresa el monto de capital: ");
        capital = scanner.nextDouble();

        System.out.print("Ingresa la tasa de interés anual (en porcentaje): ");
        tasa = scanner.nextDouble() / 100;

        System.out.print("Ingresa el tiempo (en años): ");
        tiempo = scanner.nextDouble();

        switch (tipoInteres) {
            case 1:

                double interesSimple = calcularInteresSimple(capital, tasa, tiempo);
                System.out.printf("El interés simple es: %.2f%n", interesSimple);

                break;

            case 2:
                
                System.out.print("Ingresa el número de veces que se aplica el interés por año: ");
                numero = scanner.nextInt();
                
                double montoTotal = calcularInteresCompuesto(capital, tasa, tiempo, numero);
                double interesCompuesto = montoTotal - capital;

                System.out.printf("El monto total después de %.0f años es: %.2f%n", tiempo, montoTotal);
                System.out.printf("El interés compuesto es: %.2f%n", interesCompuesto);

                break;

            default:
                System.out.println("Opción no válida.");
        }

        scanner.close();
    }

    public static double calcularInteresSimple(double capital, double tasa, double tiempo) {
        return capital * tasa * tiempo;
    }

    public static double calcularInteresCompuesto(double capital, double tasa, double tiempo, int n) {
        // Fórmula del interés compuesto: A = P * (1 + (r / n))^(n * t)
        double montoTotal = capital * Math.pow(1 + (tasa / n), n * tiempo);
        return montoTotal;
    }

}

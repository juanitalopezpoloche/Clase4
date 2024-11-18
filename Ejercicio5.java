import java.util.Scanner;

public class Ejercicio5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa el primer número: ");
        double num1 = scanner.nextDouble();

        System.out.print("Ingresa el segundo número: ");
        double num2 = scanner.nextDouble();

        System.out.print("Ingresa el tercer número: ");
        double num3 = scanner.nextDouble();

        double promedioNumeros = calcularPromedio(num1, num2, num3);

        System.out.println("El promedio de los números ingresados es: " + promedioNumeros);

        scanner.close();
    }

    public static double calcularPromedio(double num1, double num2, double num3) {
        return (num1 + num2 + num3) / 3;
    }
}

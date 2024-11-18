import java.util.Scanner;

public class Ejercicio8 {
     public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("---------   CÁLCULO DE ÁREAS    ----------");
        System.out.println("Seleccione la opción que desea para calcular el área: ");
        System.out.println("1. Círculo");
        System.out.println("2. Cuadrado");
        System.out.println("3. Triángulo");
        int opcion = scanner.nextInt();

        double resultado = 0;

        switch (opcion) {
            case 1:

                System.out.print("Ingrese el radio del círculo: ");
                double radio = scanner.nextDouble();

                resultado = areaCirculo(radio);
                System.out.printf("El área del círculo es: %.2f%n", resultado);

                break;

            case 2:

                System.out.print("Ingrese el lado del cuadrado: ");
                double lado = scanner.nextDouble();

                resultado = areaCuadrado(lado);
                System.out.printf("El área del cuadrado es: %.2f%n", resultado);

                break;

            case 3:

                System.out.print("Ingrese la base del triángulo: ");
                double base = scanner.nextDouble();

                System.out.print("Ingrese la altura del triángulo: ");
                double altura = scanner.nextDouble();

                resultado = areaTriangulo(base, altura);
                System.out.printf("El área del triángulo es: %.2f%n", resultado);

                break;

            default:

                System.out.println("Opción no válida.");
                break;

        }

        scanner.close();

    }

    public static double areaCirculo(double radio) {
        return Math.PI * elevar(radio);
    }

    public static double areaCuadrado(double lado) {
        return elevar(lado);
    }

    public static double areaTriangulo(double base, double altura) {
        return (base * altura) / 2;
    }

    public static double elevar(double numero) {
        return numero * numero;
    }

}

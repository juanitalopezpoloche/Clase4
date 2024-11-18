import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char opcion;

        do {
            System.out.println("---------- CONVERTIDOR DE TEMPERATURA  ----------");
            System.out.println("Ingresa la temperatura en Fahrenheit:");
            float temperatura = scanner.nextFloat();
            scanner.nextLine(); // Limpiar el buffer de entrada

            System.out.println("¿Desea convertirla a Fahrenheit (F) o a Celsius (C)?");
            opcion = scanner.nextLine().charAt(0);
            opcion = Character.toUpperCase(opcion);

            switch (opcion) {
                case 'F':
                    float temperaturaConvertidaF = convertirAFahrenheit(temperatura);
                    System.out.println("La temperatura en Fahrenheit es: " + temperaturaConvertidaF);
                    break;
                case 'C':
                    float temperaturaConvertidaC = convertirACelsius(temperatura);
                    System.out.println("La temperatura en Celsius es: " + temperaturaConvertidaC);
                    break;
                default:
                    System.out.println("Opción invalida");
            }
        } while (opcion == 'C' || opcion == 'F');

        scanner.close();
    }

    public static float convertirAFahrenheit(float temperatura) {
        return (temperatura * (9 / 5)) + 32;
    }
    
    public static float convertirACelsius(float temperatura) {
        return (temperatura - 32) / (9 / 5);
    }

}

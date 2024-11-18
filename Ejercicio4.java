import java.util.Scanner;

public class Ejercicio4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digita un número: ");
        int numero = scanner.nextInt();

        if (esPrimo(numero)) {
            System.out.println("El número "+numero+" es primo");
        } else {
            System.out.println("El número "+numero+" no es primo");
        }
    }
    
    public static boolean esPrimo(int numero) {
        if (numero < 2) {
            return false;
        }
        
        // Comprobamos divisores hasta la raíz cuadrada de n
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false;  // Si encontramos un divisor, no es primo
            }
        }
        
        return true;
    }
}

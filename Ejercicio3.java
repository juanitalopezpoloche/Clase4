import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese un número para calcular su factorial:");
        int numero = scanner.nextInt();

        long resultado = calcularFactorial(numero);

        System.out.println("El factorial de " + numero + " es: " + resultado);
        scanner.close();
    }

    public static long calcularFactorial(int n) {
        long factorial = 1;
        
        // Si el número es negativo, retorno -1 (porque no existe factorial para números negativos)
        if (n < 0) {
            return -1;
        }

        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }
        
        return factorial;
    }
}

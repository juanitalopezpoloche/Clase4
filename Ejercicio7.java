import java.util.Scanner;

public class Ejercicio7 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("------------ CÁLCULO DE POTENCIAS ------------");
        System.out.println("Digite la base: ");
        int base = scanner.nextInt();
        
        System.out.println("Digite la potencia: ");
        int potencia = scanner.nextInt();

        int resultado = 1;

        if (potencia != 0) {
            resultado = elevarUnNumeroALaPotencia(base, potencia);
        }

        System.out.println(base+" elevado a "+potencia+" es igual a "+resultado);
        
        scanner.close();
    }

    public static int elevarUnNumeroALaPotencia(int base, int potencia) {

        int resultado = 1;

        for (int i = 0; i < potencia; i++) {
            resultado *= base;
        }

        return resultado;

    }

}

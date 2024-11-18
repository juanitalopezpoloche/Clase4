import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor digite una palabra: ");
        String cadenaUsuario = scanner.nextLine();

        boolean palabraPalindromo = validarPalabraPalindromo(cadenaUsuario);

        if (palabraPalindromo) {
            System.out.println("La cadena ingresada es un palíndromo");
        } else {
            System.out.println("La cadena ingresada no es un palíndromo");
        }

        scanner.close();
    }

    public static boolean validarPalabraPalindromo(String cadena) {
        // Elimino los caracteres no alfanuméricos y convierto a minúscula
        String cadenaLimpia = cadena.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        
        int longitudCadena = cadenaLimpia.length();
        
        for (int i = 0; i < longitudCadena / 2; i++) {
            // Si los caracteres no coinciden, no es un palíndromo
            if (cadenaLimpia.charAt(i) != cadenaLimpia.charAt(longitudCadena - 1 - i)) {
                return false; 
            }
        }
        
        return true;  // Si los caracteres coinciden, es un palíndromo
    }
}

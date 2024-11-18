import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el número para el cual desea generar la tabla de multiplicar: ");
        int numero = scanner.nextInt();

        System.out.println(generarTablaDeMultiplicar(numero));

        scanner.close();

    }

    public static String generarTablaDeMultiplicar(int numero) {

        String tablaDeMultiplicar = "";

        for (int i = 0; i <= 9; i++) {

            int numeroAMultiplicar = i + 1;

            tablaDeMultiplicar += numero + " x " + numeroAMultiplicar + " = " + (numero * numeroAMultiplicar) + "\n"; 

        }

        return tablaDeMultiplicar;


    }
}

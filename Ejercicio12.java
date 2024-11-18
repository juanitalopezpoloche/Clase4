import java.util.Scanner;

public class Ejercicio12 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa la cantidad de segundos: ");
        long segundos = scanner.nextLong();

        convertirSegundos(segundos);

        scanner.close();
    }

    /*
        Toma una cantidad de segundos y la convierte en días, horas, minutos y segundos
    */
    public static void convertirSegundos(long segundos) {

        long dias = segundos / 86400;
        segundos %= 86400;

        long horas = segundos / 3600;
        segundos %= 3600; 

        long minutos = segundos / 60;
        segundos %= 60;

        long segundosRestantes = segundos;

        System.out.println(dias + " días, " + horas + " horas, " + minutos + " minutos, " + segundosRestantes + " segundos.");
    }
}

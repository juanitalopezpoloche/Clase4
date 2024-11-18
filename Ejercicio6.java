import java.util.Scanner;

public class Ejercicio6 {
   
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("--------------  CONVERSIÓN DE UNIDADES --------------");
        System.out.println("Seleccione el tipo de conversión:");
        System.out.println("1. Longitud (metros a kilómetros / kilómetros a metros)");
        System.out.println("2. Masa (gramos a kilogramos / kilogramos a gramos)");
        int tipoConversion = scanner.nextInt();
        scanner.nextLine();

        switch (tipoConversion) {
            case 1:

                System.out.println("Seleccione la conversión de longitud:");
                System.out.println("1. Metros a Kilómetros");
                System.out.println("2. Kilómetros a Metros");
                int tipoLongitud = scanner.nextInt();
                
                if (tipoLongitud == 1) {

                    System.out.print("Ingresa la cantidad en metros: ");
                    double metros = scanner.nextDouble();

                    double kilometros = metrosAKilometros(metros);
                    System.out.println(metros + " metros es igual a " + kilometros + " kilómetros.");

                } else if (tipoLongitud == 2) {

                    System.out.print("Ingresa la cantidad en kilómetros: ");
                    double kilometros = scanner.nextDouble();

                    double metros = kilometrosAMetros(kilometros);
                    System.out.println(kilometros + " kilómetros es igual a " + metros + " metros.");

                } else {

                    System.out.println("Digite una opción valida");

                }
                
                break;

            case 2:

                System.out.println("Seleccione la conversión de masa:");
                System.out.println("1. Gramos a Kilogramos");
                System.out.println("2. Kilogramos a Gramos");
                int tipoDeMasa = scanner.nextInt();
                
                if (tipoDeMasa == 1) {

                    System.out.print("Ingresa la cantidad en gramos: ");
                    double gramos = scanner.nextDouble();

                    double kilogramos = gramosAKilogramos(gramos);
                    System.out.println(gramos + " gramos es igual a " + kilogramos + " kilogramos.");

                } else if (tipoDeMasa == 2) {

                    System.out.print("Ingresa la cantidad en kilogramos: ");
                    double kilogramos = scanner.nextDouble();

                    double gramos = kilogramosAGramos(kilogramos);
                    System.out.println(kilogramos + " kilogramos es igual a " + gramos + " gramos.");

                } else {

                    System.out.println("Opción no válida.");

                }    

                break;

            default:
                System.out.println("Opción no válida.");
        }

        scanner.close();
    }

    public static double metrosAKilometros(double metros) {
        return metros / 1000;
    }

    public static double kilometrosAMetros(double kilometros) {
        return kilometros * 1000;
    }

    public static double gramosAKilogramos(double gramos) {
        return gramos / 1000;
    }

    public static double kilogramosAGramos(double kilogramos) {
        return kilogramos * 1000;
    }

}

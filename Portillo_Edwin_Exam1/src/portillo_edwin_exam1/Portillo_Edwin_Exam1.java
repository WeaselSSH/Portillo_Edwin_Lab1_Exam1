package portillo_edwin_exam1;

import java.util.Scanner;

public class Portillo_Edwin_Exam1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int opcion = 0;

        //bucle men� principal
        while (opcion != 5) {
            System.out.println();
            System.out.println("----MENU PRINCIPAL----");
            System.out.println();
            System.out.println("1. Pir�mide");
            System.out.println("2. Clave");
            System.out.println("3. Juego de piedra, papel o tijera");
            System.out.println("4. Adivinar");
            System.out.println("5. Salir del Sistema");
            System.out.println();

            System.out.print("Seleccione una opci�n [1-5]: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    int filas;
                    int numero = 1; //se inicializa en 1 para empezar con el primer n�mero impar

                    System.out.println();
                    System.out.println("-----Pir�mide-----");
                    System.out.println();
                    System.out.print("Favor ingrese el n�mero de filas a mostar: ");
                    filas = scanner.nextInt();

                    for (int i = 1; i <= filas; i++) {
                        int sumaNumeros = 0;
                        for (int j = 1; j <= i; j++) {
                            System.out.print(numero + " ");
                            sumaNumeros += numero;
                            numero += 2; //se suma 2 a la variable para saltarse el siguiente n�mero, puesto que es par
                        }

                        System.out.println("= " + sumaNumeros); //impresi�n del resultado de los n�meros impresos en cada fila
                    }

                    break;

                case 2:
                    break;

                case 3:
                    break;

                case 4:
                    break;

                case 5:
                    System.out.println("Saliendo del sistema...");
                    break;

                default:
                    System.out.println();
                    System.out.println("Error: opci�n ingresada no existe.");
            }

        }
    }

}

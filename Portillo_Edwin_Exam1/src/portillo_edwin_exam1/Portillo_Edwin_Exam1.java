package portillo_edwin_exam1;

import java.util.Scanner;

public class Portillo_Edwin_Exam1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int opcion = 0;

        while (opcion != 5) {
            System.out.println();
            System.out.println("----MENU PRINCIPAL----");
            System.out.println();
            System.out.println("1. Pirámide");
            System.out.println("2. Clave");
            System.out.println("3. Juego de piedra, papel o tijera");
            System.out.println("4. Adivinar");
            System.out.println("5. Salir del Sistema");
            System.out.println();

            System.out.print("Seleccione una opción [1-5]: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                        
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
            }

        }
    }

}

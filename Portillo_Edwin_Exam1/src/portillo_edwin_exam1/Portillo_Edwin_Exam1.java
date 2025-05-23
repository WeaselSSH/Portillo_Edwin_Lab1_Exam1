package portillo_edwin_exam1;

import java.util.Scanner;
import java.util.Random;

public class Portillo_Edwin_Exam1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useDelimiter("\n");

        Random random = new Random();

        int opcion = 0;

        //Bucle men� principal
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

                //Case pir�mide
                case 1:
                    int filas;
                    int numero = 1; //se inicializa en 1 para empezar con el primer n�mero impar

                    System.out.println();
                    System.out.println("-----Pir�mide-----");
                    System.out.println();
                    System.out.print("Favor ingrese el n�mero de filas a mostar: ");
                    filas = scanner.nextInt();

                    System.out.println();

                    if (filas == 0) {
                        System.out.println();
                        System.out.println("No se imprimi� ninguna fila.");
                        break;
                    }

                    for (int i = 1; i <= filas; i++) { //for para contar el n�mero de filas 

                        int sumaNumeros = 0;

                        for (int j = 1; j <= i; j++) { //for para imprimir la secuencia de n�meros
                            System.out.print(numero + " ");
                            sumaNumeros += numero;
                            numero += 2; //se suma 2 a la variable para saltarse el siguiente n�mero, puesto que es par
                        }

                        System.out.println("= " + sumaNumeros); //impresi�n del resultado de los n�meros impresos en cada fila
                    }

                    break;

                //Case Encriptado
                case 2:
                    int opcionEncriptar = 0;

                    String mensajeIngresado,
                     mensajeEncriptado,
                     mensajeDesencriptado;
                    char letraActual;

                    //bucle men� encriptar
                    while (opcionEncriptar != 3) {
                        System.out.println();
                        System.out.println("-----MENU ENCRIPTAR Y DESENCRIPTAR-----");
                        System.out.println();
                        System.out.println("1. Encriptar mensaje");
                        System.out.println("2. Desencriptar mensaje");
                        System.out.println("3. Regresar");

                        System.out.println();
                        System.out.print("Seleccione una opci�n [1-3]: ");
                        opcionEncriptar = scanner.nextInt();

                        switch (opcionEncriptar) {
                            case 1:
                                mensajeEncriptado = ""; //reinicio de variable

                                System.out.println();
                                System.out.print("Favor ingrese un mensaje a encriptar: ");
                                mensajeIngresado = scanner.next();

                                for (int i = 0; i <= mensajeIngresado.length() - 1; i++) {
                                    letraActual = mensajeIngresado.charAt(i);

                                    if (letraActual >= 'A' && letraActual <= 'Z') { // verifica si la letra est� dentro del rango ascii A-Z (may�scula)

                                        /*en esta operaci�n se resta 'A' a la letra que se evalua con el objetivo de sacar la posici�n real. Luego, eso se le resta a Z
                                        con el objetivo de invertir el caracter
                                         */
                                        mensajeEncriptado += (char) ('Z' - (letraActual - 'A'));

                                    } else if (letraActual >= 'a' && letraActual <= 'z') { //misma l�gica que el if previo
                                        mensajeEncriptado += (char) ('z' - (letraActual - 'a'));
                                    } else {
                                        mensajeEncriptado += letraActual; //si no est� en ninguno de los rangos previos quiere decir que no es una letra, por lo que no se toca
                                    }

                                }

                                System.out.println();
                                System.out.println("Mensaje encriptado: " + mensajeEncriptado);

                                break;

                            case 2:
                                //Exactamente la misma l�gica al case de encriptaci�n, puesto que es "sim�trica" la operaci�n
                                mensajeDesencriptado = "";

                                System.out.println();
                                System.out.print("Favor ingrese un mensaje a desencriptar: ");
                                mensajeIngresado = scanner.next();

                                for (int i = 0; i <= mensajeIngresado.length() - 1; i++) {
                                    letraActual = mensajeIngresado.charAt(i);

                                    if (letraActual >= 'A' && letraActual <= 'Z') {
                                        mensajeDesencriptado += (char) ('Z' - (letraActual - 'A'));
                                    } else if (letraActual >= 'a' && letraActual <= 'z') {
                                        mensajeDesencriptado += (char) ('z' - (letraActual - 'a'));
                                    } else {
                                        mensajeDesencriptado += letraActual;
                                    }
                                }

                                System.out.println();
                                System.out.println("Mensaje desencriptado: " + mensajeDesencriptado);

                                break;

                            case 3:
                                System.out.println();
                                System.out.println("Saliendo de la opci�n encriptar...");
                                break;

                            default:
                                System.out.println();
                                System.out.println("Error: opci�n ingresada no existe.");
                        }
                    }

                    break;

                //Case piedra papel o tijera
                case 3:
                    String eleccionUsuario;
                    String eleccionComputadora;
                    String jugarNuevamente;

                    System.out.println();
                    System.out.println("BIENVENIDO AL JUEGO PIEDRA PAPEL O TIJERA!");

                    //bucle del juego
                    do {

                        while (true) { //bucle para verificar que la opci�n ingresada por el usuario sea v�lida
                            System.out.println();
                            System.out.print("Escoja lo que desea jugar (piedra, papel o tijera): ");
                            eleccionUsuario = scanner.next();

                            if (eleccionUsuario.equalsIgnoreCase("piedra") || eleccionUsuario.equalsIgnoreCase("tijera") || eleccionUsuario.equalsIgnoreCase("papel")) {
                                break;
                            } else {
                                System.out.println("Opci�n inv�lida. Favor intente de nuevo.");
                            }
                        }

                        int numeroComputadora = random.nextInt(3) + 1; //se suma 1 a la generaci�n del n�mero random, puesto que el 0 va incluido en el random

                        if (numeroComputadora == 1) {
                            eleccionComputadora = "piedra";
                        } else if (numeroComputadora == 2) {
                            eleccionComputadora = "papel";
                        } else {
                            eleccionComputadora = "tijera";
                        }

                        if (eleccionUsuario.equalsIgnoreCase(eleccionComputadora)) {
                            System.out.println();
                            System.out.println("Empate :/");
                            System.out.println("Opci�n ingresada por la computadora: " + eleccionComputadora);

                            //comparaci�n de elecciones
                        } else if (eleccionUsuario.equalsIgnoreCase("piedra") && eleccionComputadora.equalsIgnoreCase("tijera")
                                || eleccionUsuario.equalsIgnoreCase("papel") && eleccionComputadora.equalsIgnoreCase("piedra")
                                || eleccionUsuario.equalsIgnoreCase("tijera") && eleccionComputadora.equalsIgnoreCase("papel")) {

                            System.out.println();
                            System.out.println("Ganaste :D!");
                            System.out.println("Opci�n ingresada por la computadora: " + eleccionComputadora);
                        } else {
                            System.out.println();
                            System.out.println("Perdiste :( ");
                            System.out.println("Opci�n ingresada por la computadora: " + eleccionComputadora);
                        }

                        System.out.println();
                        System.out.println("Desea seguir jugando? (si/no)");
                        jugarNuevamente = scanner.next();

                        if (jugarNuevamente.equalsIgnoreCase("no")) {
                            System.out.println();
                            System.out.println("Saliendo del juego...");
                        }

                    } while (jugarNuevamente.equals("si"));

                    break;

                //Case Adivinar n�mero
                case 4:
                    int intentos = 0;
                    int numeroGenerado = random.nextInt(100) + 1; //se suma 1 debido a que la funci�n random incluye el 0
                    int numeroIngresado = 101; //se inicializa en 101 para que no entre en conflicto con el n�mero generado

                    System.out.println();
                    System.out.println("-----ADIVINAR NUMERO-----");

                    while (numeroIngresado != numeroGenerado) {
                        System.out.println();
                        System.out.print("Favor ingrese el n�mero que desea adivinar: ");
                        numeroIngresado = scanner.nextInt();

                        if (intentos == 9) {
                            System.out.println();
                            System.out.println("N�mero de intentos agotados.");
                            System.out.println("El n�mero era: " + numeroGenerado);
                            intentos++;
                            break;

                        } else if (numeroGenerado > numeroIngresado) {
                            System.out.println();
                            System.out.println("El n�mero a adivinar es mayor al n�mero ingresado.");
                            intentos++;

                            System.out.println();
                            System.out.println("Lleva " + intentos + " intento(s).");
                            System.out.println("Tiene " + (10 - intentos) + " restantes.");

                        } else if (numeroGenerado < numeroIngresado) {
                            System.out.println();
                            System.out.println("El n�mero a adivinar es menor al n�mero ingresado.");
                            intentos++;

                            System.out.println();
                            System.out.println("Lleva " + intentos + " intento(s).");
                            System.out.println("Tiene " + (10 - intentos) + " restantes.");

                        } else {
                            intentos++;
                            System.out.println();
                            System.out.println("Felicidades!");
                            System.out.println("Ha acertado el n�mero correcto al intento n�mero " + intentos + "!");
                        }

                    }

                    break;

                case 5:
                    System.out.println();
                    System.out.println("Saliendo del sistema...");
                    break;

                default:
                    System.out.println();
                    System.out.println("Error: opci�n ingresada no existe.");
            }

        }
    }

}

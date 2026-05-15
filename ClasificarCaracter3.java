package trabajospoo;

import java.util.Scanner;

public class ClasificarCaracter3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char caracter;
        
        System.out.println(" Clasificador de caracteres ");
        System.out.print("Introduce un caracter: ");

        caracter = scanner.next().charAt(0);

        if (caracter >= 'A' && caracter <= 'Z') {

            char letra = Character.toLowerCase(caracter);

            if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') {                
                System.out.println("El caracter '" + caracter + "' es una vocal.");
            } else {
                System.out.println("El caracter '" + caracter + "' es una consonante.");
            }

        } else if (caracter >= '0' && caracter <= '9') {
            System.out.println("El carater '" + caracter + "' es un digito.");

        } else {
            System.out.println("El caracter '" + caracter + "' es un caracter especial.");
        }

        scanner.close();
    }
}
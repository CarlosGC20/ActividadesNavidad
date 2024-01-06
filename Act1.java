package com.carlosguitart.actividadesnavidad;

import java.util.Scanner;

public class Act1 {
    public static void main(String[] args) {
        // Crea un objeto Scanner para leer la entrada del usuario desde la consola
        Scanner scanner = new Scanner(System.in);

        // Solicita al usuario que introduzca el primer número entero
        System.out.println("Introduce un número entero:");
        int a = scanner.nextInt();

        // Solicita al usuario que introduzca el segundo número entero
        System.out.println("Introduce otro número entero:");
        int b = scanner.nextInt();

        // Realiza las operaciones matemáticas básicas con los números introducidos
        int suma = a + b;  // Suma de a y b
        int resta = a - b;  // Resta de a y b
        int multiplicacion = a * b;  // Multiplicación de a y b
        // División de a y b. Nota: esto fallará si b es 0
        int division = a / b;

        // Cierra el scanner para liberar recursos
        scanner.close();

        // Imprime los resultados de las operaciones
        System.out.println("El resultado de la suma es: " + suma);
        System.out.println("El resultado de la resta es: " + resta);
        System.out.println("El resultado de la multiplicación es: " + multiplicacion);
        System.out.println("El resultado de la división es: " + division);
    }
}

package com.carlosguitart.actividadesnavidad;

import java.util.Scanner;

public class Act2 {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Pedir al usuario que introduzca el primer número y leerlo
        System.out.println("Introduce un número real:");
        double a = scanner.nextDouble();

        // Pedir al usuario que introduzca el segundo número y leerlo
        System.out.println("Introduce otro número real:");
        double b = scanner.nextDouble();

        // Realizar las operaciones matemáticas básicas
        double suma = a + b; // Suma de los números
        double resta = a - b; // Resta de los números
        double multiplicacion = a * b; // Multiplicación de los números
        double division = a / b; // División de los números

        // Cerrar el scanner para evitar fugas de recursos
        scanner.close();

        // Imprimir los resultados de las operaciones
        System.out.println("El resultado de la suma es: " + suma);
        System.out.println("El resultado de la resta es: " + resta);
        System.out.println("El resultado de la multiplicación es: " + multiplicacion);
        System.out.println("El resultado de la división es: " + division);
    }
}

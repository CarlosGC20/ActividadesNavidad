package com.carlosguitart.actividadesnavidad;

import java.util.Scanner;

public class Act3 {
    public static void main(String[] args) {
        // Crea un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Solicita al usuario que introduzca el precio del artículo
        System.out.println("Indique el precio del artículo:");
        double precio = scanner.nextDouble();

        // Solicita al usuario que introduzca el porcentaje de descuento
        System.out.println("Indique el porcentaje de descuento:");
        double porcentaje = scanner.nextDouble();

        // Cierra el scanner para evitar fugas de recursos
        scanner.close();

        // Calcula el monto del descuento aplicando el porcentaje al precio
        double resultado = (precio * porcentaje) / 100;

        // Calcula el precio final restando el descuento del precio original
        double precioFinal = precio - resultado;

        // Muestra el precio final después de aplicar el descuento
        System.out.println("El precio final es: " + precioFinal);
    }
}

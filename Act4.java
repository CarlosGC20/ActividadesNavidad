package com.carlosguitart.actividadesnavidad;

import java.util.Scanner;

public class Act4 {
    public static void main(String[] args) {
        // Crea un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Solicita al usuario que ingrese el número total de segundos
        System.out.println("Ingrese una cantidad de segundos:");
        int totalSegundos = scanner.nextInt();

        // Calcula las horas dividiendo los segundos totales por 3600 (número de segundos en una hora)
        int horas = totalSegundos / 3600;

        // Calcula los segundos restantes después de extraer las horas
        int minutosRestantes = totalSegundos % 3600;

        // Calcula los minutos dividiendo los segundos restantes por 60 (número de segundos en un minuto)
        int minutos = minutosRestantes / 60;

        // Calcula los segundos restantes después de extraer los minutos
        int segundos = minutosRestantes % 60;

        // Cierra el objeto Scanner para evitar fugas de recursos
        scanner.close();

        // Imprime el resultado en formato de horas, minutos y segundos
        System.out.println(horas + "h " + minutos + "m " + segundos + "s");
    }
}

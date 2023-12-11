/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.reto;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class Punto1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa un número para verficar si es multiplo: ");
        int numero = scanner.nextInt();
        int suma = sumarMultiplos(numero);
        System.out.println("La suma de los múltiplos de 3 y 5 (sin ser múltiplos comunes) hasta " + numero + " es: " + suma);
        scanner.close();
    }


    private static int sumarMultiplos(int limite) {
      
        int suma = 0;
        for (int i = 1; i < limite; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                continue;
            }
            if (i % 3 == 0 || i % 5 == 0) {
                suma += i;
            }
        }
        return suma;
    }
}


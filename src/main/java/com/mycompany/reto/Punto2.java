package com.mycompany.reto;

import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */ 
/**
 *
 * @author user
 */
public class Punto2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa una contraseña: ");
        String contrasena = scanner.nextLine();

        if (validarContrasena(contrasena)) {
            System.out.println("Contraseña válida.");
        } else {
            System.out.println("Contraseña no válida. Asegúrate de cumplir con los requisitos.");
        }

        scanner.close();
    }

    static boolean validarContrasena(String contrasena) {
        if (contrasena.length() < 8) {
            return false;
        }

        boolean tieneMinuscula = false;
        boolean tieneMayuscula = false;
        boolean tieneEspecial = false;

        for (char caracter : contrasena.toCharArray()) {
            if (Character.isLowerCase(caracter)) {
                tieneMinuscula = true;
            } else if (Character.isUpperCase(caracter)) {
                tieneMayuscula = true;
            } else if (!Character.isLetterOrDigit(caracter)) {
                tieneEspecial = true;
            }
        }

        return tieneMinuscula && tieneMayuscula && tieneEspecial;
    }
}


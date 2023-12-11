/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.reto;

import java.security.SecureRandom;
import java.util.Random;

/**
 *
 * @author user
 */
public class Punto3 {

    private static final String CARACTERES = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!@#$%^&*()-_=+";

    public static void main(String[] args) {

        String contrasenaGenerada = generarContrasena();
        System.out.println("Contraseña generada: " + contrasenaGenerada);
    }

    static String generarContrasena() {
        SecureRandom random = new SecureRandom();
        StringBuilder contrasena = new StringBuilder();
        int longitud = 8 + random.nextInt(6); 
        for (int i = 0; i < longitud; i++) {
            int indice = random.nextInt(CARACTERES.length());
            contrasena.append(CARACTERES.charAt(indice));
        }
        return contrasena.toString();
    }
}


        
        
        
    

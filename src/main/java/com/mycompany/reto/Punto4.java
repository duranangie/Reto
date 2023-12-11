package com.mycompany.reto;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author user
 */
public class Punto4 {

    /**
     * El ejercicio de python nos muestra que el funcionamiento que realiza es 
     * la suma del resultado dos veces es decir 1+1 = 2 2+2= 4 y asi sucesivamente  
     */
    public static void main(String[] args) {
        int a = 0 , b=1;
        for(int i=0; i < 10; i++){
            System.out.println(a + " ");
  
            a = b;
            b = (a+b);
            
            
        }
        
        System.out.println();
        
        
    }
    
}

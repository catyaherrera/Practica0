package mipaquete;

import java.util.Scanner;

public class Practica0 {
    static Scanner input = new Scanner (System.in);
    static void run(){
        String nombre;
        System.out.println("Ingresa tu nombre: ");
        nombre = input.nextLine();
        System.out.println("Bienvenido %s al curso de EDD\n" + nombre);
    } 
    public static void main (String agrs []){
        run();
        
    }
             
}
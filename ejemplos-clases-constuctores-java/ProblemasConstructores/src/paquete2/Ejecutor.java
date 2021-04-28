/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete2;
import java.util.Scanner;
/**
 *
 * @author reroes
 */
public class Ejecutor {
    public static void main(String[] args) {
        
        /*Crear un objeto y presentar los datos
        Ingresar la información por teclado.
        */
        
        Scanner read = new Scanner(System.in);
        
        System.out.println("Cual es el nombre del hospital?");
        String nh = read.nextLine();
        
        System.out.println("En que ciudad esta el hospital?");
        String c = read.nextLine();
        
        System.out.println("Cuantos doctores hay?");
        int d = read.nextInt();
        
        System.out.println("Cuantos enfermeros hay?");
        int e = read.nextInt();
        
        
        Hospital hospital2 = new Hospital(nh, c, d, e );
        
        System.out.printf("%S", hospital2);
        
        
    }
}

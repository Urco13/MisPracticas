/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicas5;

import java.io.BufferedReader;
import java.io.InputStreamReader;


/**
 *
 * @author urco1
 */
public class Utilidades {
    static BufferedReader bufer = new BufferedReader(new InputStreamReader(System.in));
    
    //constructor
    public Utilidades(){};
    
    //leerString
    public static String leerString(){
        String cadena = null;
        try {
            cadena = bufer.readLine();
        } catch (NumberFormatException ex) {
            System.out.println("No se permiten numeros decimales");
        } catch (Exception ex) {
            System.out.println("Error");
        }
        return cadena; 
    }//fin leerString
    
    //leer byte
    public static byte leerByte(){
        byte cantidad = 0;
        try {
          cantidad = Byte.parseByte(bufer.readLine());
        } catch (NumberFormatException ex) {
            System.out.println("No se permiten numeros decimales");
        } catch (Exception ex) {
            System.out.println("Error");
        }
     
        return cantidad;
    }//fin leerByte
    
    //leerInt
    public static int leerInt(){
        int cantidad = 0;
        try {
          cantidad = Integer.parseInt(bufer.readLine());
        } catch (NumberFormatException ex) {
            System.out.println("No se permiten numeros decimales");
        } catch (Exception ex) {
            System.out.println("Error");
        }
     
        return cantidad;
    }//fin leerInt
    
    //leerFloat
    public static float leerFloat(){
        float cantidad = 0;
        try {
          cantidad = Float.parseFloat(bufer.readLine());
        } catch (NumberFormatException ex) {
            System.out.println("No se permiten numeros decimales");
        } catch (Exception ex) {
            System.out.println("Error");
        }
     
        return cantidad;
    }//fin leerFloat
    
    //leerDouble
    public static double leerDouble(){
        double cantidad = 0;
        try {
          cantidad = Double.parseDouble(bufer.readLine());
        } catch (NumberFormatException ex) {
            System.out.println("No se permiten numeros decimales");
        } catch (Exception ex) {
            System.out.println("Error");
        }
     
        return cantidad;
    }//fin leerDouble
    
}//fin class

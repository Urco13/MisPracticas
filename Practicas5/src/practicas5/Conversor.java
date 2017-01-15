/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicas5;

/**
 *
 * @author urco1
 */
public class Conversor {
    
    //argumentos
    static private final double EUROS=1.13;
    static private final double LIBRAS=0.88;
    static private final double DOLARES=1.06;
    
    //constructor
    public Conversor(){};
    
    //euroALibras
    public static void eurosALibras(int cantidad){
        double resultado;
        resultado = cantidad * LIBRAS;
        System.out.println("Al cambio tendrias "+ resultado+" Libras");
    }//fin euroALibras
    
    //librasAEuros
    public static void librasAEuros(int cantidad){
        double resultado;
        resultado = cantidad * EUROS;
        System.out.println("Al cambio tendrias "+ resultado+" Euros");
    }//fin libras
    
    //eurosDolares
    public static void eurosADolares(int cantidad){
        double resultado;
        resultado = cantidad * DOLARES;
        System.out.println("Al cambio tendrias "+ resultado+" Dolares");
    }//fin eurosDolares
    
    //dolaresEuros
    public static void dolaresAEuros(int cantidad){
        double resultado;
        resultado = cantidad * EUROS;
        System.out.println("Al cambio tendrias "+ resultado+" Euros");
    }//fin dolaresEuros
    
    //cantidadACambiar
    public static int cantidadACambiar(){
        int cantidad;
        System.out.println("Que cantidad quiere cambiar");
        cantidad=Integer.parseInt(Utilidades.leerString());
        return cantidad;
    }
}

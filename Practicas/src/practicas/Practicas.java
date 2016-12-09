/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package practicas;

import java.io.BufferedReader;
import java.io.InputStreamReader;



/**
 *
 * @author urco1
 */
public class Practicas {
    
    static BufferedReader leerTeclado = new BufferedReader(new InputStreamReader(System.in));
    static int producto1=15;
    static int producto2=30;
    static final int MONEY1=35;
    static final int MONEY2=60;
    public static void main(String[] args){ 
        int sw = 1;
        int option;
        do{
        option=menu();
        switch (option) {
            case 1:
                sw = venta();
                
                break;
            case 2:
                consulta();
                sw=0;
                break;
            case 3:
                sw=1;
        }
        }while(sw==0);
        
        
    }//fin main
    
    ///////////////////////////////////////////////////////////////////
   public static int menu(){
        int optionMenu=0;
        
       optionMenu=LeerStringDevolverInt("Elige una opcion\n1-Comprar\n2-Consultar\n3-Finalizar");
       
       return optionMenu;
   }
   public static int LeerStringDevolverInt(String texto){
       int option = 0;
       int sw=1;
       do{
       System.out.println(texto);
        try {
            option = Integer.parseInt(leerTeclado.readLine());
        } catch (NumberFormatException ex) {
            System.out.println("Tiene que poner un numero entero");
            sw=0;
        } catch (Exception ex) {
            System.out.println("Error intentalo otra vez");
            sw=0;
        }
       }while(sw==0);
       return option;  
   }
   public static int venta(){
       int edad=0;
       edad=LeerStringDevolverInt("Que juegos quieres");
       int cantidad;
       int compra;
       int sw=0;
       if(edad<16){
           cantidad=LeerStringDevolverInt("Nos quedadan "+ producto1+" productos del tipo 1 su precio es 35 Eu\nCuantos quieres comprar");
           producto1 = producto1 - cantidad;
           compra = cantidad * MONEY1;
           System.out.println("Total tipo1 " + cantidad + " juegos " +compra+" Eu" );
       }else{
           cantidad=LeerStringDevolverInt("Nos quedadan "+ producto2+" productos del tipo 2 su precio es 60 EU\nCuantos quieres comprar");
           producto2 = producto2 - cantidad;
           compra = cantidad * MONEY2;
           System.out.println("Total tipo2 " + cantidad + " juegos " +compra+" Eu" );
       }//fin else
       if(producto1==0 && producto2==0){
            sw =1;
          
       }
        return  sw;
   }//fin venta
   public static void consulta(){
       System.out.println("Nos queda del producto 1 "+ producto1);
       System.out.println("Nos queda del producto 2 "+ producto2);
   }
}//fin Cla


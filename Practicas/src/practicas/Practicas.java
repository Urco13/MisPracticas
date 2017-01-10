/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package practicas;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Random;


/**
 *
 * @author urco1
 */
public class Practicas {
//    static InputStreamReader flujo1= new InputStreamReader(System.in); 
//    static BufferedReader flujo = new BufferedReader(flujo1);
    static BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));
    static Random aleatorio = new Random();
    static final int COSTEUNIDAD1 = 35;
    static final int COSTEUNIDAD2 = 60;
    static int tipo1=15;
    static int tipo2=30;
    static int tipo1Ran=30;
    static int tipo2Ran=30;
    static int vector[]= new int[2];
    
    /////////////////////main////////////////
    /**
     * 
     * @param args 
     */
    public static void main(String[] args){
    
        int option;
        int optionCompras=0;
        int sw=0;
        
        
        do {
               option=menu();
               switch (option) {
                   case 1:
                       compras();
                       break;
                   case 2:
                       consultarProductos();
                       break;
                   case 3:
                       sw=1;
                       break;
                   default:      
               }
              if(tipo1==0 && tipo2 ==0){
                  System.out.println("No nos quedan mas productos en oferta");
                  sw=1;
                } 
        } while (sw==0);
        System.out.println("Se regalaron\n");
        leerArray(vector);
        System.out.println("See you son");
    }//fin main
    
    ////////////////leerPantalla////////////////////////
    /**
     * 
     * @param texto
     * @return 
     */
    static int leerPantalla(String texto){
        int option = 0;
       
        System.out.println(texto);
       
        try {
            option = Integer.parseInt(teclado.readLine());
        } catch (NumberFormatException ex) {
            System.out.println("No se permite numero que no sean enteros");
            
        } catch (Exception ex) {
            System.out.println("Error vuelve a intentarlo");
           
        }
        
        return option;
    }
    
   ////////////////menu/////////////////////////
    /**
     * 
     * @return 
     */
    static int menu(){
        int valor;
           valor =leerPantalla("1-Compra\n2-Consultar\n3-Cerrar\n");
        return valor;
    }//fin menu
    
    ///////////////////compras///////////////////////////////////////////////////
    /**
     * 
     */
    static void compras(){
        int valor;
        int cantidad1;
        int cantidad2;
        int sw=1;
        do{
        valor=leerPantalla("Elige una opcion\n"+"1-Juegos menores de 16, 35Eu\n"
                + "2-Juegos Adultos\n");
        }while(valor !=1 && valor !=2);
        if(valor==1){
            do{
            cantidad1=leerPantalla("Cuantos juegos deseas comprar del tipo1");
            if(cantidad1>tipo1){
                System.out.println("Solo nos quedan "+ tipo1);
            }else
                sw=1;
            }while(sw==0);
            producto1(cantidad1);
        }else{
            do{
            cantidad2=leerPantalla("Cuantos juegos deseas comprar del tipo2");
            if(cantidad2>tipo2){
                System.out.println("Solo nos quedan "+ tipo2);
            }else{
                sw=1;
            }
            }while(sw==0);
            producto2(cantidad2);
        }
        
    }//fin compras
   
    /////////////producto1////////////////////////////
    /**
     * 
     * @param cantidadComprada 
     */
    static void producto1(int cantidadComprada){
        
        if (cantidadComprada>=3) {
            productoAleatorio();
//            int numeroAleatorio=productoAleatorio();
//                if(numeroAleatorio==0){
//                    
//                    vector[0]++;
//                }else{
//                    vector[1]++;
//                }
        }
        tipo1 = tipo1 - cantidadComprada;
        System.out.println("Total tipo1 " +cantidadComprada+" juegos "+ (cantidadComprada * COSTEUNIDAD1)+ " EU");
    }//fin producto1
    
    ///////////////producto2///////////////////////////
    /**
     * 
     * @param cantidadComprada 
     */
    static void producto2(int cantidadComprada){
        if (cantidadComprada>=3) {
            productoAleatorio();
        }
        tipo2 = tipo2 - cantidadComprada;
        System.out.println("Total tipo2 " +cantidadComprada+" juegos "+ (cantidadComprada * COSTEUNIDAD2)+ " EU");
        
    }//fin producto2
    
    ////////////////productoAleatorio///////////////////////
    /**
     * 
     */
    public static void productoAleatorio(){
        int numeroAleatorio;
        numeroAleatorio = aleatorio.nextInt(2);
         if(numeroAleatorio==0){
                    vector[0]++;
                }else{
                    vector[1]=vector[1] + 1;
                }
    }///fin produnto aleatorio
    
    //////////Consultar///////////////
    /**
     * 
     */
    public static void consultarProductos(){
        System.out.println("Estos son los productos que nos quedan\ntipo1 " + tipo1+" unidades\nTipo2 "+tipo2+" unidades\n");
    }
    
    ////////////leerArray///////////
    /**
     * 
     * @param vector 
     */
    public static void leerArray(int[] vector){
       
            System.out.println("Del tipo1 "+vector[0]);
            System.out.println("Del tipo2 "+vector[1]);
    
    }
}//fin Cla


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicas3;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Random;



/**
 *
 * @author urco1
 */
public class Practicas3 {
    static BufferedReader bufer = new BufferedReader(new InputStreamReader(System.in));
    static Random aleatorio = new Random();
    static int tipo1 = 15;
    static int tipo2 = 30;
    static final int PRECIOMENORES = 35;
    static final int PRECIOADULTOS = 60;
    static int vector[]=new int[2];
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        menu();
    }//fin main
    
    //leerTeclado
    public static int leerTeclado(String texto){
       int option=0;
        System.out.println(texto);
        try {
          option = Integer.parseInt(bufer.readLine());
        } catch (NumberFormatException ex) {
            System.out.println("No se permiten decimales");
        } catch (Exception ex) {
            System.out.println("Error");
        }
        return option; 
    }//fin leerteclado
    
    //menu
    public static void menu(){
        int option=0;
        int sw=0;
        do{
        option = leerTeclado("1-Compras\n2-Consulta\n3-Cerrar");
        switch (option) {
            case 1:
                compras();
                break;
            case 2:
                consulta();
                break;
            case 3:
                sw=1;
                break;
        }
        }while(sw==0);
        recorrerArray();
        System.out.println("Gracias por tu compra");
    }//fin menu
    
    //compras
    public static void compras(){
        int option=0;
        option=leerTeclado("Que producto deseas comprar\n\n1-Juegos menores de 16 "+ PRECIOMENORES+" EU"
                + "\n2Juegos Adultos "+ PRECIOADULTOS+" EU");
        switch (option) {
            case 1:
                productoMenores();
                break;
            case 2:
                productoAdultos();
                break;
               
        }
    }//fin compras
    
    //productoMenores
    public static void productoMenores(){
        int cantidadComprada;
        int sw=1;
        do{
        cantidadComprada=leerTeclado("Cuantos articulos deseas comprar nos quedan "+ tipo1);
        if(cantidadComprada<=0 || cantidadComprada>tipo1){
            System.out.println("La cantidad no puede ser menor de 0 ni mayor de "+tipo1);
            sw=0;
        }
        }while(sw==0);
        if(cantidadComprada>=3){
            int numeroAleatorio=productoAleatorio();
            if(numeroAleatorio==0){
              vector[0]++;  
            }else{
              vector[1]++;
            }  
        }
        tipo1=tipo1 - cantidadComprada;
        System.out.println("Total tipo1 "+ cantidadComprada * PRECIOMENORES+" Eu");
    }//fin productoMenores
    
    //productoAdultos
    public static void productoAdultos(){
        int cantidadComprada;
        int sw=1;
        do{
        cantidadComprada=leerTeclado("Cuantos articulos deseas comprar nos quedan "+ tipo2);
        if(cantidadComprada<0 || cantidadComprada>tipo2){
            System.out.println("La cantidad no puede ser menor de 0 ni mayor de "+tipo2);
            sw=0;
        }
        }while(sw==0);
        if(cantidadComprada>=3){
            int numeroAleatorio;
            numeroAleatorio=productoAleatorio();
            if(numeroAleatorio==0){
              vector[0]++;  
            }else{
              vector[1]++;
            }
            
        }
        tipo2=tipo2 - cantidadComprada;
    }//fin productoAdultos
    
    //consulta
    public static void consulta(){
        System.out.println("Nos quedan:\nDel producto de menores "+tipo1+"\nDel"
                + "producto de adultos "+tipo2+"\n");
    }//fin consulta
    
    //recorrerArray
    public static void recorrerArray(){
        for (int i = 0; i < 2 ; i++) {
            System.out.println("Se regalaron aleatoriamente del tipo"+(i+1)+" "+vector[i]);
        }
    }
    //productoAleatorio
    public static int productoAleatorio(){
        int numeroAleatorio;
         numeroAleatorio= aleatorio.nextInt(2);
        return numeroAleatorio;
    }
}//fin class

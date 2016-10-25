/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author urco1
 */
public class BucleFor {
    public static void main(String[]args){
        //Declaramos el array
        int arrayEnteros[] = new int[10];
        //Almacenamos datos en sus elementos
        for(int i = 0; i<5; i++){
            arrayEnteros[i] = i;
            //Lo recorremos y extraemos la informacion almacenada
        }
        for(int i: arrayEnteros){
            System.out.println("arrayEnteros[" + i + "] = " + arrayEnteros[i]);
        }
        int mes = 1; //corresponde al mes de enero
        switch(mes){
            case 1:
                System.out.println("El mes es enero");
                break;
            case 2:
                System.out.println("El mes es febrero");
                break;
            case 3:
                System.out.println("El mes es marzo");
                break;
            case 4:
                System.out.println("El mes es abril");
                break;
            default:
                System.out.println("Ninguno de los meses anteriores");
                break;
        }
        int mes2 = 2;//correspondiente al mes de febrero
        switch(mes2){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("El mes tiene 31 dias");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("El mes tiene 30 dias");
                break;
            default:
                System.out.println("El mes es febrero");
                break;
        }
            
    }
}

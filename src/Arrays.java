/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author urco1
 */
public class Arrays {
    public static void main(String [] args){
        int arrayEnteros[] = new int[10];
        Persona grupoPersonas[] = new Persona[10];
        grupoPersonas[5] = new Persona("James", "Gossling", "1343434");
        //La siguiente sentencia es valida
        System.out.println("Valor en Array enteros [5] " + arrayEnteros[5]);
        //Se produce un error, no hay nada en la posicion[5]
        System.out.println("Nombre en posicion grupo personas[5] " + grupoPersonas[5].nombre);
    }
}

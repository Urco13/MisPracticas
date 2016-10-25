/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author urco1
 */
public class PruebaPersona {
    public static void main(String [] args){
        Persona unaPersona = new Persona("Oscar", "Belmonte", "1234");
        System.out.println("Muestra informacion accediendo directamente a los campos. ");
        
        System.out.println("Nombre: " + unaPersona.nombre);
        System.out.println("Apellido: " + unaPersona.apellidos);
        System.out.println("Telefono " + unaPersona.telefono);
        
        System.out.println("Muestra informacion llamando a los metodos de la clase");
        
        System.out.println("Nombre " + unaPersona.getPersona());
        System.out.println("Apellido " + unaPersona.getApellidos());
        System.out.println("Telefono " + unaPersona.telefono);
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author urco1
 */
public class Persona {
            String nombre;
            String apellidos;
            String telefono;
            //Definicion de metodos
            Persona(){}
            
            Persona(String nombre, String apellidos, String telefono){
                this.nombre = nombre;
                this.apellidos = apellidos;
                this.telefono = telefono;
            }
            
            String getPersona(){
                return nombre;
            }
            String getApellidos(){
                return apellidos;
            }
            String getTelefono(){
                return telefono;
            }
            void setNombre(String nuevoNombre){
                nombre = nuevoNombre;
            }
            void setApellidos(String nuevoApellidos){
                apellidos = nuevoApellidos;
            }
            void setTelefono(String nuevoTelefono){
                telefono = nuevoTelefono;
            }
}

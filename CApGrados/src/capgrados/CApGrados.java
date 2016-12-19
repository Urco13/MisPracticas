/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package capgrados;

/**
 *
 * @author urco1
 */
public class CApGrados {

   final static int LIMINFERIOR= -30;//Definicion constantes
   final static int LIMSUPERIOR= 100;
   final static int INCREMENTO= 6;
   
    public static void main(String[] args) {
      CGrados grados = new CGrados();//crea un objeto de la clase CGrados
      CGrados otroObjeto= new CGrados();
      int gradosCent = LIMINFERIOR; //declaracion variables
      float gradosFahr=0;
      
        while (gradosCent<=LIMSUPERIOR) {
            
            otroObjeto.centigradosAsignar(gradosCent);//asignar al objeto grados el valor en grados c
            gradosFahr = otroObjeto.fahrenheitObtener();//obtener del objeto grados los grados fahren
            System.out.println(gradosCent+"\t"+ gradosFahr+" F");//escribir la siguiente linea de la t
            gradosCent += INCREMENTO;//siguiente valor
        }//fin while
    }//fin main
    
}//fin class



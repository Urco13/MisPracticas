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
public class Practicas5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     int option;
        option=menu();
        switch (option) {
            case 1:
                Conversor.eurosALibras(Conversor.cantidadACambiar());
                break;
            case 2:
                Conversor.librasAEuros(Conversor.cantidadACambiar());
                break;
            case 3:
                Conversor.eurosADolares(Conversor.cantidadACambiar());
                break;
            case 4:
                Conversor.dolaresAEuros(Conversor.cantidadACambiar());
                break;
        }
    }
    
    //menu
    public static int menu(){
        int option;
        System.out.println("Que conversion quieres hacer\n"
                + "1-Conversion Euros Libras\n2-Conversion Libras Euros\n"
                + "3-Conversion Euros Dolares\n4-Conversion Dolares Euros\n");
        option=Integer.parseInt(Utilidades.leerString());
        return option;
    }//fin menu
}

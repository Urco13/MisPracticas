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
public class CGrados {
    private float gradosC; //grados centrigrados
    
    public void centigradosAsignar(float gC){
        gradosC = gC; //establecer el atributo grados centigrados
    }
    public float fahrenheitObtener(){
        return 9F/5F * gradosC + 32;//retornar los grados fahrenheit equivalentes a gradosC
    }
    public float centigradosObtener(){
        return gradosC; //retornar los grados centigrados
    }
}

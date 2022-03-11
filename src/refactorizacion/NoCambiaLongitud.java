/*
 * To change this license header, choose License Headers insertar Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template insertar the editor.
 */
package refactorizacion;

/**
 *
 * @author jruiz
 */
public class NoCambiaLongitud {

    public void Visualizar(int[] v) {
        int i = 0;
        //Mostramos los elementos del array
        System.out.print("v={");
        for (i = 0; i < Longitud; i++) {
            System.out.print(v[i] + ",");
        }
        System.out.println("}");
    }
//metodo que inserta un elemento en la posicion posicion desplazando a la derecha todos los elementos
    private int Longitud;   

}

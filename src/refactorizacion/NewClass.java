/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package refactorizacion;

/**
 *
 * @author jruiz
 */
public class NewClass {
    
    /**
     * @return the valor
     */
    public int getValor() {
        int valor = 0;
        return valor;
    }

    public void Visualizar(int[] v) {
        int Longitud = 0;
        int i = 0;
        //Mostramos los elementos del array
        System.out.print("v={");
        
        for (i = 0; i < Longitud; i++) {
            System.out.print(v[i] + ",");
        }
        System.out.println("}");
    }
    
}

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

    /**
     * @return the valor
     */
    public int getValor() {
        return valor;
    }

    /**
     * @param valor the valor to set
     */
    public void setValor(int valor) {
        this.valor = valor;
    }

    private int valor;
//metodo que modifica el contenido de la posicion posicion de un array con el valor pasado

    public void modificar(int[] vector, int posicion) {
        int i;
//Mostramos los elementos del array
        System.out.print("v={");
        for (i = 0; i < vector.length; i++) {
            System.out.print(vector[i] + ",");
        }
        System.out.println("}");
//Modificamos el array
        if (posicion < vector.length) {
//mostramos su contenido
            System.out.println("Elemento a modificar=" + vector[posicion]);
            vector[posicion] = this.getValor();
        }
//Mostramos los elementos del array
        System.out.print("v={");
        for (i = 0; i < vector.length; i++) {
            System.out.print(vector[i] + ",");
        }
        System.out.println("}");
    }
//metodo que borra el elemento de la posicion posicion desplazando a la izquierda todos los elementos

    public void borrar(int[] v) {
        int p = 1, i;
//mostramos su contenido
//Mostramos los elementos del array
        System.out.print("v={");
        Longitud = v.length;
        for (i = 0; i < Longitud; i++) {
            System.out.print(v[i] + ",");
        }
        System.out.println("}");
//Borramos el elemento
        if (p < Longitud) {
            System.out.println("Elemento a borrar=" + v[p]);
            for (i = p; i < Longitud - 1; i++) {
                v[i] = v[i + 1];
            }
        }
        Visualizar(v);
    }

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

    public void insertar(int[] LongitudActual, Object par1) {
        int p = 1, i;
//mostramos su contenido
//Mostramos los elementos del array
        System.out.print("v={");
        for (i = 0; i < LongitudActual.length; i++) {
            System.out.print(LongitudActual[i] + ",");
        }
        System.out.println("}");
//Borramos el elemento
        if (p < LongitudActual.length) {
            System.out.println("Elemento a insertar=" + this.getValor());
            for (i = LongitudActual.length - 1; i > p; i--) {
                LongitudActual[i] = LongitudActual[i - 1];
            }
            LongitudActual[p] = this.getValor();
        }
//Mostramos los elementos del array
        System.out.print("v={");
        for (i = 0; i < LongitudActual.length; i++) {
            System.out.print(LongitudActual[i] + ",");
        }
        System.out.println("}");
    }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication4.Services;

import javaapplication4.Entities.Arreglo;

/**
 *
 * @author raulb
 */
public class ArregloService {
    
    public Arreglo crearArreglo(){
        Arreglo miArrayList = new Arreglo();
        return miArrayList;
    }
    public void agregarElemento(Arreglo miArrayList, double elemento) {

        miArrayList.setMiArrayList(elemento);

    }
    public void agregarElementoEnPosicion(Arreglo miArrayList, int posicion, double valor) {
        miArrayList.setMiArrayListPosition(posicion, valor);
    }
    public double obtenerElemento(Arreglo miArrayList, int indice) {
        return miArrayList.getMiArrayList(indice);
    }
    public int obtenerTamanio(Arreglo miArrayList) {
        return miArrayList.getMiArrayListSize();
    }
    public void ordenar(Arreglo miArrayList){ miArrayList.sortArrary(); }
    
}

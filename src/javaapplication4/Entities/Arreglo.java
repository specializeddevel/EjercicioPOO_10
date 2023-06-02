/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication4.Entities;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author raulb
 */
public class Arreglo {
        private ArrayList<Double> miArrayList;
    public Arreglo() {
        miArrayList = new ArrayList<>();
    }
    public Double getMiArrayList(Integer posicion) {
        return this.miArrayList.get(posicion);
    }
    public void setMiArrayList(double valor) {
        this.miArrayList.add(valor);
    }
    public Integer getMiArrayListSize() {
        return this.miArrayList.size();
    }
    public void setMiArrayListPosition(int indice, double valor) {
        this.miArrayList.set(indice, valor);
    }
    public void sortArrary(){
        Collections.sort(this.miArrayList);
    }
}


package javaapplication4;

import javaapplication4.Entities.Arreglo;
import javaapplication4.Services.ArregloService;
import java.math.RoundingMode;
import java.text.DecimalFormat;
/**
 *
 * @author raulb
 */
public class JavaApplication4 {

 public static void main(String[] args) {
     
        /*Se utiliza ArrayList por ser mucho mas facil de operar que un Array tradicional*/
        ArregloService ServiceArreglos = new ArregloService();
        Arreglo arregloA = ServiceArreglos.crearArreglo();
        Arreglo arregloB = ServiceArreglos.crearArreglo();
        /*formato a usar en la presentacion del redondeo*/
        DecimalFormat df = new DecimalFormat("#0,0");
        df.setRoundingMode(RoundingMode.HALF_UP);
        double aleatorio;
        /*llena el array A con 50 numeros reales aleatorios*/
        System.out.println("Arreglo A original: ");
        for (int i=1; i<=50; i++){
            aleatorio = Math.random()*10.5;
            /*formatea para que solo se presente un decimal*/
            String resultado = df.format(aleatorio);
            aleatorio = Double.parseDouble(resultado);
            /*ingresa el valor*/
            ServiceArreglos.agregarElemento(arregloA, aleatorio);
            /*imprime del arreglo A original con paginacion de 10 elementos*/
            System.out.print("[" + aleatorio + "]");
            if(i%10==0){
                /*salto de linea*/
                System.out.println();
            }
        }
        /*ordena el arreglo A*/
        ServiceArreglos.ordenar(arregloA);      
        /*muestra el arreglo A ordenado y carg alos datos de B*/
        System.out.println();
        System.out.println("Arreglo A ordenado: ");
        int j=0;        
        for (int i = 1; i <= ServiceArreglos.obtenerTamanio(arregloA); i++) {
            /*imprime del arreglo A ordenado con paginacion de 10 elementos*/
            System.out.print("[" + ServiceArreglos.obtenerElemento(arregloA,i-1) + "]");
            if(i%10==0){
                /*salto de linea*/
                System.out.println();
            }
            /*comienza la caraga de B*/
            if (j<10) {
                /*carga los primeros 10 elementos de A en B*/
                ServiceArreglos.agregarElemento(arregloB,ServiceArreglos.obtenerElemento(arregloA,i-1));
            } else if (j<20) {
                /*llena los ultimos 10 elementos de B con 0.5*/
                ServiceArreglos.agregarElemento(arregloB,0.5);
            }
            j++;
        }
        System.out.println();
        System.out.println("Arreglo B: ");
        for (int i = 1; i <= ServiceArreglos.obtenerTamanio(arregloB); i++) {
            /*imprime del arreglo B con paginacion de 10 elementos*/
            System.out.print("[" + ServiceArreglos.obtenerElemento(arregloB, i-1) + "]");
            if(i%10==0){
                /*salto de linea*/
                System.out.println();
            }
        }
    }
}

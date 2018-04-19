/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algoritmosordenacion;

import java.util.Arrays;
import java.util.Random;

/**
 *
 * @author xp
 */
public class AlgoritmosOrdenacion {

    public void ordenacionBurbuja(int[] numeros) {
        int aux; //variable para hacer los intercambios
        for (int j = 0; j < numeros.length; j++) {
            for (int i = 0; i < numeros.length - 1; i++) {
                if (numeros[i] > numeros[i + 1]) { //intercambio los valores
                    aux = numeros[i + 1];
                    numeros[i + 1] = numeros[i];
                    numeros[i] = aux;
                }
            }
            //System.out.println(Arrays.toString(numeros));
        }

    }

    public void insercionDirecta(int[] numeros) {
        for (int i = 2; i < numeros.length; i++) {
            int aux = numeros[i];
            int j = 0;
            for (j = i - 1; j >= 0 && numeros[j] > aux; j--) {
                numeros[j + 1] = numeros[j];
            }
            numeros[j + 1] = aux;
        }
    }

    public void insercionDirectaWhile(int[] numeros) {
        for (int i = 1; i < numeros.length; i++) {
            int aux = numeros[i];
            int j = i;
            while (j > 0 && numeros[j - 1] > aux) {
                numeros[j] = numeros[j - 1];
                j--;
            }
            numeros[j] = aux;
        }
    }
    
        
    public int[] generaNumerosRandom(int dimension) {
        int[] numeros = new int[dimension];
        Random r = new Random();

        for (int i = 0; i < dimension; i++) {
            numeros[i] = r.nextInt();
        }
        return numeros;
    }
    
    

    public void copiaArrays() {

    }



    public void shellSort() {
//        int inner, outer;
//        long temp;
//        //find initial value of h
//        int h = 1;
//        while (h <= len / 3) {
//            h = h * 3 + 1; // (1, 4, 13, 40, 121, ...)
//        }
//        while (h > 0) // decreasing h, until h=1
//        {
//            // h-sort the file
//            for (outer = h; outer < len; outer++) {
//                temp = data[outer];
//                inner = outer;
//                // one subpass (eg 0, 4, 8)
//                while (inner > h - 1 && data[inner - h] >= temp) {
//                    data[inner] = data[inner - h];
//                    inner -= h;
//                }
//                data[inner] = temp;
//            }
//            h = (h - 1) / 3; // decrease h
//        }
    }

    int[] array1; 
    int[] array2; 
    int[] array3; 
    
    int cantidad = 100000;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        AlgoritmosOrdenacion ejercicios = new AlgoritmosOrdenacion();
        int[] numeros = ejercicios.generaNumerosRandom(ejercicios.cantidad);
        ejercicios.array1 = new int[ejercicios.cantidad];
        ejercicios.array2 = new int[ejercicios.cantidad];
        ejercicios.array3 = new int[ejercicios.cantidad];
        
        for (int i = 0; i < ejercicios.cantidad; i++) {
            ejercicios.array1[i] = numeros[i];
            ejercicios.array2[i] = numeros[i];
            ejercicios.array3[i] = numeros[i];
        }

        System.out.println("Empieza la burbuja: (vete a por un café)");
        long tiempoInicio = System.currentTimeMillis();

        ejercicios.ordenacionBurbuja(ejercicios.array1);

        long tiempoFinal = System.currentTimeMillis();

        System.out.println(tiempoFinal - tiempoInicio);

    }

}

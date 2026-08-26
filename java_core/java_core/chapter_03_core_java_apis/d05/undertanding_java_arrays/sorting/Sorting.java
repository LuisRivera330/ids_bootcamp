package java_core.java_core.java_core.chapter_03_core_java_apis.d05.undertanding_java_arrays.sorting;

import java.util.Arrays; // importa solo Arrays
public class Sorting {
    public static void main(String[] args) {
        //Se declara un array de tipo into. Con 3 valores iniciales
        int[] numbers = { 6, 9, 1 };
        //Se aplica la función sort permite ordenar este arreglo
        Arrays.sort(numbers);
        //Se crea un bucle for para imprimir cada uno de de estos elementos
        //después de ordenarlos
        for (int i = 0; i < numbers.length; i++)
             System.out.print (numbers[i] + " "); //Resultado: 1 6 9

        //Se realiza el siguiente ejemplo con elementos de tipo String
        String[] strings = { "10", "9", "100" };
        //Se realiza el ordenamiento del array
        //En este caso se analiza caracter por caracter y 1 es menor que 9
        Arrays.sort(strings);
        //Se crea un bucle for-each
        for (String string : strings)
            //Se imprime cada elemento
            System.out.print(string + " ");//Resultado: 10 100 9
    }
}

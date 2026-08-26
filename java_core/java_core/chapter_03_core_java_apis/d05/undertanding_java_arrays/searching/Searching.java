package java_core.java_core.java_core.chapter_03_core_java_apis.d05.undertanding_java_arrays.searching;

import java.util.Arrays;

public class Searching {
    public static void main(String[] args) {
        //Se crea un array de tipo int con un valor inicializado de 4 elementos.
        //Estos ya se encuentran ordenados
        int[] numbers = {2,4,6,8};

        //Busca el índice de 2. La respuesta es el índice 0.
        System.out.println(Arrays.binarySearch(numbers, 2)); //Resultado: 0
        //Busca el índice de 4, que es 1.
        System.out.println(Arrays.binarySearch(numbers, 4)); //Resultado: 1
        //Aunque 1 no está en la lista, la búsqueda determina que debe insertarse en la posición 0
        // para mantener el orden. Como 0 ya tiene un significado para los índices de array, Java resta 1 para darnos el resultado de -1.
        System.out.println(Arrays.binarySearch(numbers, 1)); //Resultado -1
        //Aunque 3 no está en la lista, debe insertarse en la posición 1 para mantener el orden.
        // Negamos y restamos 1 para mantener la coherencia, obteniendo -1, también conocido como -2
        System.out.println(Arrays.binarySearch(numbers, 3)); //Resultado: -2
        //Negamos y restamos 1, obteniendo -4, también conocido como -5.
        System.out.println(Arrays.binarySearch(numbers, 9)); //Resultado: -5

        //El array no se encuentra ordenado no dará un resultado predecible
        int[] numbers2 = new int[] {3,2,1};
        //Da la ubicación correcta de 2
        System.out.println(Arrays.binarySearch(numbers, 2));
        //En la siguiente impresión es donde se presenta el error. No da la ubicación correcta
        System.out.println(Arrays.binarySearch(numbers, 3));
    }
}

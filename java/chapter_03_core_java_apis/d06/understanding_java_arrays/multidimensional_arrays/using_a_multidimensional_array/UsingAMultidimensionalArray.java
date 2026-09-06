package ids_bootcamp.java.chapter_03_core_java_apis.d06.understanding_java_arrays.multidimensional_arrays.using_a_multidimensional_array;

public class UsingAMultidimensionalArray {
    public static void main(String[] args) {
        //También se puede especificar el tamaño de la matriz bidimensional.
        String [][] rectangle = new String[3][2];
        //Se registra el string "set" en la ubicación indicada
        rectangle[0][1] = "set";

        //Un array no necesarimienta tiene que tener una forma rectangular
        //Es una matriz de tres elementos
        //El primer arreglo tiene 2 elementos
        //El segundo tiene 1 elemento
        //El último tiene 3 elementos
        int[][] differentSize = {{1, 4}, {3}, {9,8,7}};

        //Otra manera de tener una matriz asimétrica.
        //Se inicializa solo la primera dimensión de la matriz 4
        int [][] args2 = new int[4][];
        //Se define cada elemnto de la matriz.
        //En este caso también se define el tamaño de cada elemento de la matriz
        //El primero es 5 y el segundo 3
        args2[0] = new int[5];
        args2[1] = new int[3];

        //Se crea un array bidimensional. En ella se define sus dimensiones
        int[][] twoD = new int[3][2];
        //Se crea un bucle for
        //inicializador en 0
        //Se itera el bucle hasta completar la longitud del array bidimensional
        //la variable i aumenta en una unidad
        for (int i = 0; i < twoD.length; i++) {
            //Se Crea otro bucle for que itera el array interno
            for (int j = 0; j < twoD[i].length; j++)
                System.out.print(twoD[i][j] + " "); // Imprime cada elemento del array interno
            System.out.println(); // Genera un salto de línea para iterar el nuevo elemento de twoD
            //Resultado:
            //0 0
            //0 0
            //0 0
        }

        //A diferencia del anterior ejemplo. En este se utiliza el bucle for-each
        //La lógica es la misma solo que es más entendible
        for (int[] inner : twoD) {
            for (int num : inner)
                System.out.print(num + " ");
            System.out.println();
            //Resultado:
            //0 0
            //0 0
            //0 0
        }
    }
}

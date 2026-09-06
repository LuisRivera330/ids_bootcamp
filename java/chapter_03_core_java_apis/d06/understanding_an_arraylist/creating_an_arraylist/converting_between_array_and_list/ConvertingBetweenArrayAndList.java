package ids_bootcamp.java.chapter_03_core_java_apis.d06.understanding_an_arraylist.creating_an_arraylist.converting_between_array_and_list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ConvertingBetweenArrayAndList {
    public static void main(String[] args) {
        /*List<String> list = new ArrayList<>();
        //Se agregan nuevos elementos al ArrayList
        list.add("hawk");
        list.add("robin");
        //Se convierte el ArrayList en un array. Lo malo es que se convierte un array de Object
        Object[] objectArray = list.toArray();
        //Imprime la longitud de array
        System.out.println(objectArray.length); //Resultado: 2
        //Se convierte el ArrayList en un array. Pero esta vez
        //especificando el tamaño y la longitud
        //Ojo: Si el tamaño del ArrayList, del que se está convirtiendo, es mayor a la definición del array
        //Se tomará en cuenta el tamaño del primero
        String[] stringArray = list.toArray(new String[0]);
        //Imprime 2 porque el ArrayList origen es más grande de lo pensado
        System.out.println(stringArray.length); //Resultado: 2*/

        String[] array = { "hawk", "robin" }; // Se crea un nuevo Array con valores establecidos [hawk, robin]
        List<String> list = Arrays.asList(array); // Se define una nueva versión de array. Una versión de tamaño fijo y con respaldo de una lista
        System.out.println(list.size()); //Resultado: 2.
        list.set(1, "test"); // [hawk, test] //Reemplaza un valor existente en la posición 1. Es decir robin --> test
        array[0] = "new"; // [new, test] //De igual manera reemplaza pero al array directamente
        for (String b : array) System.out.print(b + " "); // new test -- Se crea un bucle que imprime los valores
        list.remove(1); // throws UnsupportedOperation Exception -- Lanza una excepción porque no se permite cambiar el tamaño de lista
    }
}

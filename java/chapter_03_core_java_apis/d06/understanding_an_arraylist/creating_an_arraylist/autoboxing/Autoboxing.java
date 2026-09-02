package ids_bootcamp.java.chapter_03_core_java_apis.d06.understanding_an_arraylist.creating_an_arraylist.autoboxing;

import java.util.ArrayList;
import java.util.List;

public class Autoboxing {
    public static void main(String[] args) {
        //Crea una variable de tipo ArrayList que acepta únicamente valores Dobule
        List<Double> weights = new ArrayList<>();
        //Automáticamente convierte 50.5 en Double y lo agrega
        weights.add(50.5); // [50.5]
        //Se pasa a un contenedor el valor de 60
        weights.add(new Double(60)); // [50.5, 60.0]
        //Automáticamente convierte 50.5 en Double y lo remueve
        weights.remove(50.5); // [60.0]
        //Recupera el primer valor de la lista y lo convierte nuevamente en primitivo
        double first = weights.get(0); // 60.0

        List<Integer> heights = new ArrayList<>();
        //Agregamos un valor nulo a lista
        heights.add(null);
        //Intentamos convertir ese valor nulo a un entero. Produce un error
        //int h = heights.get(0); // NullPointerException

        List<Integer> numbers = new ArrayList<>();
        //Agrega nuevos valores a la lista
        numbers.add(1);
        numbers.add(2);
        //Remueve el emento en la ubicación de 1, es decir:2
        numbers.remove(1);
        //Imprime la lista
        System.out.println(numbers); //[1]
    }

}

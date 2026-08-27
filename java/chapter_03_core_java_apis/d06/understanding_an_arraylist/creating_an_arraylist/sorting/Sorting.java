package ids_bootcamp.java.chapter_03_core_java_apis.d06.understanding_an_arraylist.creating_an_arraylist.sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Sorting {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        //Agrega nuevos valores al arrayList
        numbers.add(99);
        numbers.add(5);
        numbers.add(81);
        //En este caso se usa otra clase auxiliar diferente
        //Collections.sort(numbers);
        Collections.sort(numbers);
        System.out.println(numbers); //Resultado[5, 81, 99]
    }
}

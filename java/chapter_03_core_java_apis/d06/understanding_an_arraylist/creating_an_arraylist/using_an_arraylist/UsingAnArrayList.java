package ids_bootcamp.java.chapter_03_core_java_apis.d06.understanding_an_arraylist.creating_an_arraylist.using_an_arraylist;

import java.util.ArrayList;
import java.util.List;

public class UsingAnArrayList {

    public static void main(String[] args) {
        //add
        //Firma de los métodos
        //boolean add(E element);
        //void add(int index, E element)
        //Se crea una variable de tipo ArrayList
        //Como no se especifico acepta cualquier valor. Menos datos de tipo primitivo
        ArrayList list = new ArrayList();
        //Se agrega un elemento de tipo string
        list.add("hawk"); // [hawk]
        //Agrega un valor booleano
        list.add(Boolean.TRUE); // [hawk, true]
        System.out.println(list); // [hawk, true]

        //Ahora se indica que solo se desea elementos de tipo String
        ArrayList<String> safer = new ArrayList<>();
        safer.add("sparrow");
        //No compila porque es un elemento de tipo Boolean
        //safer.add(Boolean.TRUE);

        //Se crea una variable de tipo ArrayList
        List<String> birds = new ArrayList<>();
        //Se agrega un valor, por defecto en la última posición
        birds.add("hawk"); // [hawk]
        //Se agrega nuevos valores pero esta vez indicando la posición
        //Tomar en cuenta las nuevas ubicacciones
        birds.add(1, "robin"); // [hawk, robin]
        birds.add(0, "blue jay"); // [blue jay, hawk, robin]
        birds.add(1, "cardinal"); // [blue jay, cardinal, hawk, robin]
        System.out.println(birds); //Resultado: [blue jay, cardinal, hawk, robin]

        //Remove()
        //Firmas del método
        //boolean remove(Object object)
        //E remove(int index)


        List<String> birds2 = new ArrayList<>();
        //Se agregan dos elementos. En este caso son lo mismo
        birds2.add("hawk"); // [hawk]
        birds2.add("hawk"); // [hawk, hawk]
        //Se aplica la función remove.
        System.out.println(birds2.remove("cardinal")); // Imprime false porque no se llegó a encontrar ese objeto
        System.out.println(birds2.remove("hawk")); // Imprime true se llegó a encontrar
        System.out.println(birds2.remove(0)); // Imprime el valor eliminado -- hawk
        System.out.println(birds2); // [] Lista vacía

        //Set()
        //Firma del método
        //E set(int index, E newElement)

        List<String> birds3 = new ArrayList<>();
        //Se agrega el elemento "hawk"
        birds3.add("hawk"); // [hawk]
        //Imprime la longitud del arrayList
        System.out.println(birds3.size()); // 1
        //Modifica el primer elemento de hawk a robin
        birds3.set(0, "robin"); // [robin]
        System.out.println(birds3.size()); // 1
        //birds3.set(1, "robin"); // Genera un error porque solo hay un elemento en la lista, el cual su índice es 0

        //isEmpty() and size()
        //Firmas de los métodos
        //boolean isEmpty()
        //int size()

        List<String> birds4 = new ArrayList<>();
        System.out.println(birds4.isEmpty()); // Imprime true porque el array está vacío
        System.out.println(birds4.size()); // El resulado es 0 porque es el tamaño actual de la lista
        //Agrega dos elementos
        birds.add("hawk"); // [hawk]
        birds.add("hawk"); // [hawk, hawk]
        System.out.println(birds.isEmpty()); // Imprime false porque el array ahora tiene elementos
        System.out.println(birds.size()); // El resulado es 2 porque es el tamaño actual de la lista

        //clear()
        List<String> birds5 = new ArrayList<>();
        birds5.add("hawk"); // [hawk]
        birds5.add("hawk"); // [hawk, hawk]
        System.out.println(birds5.isEmpty()); // false
        System.out.println(birds5.size()); // 2
        //El método clear limpia la lista
        birds5.clear(); // []
        //Por lo tanto el método isEmpty imprime true
        System.out.println(birds5.isEmpty()); // true
        //Su longitud de la lista es 0
        System.out.println(birds5.size()); // 0

        //contains()
        //Firma del método
        //boolean contains(Object object)
        List<String> birds6 = new ArrayList<>();
        birds6.add("hawk"); // [hawk]
        //El valor imprimido es true porque si se llega encontrar hawk
        System.out.println(birds6.contains("hawk")); // true
        //El otro caso es false porque no se llega encontrar el elemento "robin"
        System.out.println(birds6.contains("robin")); // false


        //equals()
        //Firma del método
        //boolean equals(Object object)

        List<String> one = new ArrayList<>();
        List<String> two = new ArrayList<>();
        //Imprime true porque ambas litas están vacías
        System.out.println(one.equals(two)); // true
        one.add("a"); // [a]
        //Imprime false porque ahora la lista one tiene un elemento y two no
        System.out.println(one.equals(two)); // false
        two.add("a"); // [a]
        //Ahora ambos tienen el mismo elemento. Por lo tanto la respuesta es true
        System.out.println(one.equals(two)); // true
        //Se agrega un valor a one
        one.add("b"); // [a,b]
        //Se agrega un valor a two pero en diferente ubicación
        two.add(0, "b"); // [b,a]
        //El resulado es false
        System.out.println(one.equals(two)); // false


    }

}

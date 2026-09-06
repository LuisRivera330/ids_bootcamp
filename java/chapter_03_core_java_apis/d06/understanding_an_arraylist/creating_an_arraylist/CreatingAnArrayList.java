package ids_bootcamp.java.chapter_03_core_java_apis.d06.understanding_an_arraylist.creating_an_arraylist;

import java.util.*; //Bien se puede importar todo
import java.util.ArrayList; //Solo se importa ArrayList

public class CreatingAnArrayList {
    //Se crea un arrayList vacío
    ArrayList list1 = new ArrayList();

    //Se crea un arrayList con un número específico de espacios, en este caso 10
    ArrayList list2 = new ArrayList(10);

    //Se crea un nuevo arrayList pero en base a otro ArrayList
    ArrayList list3 = new ArrayList(list2);

    //Introdujo los genéricos. Entre los siguientes signos <> se indica que tipo de elemento que se va almacenar
    ArrayList<String> list4 = new ArrayList<String>();
    ArrayList<String> list5 = new ArrayList<>();

    List<String> list6 = new ArrayList<>();
    //ArrayList<String> list7 = new List<>();  // No compila, porque las interfaces no pueden instaciarse
}

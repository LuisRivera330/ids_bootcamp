package ids_bootcamp.java.chapter_01_java_building_blocks.d01.creating_objects.constructors;

import java.util.Random;

//Se crea una clase de tipo publica llamada "Chick"
public class Chick {
    //Se inicializa un atributo en línea de tipo int
    int numEggs = 0;
    String name;

    //Se crea un Constructor. es un tipo especial de método que crea un nuevo objeto
    //El nombre del constructor coincide con el nombre de la clase y no tiene tipo de retorno
    public Chick(){
        name = "Duke";// El atributo se inicializa en el constructor
    }

    //public void Chick(){} No es constructor
}

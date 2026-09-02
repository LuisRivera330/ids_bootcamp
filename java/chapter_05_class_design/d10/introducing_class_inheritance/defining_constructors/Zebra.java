package ids_bootcamp.java.chapter_05_class_design.d10.introducing_class_inheritance.defining_constructors;

public class Zebra extends Animal {
    //Se declara un constructor con un parámetro de tipo int
    public Zebra(int age) {
        //Se realiza una llamada al constructor padre. Es decir, se llama al constructor de Animal
        super(age);
    }
    //Se declara un segundo constructor, sin argumentos, de la clase Zebra.
    //Con el comando this(4) llama al otro constructor de la clase Zebra
    public Zebra() {
        this(4);
    }
}

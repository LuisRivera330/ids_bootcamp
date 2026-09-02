package ids_bootcamp.java.chapter_05_class_design.d10.introducing_class_inheritance.defining_constructors;

public class Animal {
    /*private int age;
    public Animal(int age) {
        //Realiza la llamada del constructor padre. Definido en java.lang.Object
        //Para ello utiliza la palabra reservada super()
        super();
        this.age = age;
    }*/

    //Se declaran dos variables age y name
    private int age;
    private String name;

    //Se crean dos constructores con diferente cantidad de parámetros para diferenciarlos
    public Animal(int age, String name) {
        super();
        this.age = age;
        this.name = name;
    }
    public Animal(int age) {
        super();
        this.age = age;
        this.name = null;
    }
}

package ids_bootcamp.java.chapter_05_class_design.d10.introducing_class_inheritance.defining_constructors;

public class Zoo {
    /*public Zoo() {
        System.out.println("Zoo created");
        //super(); // No compila porque, super() solo puede usarse como la primera instrucción del constructor. Sin contar los comentarios
    }*/

    public Zoo() {
        super();
        System.out.println("Zoo created");
        //super(); // No compila porque, super() solo puede usarse como la primera instrucción del constructor. Sin contar los comentarios
    }
}
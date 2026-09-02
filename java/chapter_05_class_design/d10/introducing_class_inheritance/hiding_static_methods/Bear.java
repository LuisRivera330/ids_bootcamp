package ids_bootcamp.java.chapter_05_class_design.d10.introducing_class_inheritance.hiding_static_methods;

public class Bear {
    //Se declara un método estático que no devuelve nada (void)
    public static void eat() {
        System.out.println("Bear is eating");
    }
    //Se declara un método estático que tampoco devuelve nada
    public static void sneeze() {
        System.out.println("Bear is sneezing");
    }
    //Se declar un metodo de instancia
    public void hibernate() {
        System.out.println("Bear is hibernating");
    }
}

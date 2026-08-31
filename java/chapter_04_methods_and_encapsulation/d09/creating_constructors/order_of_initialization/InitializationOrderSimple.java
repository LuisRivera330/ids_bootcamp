package ids_bootcamp.java.chapter_04_methods_and_encapsulation.d09.creating_constructors.order_of_initialization;

public class InitializationOrderSimple {
    //Se crea una variable de instancia
    private String name = "Torchie";
    {
        System.out.println(name);
    }
    //Se crea una variable estática
    private static int COUNT = 0;
    //Se crea un inicializador estático. Dentro se realiza la impresión de COUNT
    static { System.out.println(COUNT); }
    //Se aumenta en 10 COUNT, luego se imprime el valor actual de COUNT
    static { COUNT += 10; System.out.println(COUNT); }
    //Se crea el constructor. Dentro se imprime la palabra "constructor"
    public InitializationOrderSimple() {
        System.out.println("constructor");
    }


}

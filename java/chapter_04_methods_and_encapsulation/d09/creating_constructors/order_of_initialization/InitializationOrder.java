package ids_bootcamp.java.chapter_04_methods_and_encapsulation.d09.creating_constructors.order_of_initialization;

public class InitializationOrder {
    //En este caso, nuevamente la regla 1 no aplica porque no hay superclase.
    //La regla 2 nos indica que examinemos las variables estáticas y los inicializadores estáticos. En este caso la línea 9 y 10. El valor de COUNT es 0
    //Luego, el método main se ejecuta
    //Después, se usa la tercera regla. La cual imprime las variables de instancia y los inicializadores de instancia. Línea  9 y 10
    //Finalmente, la regla 4 indica que se ejecute el constructor. El cual devuelve el mensaje de "constructor"

    private String name = "Torchie";
    { System.out.println(name); }
    private static int COUNT = 0;
    static { System.out.println(COUNT); }
    { COUNT++; System.out.println(COUNT); }
    public InitializationOrder() {
        System.out.println("constructor");
    }

    public static void main(String[] args) {
        System.out.println("read to construct");
        new InitializationOrder();
    }
    //Resultado:
    //0
    //read to construct
    //Torchie
    //1
    //constructor
}

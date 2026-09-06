package ids_bootcamp.java.chapter_04_methods_and_encapsulation.d09.creating_constructors.order_of_initialization;

public class CallInitializationOrderSimple {
    public static void main(String[] args) {
        InitializationOrderSimple init = new InitializationOrderSimple();
        //Si seguimos la regla. El orden sería el siguiente
        //La regla 1 no se aplica porque no hay superclase
        //La regla 2 indica que se ejecuten las declaraciones de variables estáticas y los inicializadores estáticos
        //La regla 3 indica que se ejecuten las declaraciones de variables de instancia y los inicializadores de instancia
        //Por último, indica que se ejecute el constructor
        //Resultado Final:
        //0
        //10
        //Torchie
        //constructor
    }
}

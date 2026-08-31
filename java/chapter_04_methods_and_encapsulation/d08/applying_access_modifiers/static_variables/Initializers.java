package ids_bootcamp.java.chapter_04_methods_and_encapsulation.d08.applying_access_modifiers.static_variables;

import java.util.ArrayList;

public class Initializers {
    //Se inicializa una variable estática en la línea donde se declara. Valor inicial de 0
    //Su función princial es aumentar con el tiempo
    private static int counter = 0;

    //Variable estática para no cambiar nunca durante la ejecución del programa
    //Utiliza el modificador `final`
    //Las constantes estáticas finales utilizan una convención.
    //letras mayúsculas con guiones bajos entre las palabras
    private static final int NUM_BUCKETS = 45;

    private static final ArrayList<String> values = new ArrayList<>();

    public static void main(String[] args) {
        //NUM_BUCKETS = 5; // No compila, porque es una variable estática que no puede cambiar su valor

        // Sí compila. Porque `values` es una variable de referencia.
        //El compilador solo puede comprobar que no intentemos reasignar `final values` para que apunte a un objeto diferente.
        values.add("changed");

    }
    //El inicializador estático se ejecuta la primera vez que se usa la clase.
    //Las instrucciones que contiene se ejecutan y asignan las variables estáticas según sea necesario
    //A pesar de que diga la palabra 'final' en la variable NUM_SECONDS_PER_HOUR.
    //La clave está en que el inicializador estático es la primera asignación, por lo tanto se ejecuta con normalidad
    private static final int NUM_SECONDS_PER_HOUR;
    static {
        int numSecondsPerMinute = 60;
        int numMinutesPerHour = 60;
        NUM_SECONDS_PER_HOUR = numSecondsPerMinute * numMinutesPerHour;
    }

    //one es una variable estática que no es final.Es decir, se le puede asignar tantas veces como se desee.
    private static int one;
    //two declara una variable final sin inicializarla. Esto significa que se puede inicializar exactamente una vez en un bloque estático
    private static final int two;
    //three declara una variable final y la inicializa al mismo tiempo
    private static final int three = 3;
    //private static final int four; // No compila porque, se declara una variable final que nunca se inicializa.
    static {
        one = 1;
        two = 2;
        //three = 3; // No compila porque, es una variable que no se puede volver asignar un valor 'final'
        //two = 4; // No compila porque, es el segundo intento de inicializar la variable two
        }

}

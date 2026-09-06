package ids_bootcamp.java.chapter_03_core_java_apis.d05.understanding_equality;

public class UnderstandingEquality {
    public static void main(String[] args) {
        //Se declaran dos objetos StringBuilder cada uno apuntando a diferente referencia
        StringBuilder one = new StringBuilder();
        StringBuilder two = new StringBuilder();
        //Se asigna la variable one a three y se le añade la cadena de "a"
        StringBuilder three = one.append("a");
        //Imprime falso porque apuntan a diferente referencia por lo tanto es false
        System.out.println(one == two); // false
        //Son lo mismo porque apuntan al mismo objeto por lo tanto es true
        System.out.println(one == three); // true

        //Se declara dos variables de tipo String con el mismo contenido
        String x = "Hello World";
        String y = "Hello World";
        //El resultado es true porque se obtiene del String Pool
        System.out.println(x == y); // true

        //Se declara dos variables de tipo String con el mismo contenido
        //Pero no identicos
        String x2 = "Hello World";
        String z2 = " Hello World".trim();
        //El resultado sale false porque uno se calcula en el tiempo de ejecución.
        //Como no es lo mismo crea un nuevo objeto String
        System.out.println(x2 == z2); // false

        //La variable x4 está en una referencia diferente. Se crea un objeto de él
        String x4 = new String("Hello World");
        //Se mantiene en el String Pool
        String y4 = "Hello World";
        //Son valores diferentes por lo tanto es false
        System.out.println(x4 == y4); // false


    }
}

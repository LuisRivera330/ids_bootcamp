package java_core.java_core.java_core.chapter_02_operators_and_statements.d04.understanding_java_statements.the_for_statement.the_for_each_statement;

public class TheForEachStatement {
    public static void main(String[] args) {

        //Ejemplo 01:
        //Se declara un arreglo de tipo String. En su definición con 3 elementos
        //La palabra final nos indica que no puede ser modificado
        /*final String[] names = new String[3];
        //Se asignan valores a cada posición. Recordar que siempre inicia con la posición 0
        names[0] = "Lisa";
        names[1] = "Kevin";
        names[2] = "Roger";
        //Se utiliza un bucle for-each para recorrer cada elemento del array
        //En cada iteración la variable name de tipo String toma el valor del array names de su posición actual
        for(String name : names) {
            //Se imprime cada valor de name
            //Lisa, Kevin, Roger
            System.out.print(name + ", ");
        }*/

        //Ejemplo 02:
        //Se declara una lista dinámica de tipo String. Recordar que es flexible
        /*java.util.List<String> values = new java.util.ArrayList<String>();
        //Se agrega elementos a lista
        values.add("Lisa");
        values.add("Kevin");
        values.add("Roger");
        //Se utiliza el bucle for-each para recorrer cada elemento de la lista
        for(String value : values) {
            //Se imprime cada valor de name
            //Lisa, Kevin, Roger,
            System.out.print(value + ", ");
        }*/

        //Ejemplo 03:
        //El siguiente ejercicio no compila porque names4 es un String. No es un objeto iterable
        //por lo que compilador genera una excepción. No sabe como iterar sobre cadena
        /*String names4 = "Lisa";
        for(String name : names4) {
            System.out.print(name + " ");
        }*/

        //Ejemplo 04:
        //Hay dos motivos por el cual el siguiente ejercicio no compila
        //1. El array se encuentra vacio, por lo que imprimiría puro valor null
        //2. Porque la variable name es de tipo int. Lo cual es erroneo debería ser de tipo String
       /* String[] names5 = new String[3];
        for(int name : names5) { // No compila
            System.out.print(name + " ");
        }*/

        //Los siguiente 2 bucles son equivalentes. Ya que el compilador convierte el bucle for-each en un bucle for
        /*for(String name : names) {
            System.out.print(name + ", ");
        }
        //En este segundo bucle, se utiliza como inicializador la variable i con valor 0.
        //La condición será hasta cumplir toda la longitud del array
        //el valor de i incrementará en una unidad
        for(int i=0; i < names.length; i++) {
            //Se declara una variable de tipo String la cual se asigna el valor actual del array
            String name = names[i];
            //Se imprime el valor actual de name
            System.out.print(name + ", ");
        }*/

        //En este caso se está suponiendo que la lista es de tipo Integer. El caso sería similar
        /*for(int value : values) {
            System.out.print(value + ", ");
        }
        //El inicializador obtiene un objeto iterar a partir de la lista values
        //La condición evalua si i.hastNext() devuelve true
        //La actualización está vacía por el avance explícito del hastNext
        for(java.util.Iterator<Integer> i = values.iterator(); i.hasNext(); ) {
            //Toma el valor actual de la lista
            int value = i.next();
            //Imprime el valor número actual
            System.out.print(value + ", ");
        }*/

        //Se declara una lista dinámica de tipo String vacía
        /*java.util.List<String> names4 = new java.util.ArrayList<String>();

        //Se agrega elemetos a esa lista
        names4.add("Lisa");
        names4.add("Kevin");
        names4.add("Roger");*/

        //Se aplica un bucle for simple
        //Inicializa la variable i en 0
        //La condición se ejecuta mientras la longitud de la lista sea mayor a i
        //El incremento de i es de una unidad en cada iteración
        /*for(int i=0; i<names4.size(); i++) {
            //Se asigna a la variable name el valor actual de la lista
            String name = names4.get(i);
            //Si i es mayor a 0 se coloca una coma
            //Se realiza con el propósito de no dejar una coma al final
            if(i>0) {
                System.out.print(", ");
            }
            //Se imprime cada elemento
            System.out.print(name);
        }*/

        //Se declara un array de tipo int con capacidad de 3 elementos
        int[] values5 = new int[3];

        //Se asigna valores al arreglo
        values5[0] = 10;
        values5[1] = new Integer(5);
        values5[2] = 15;

        //Se crea un bucle for simple
        //El inicializador toma un valor de 1
        //La condición se mantiene mientras la longitud del arreglo sea mayor a i
        //La variable 1 aumenta en una unidad en cada iteración
        for(int i=1; i<values5.length; i++) {
            //Se imprime el resultado. El valor actual menos un valor anterior
            //Resultado -5, 10
            System.out.print(values5[i]-values5[i-1]);
        }
    }
}

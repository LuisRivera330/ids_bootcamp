package java_core.java_core.java_core.chapter_02_operators_and_statements.d04.understanding_java_statements.the_for_statement.the_basic_for_statement;

public class TheBasicForStatement {
    public static void main(String[] args) {
        //Se crea un bucle for simple. su variable de inicialización es 0
        //La expresión que se evalua es hasta que i sea menor que 10
        //La actualización de i en cada iteración será de una unidad
        //Se imprime los valores que llega a tomar i
        /*for(int i = 0; i < 10; i++) {
            //Llega imprimir hasta 9
            System.out.print(i + " ");
        }*/

        //Ejemplo 01:
        //Aunque parece que no está bien bucle, si compila. Eso quiere decir que los componentes son opciones
        //Tenemos que colocar el ; para diferenciar cada componente
        //Siempre va imprimir "Hello World"
        /*for( ; ; ) {
            System.out.println("Hello World");
        }*/

        //Ejemplo 02:
        //Primero se crea una variable x de tipo int con valor inicial 0
        /*int x = 0;
        //Luego en el inicializador se declara más de una variable "Y y Z"
        //En la condición se evalua si "x" es menor que 5, y "y" menor 10
        //La actualización hace que la variable "y" y "x" incremente en una unidad en cada iteración
        for(long y = 0, z = 4; x < 5 && y < 10; x++, y++) {
            //Se imprime el valor de y. LLegará hasta 4
            System.out.print(y + " ");
        }
        //Se imprime el valor de x que será 5
        System.out.print(x); */

        //El siguiente bloque de código no compila porque hay una redeclaración de la variable x
        //Es decir quiere pasar de tipo int a long. Lo cual no se puede
        /*int x = 0;
        for(long y = 0, x = 4; x < 5 && y < 10; x++, y++) { // No compila
            System.out.print(x + " ");
        }*/

        //Solución planteada
        //El siguiente bloque de código si compila porque ahora el valor de "y" se está declarando afuera
        //lo que ayuda a solucionar el conflicto
        /*int x = 0;
        long y = 10;
        //Los inicializadores son "y" y "x". A "y" se le está asignando un valor de 0. Y a "x" se le está asignando un nuevo valor de 4
        //La condición indica que el bucle se ejecutará hasta que "x" sea menor que 5 y "y" menor que 10
        //El incremento realiza un aumento de una unidad en y
        for(y = 0, x = 4; x < 5 && y < 10; x++, y++) {
            //El valor que llega imprimir es 4, porque en la siguiente iteración x tomará el valor de 5, lo cual no cumple condición
            System.out.print(x + " ");
        }*/


        //Ejemplo 03:
        //El siguiente ejemplo no compila porque todas las variables del bloque de inicialización deben ser la misma
        //En este caso tenemos que "y" es de tipo long y "x" de tipo int
        /*for(long y = 0, int x = 4; x < 5 && y<10; x++, y++) { // DOES NOT COMPILE
            System.out.print(x + " ");
        }*/


        //Ejemplo 04:
        //El siguiente bloque de código no compila porque se esta tratando de usar la variable x afuera del bucle for
        //El maxímo alcance que tiene esta variable es dentro del bucle.
        for(long y = 0, x = 4; x < 5 && y < 10; x++, y++) {
            System.out.print(y + " ");
        }
        //System.out.print(x); //No compila
    }
}

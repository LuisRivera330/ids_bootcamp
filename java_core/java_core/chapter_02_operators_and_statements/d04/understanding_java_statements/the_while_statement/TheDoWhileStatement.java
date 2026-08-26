package java_core.java_core.java_core.chapter_02_operators_and_statements.d04.understanding_java_statements.the_while_statement;

public class TheDoWhileStatement {
    public static void main(String[] args) {
        //Se declara una variable de tipo int con valor inicial de 0
        int x = 0;
        //Se crea una estructura do-while. Dentro del bloque de código se aumenta en una unidad la variable x
        do {
            x++;
        } while(false);
        System.out.println(x); // El resultado obtenido es 1 porque al llegar a la condición el resultado siempre será false

        //Diferencia entre bucle while y do-while

        //BUCLE WHILE
        //Se crea un bucle while. Se evalua si x es mayor que 10.
        //Si es verdad entra al bloque de código y reduce en una unidad el valor de x
        while(x > 10) {
            x--;
        }


        //BUCLE DO-WHILE
        //Primero se plantea una estructura if. La cual indica si x es mayor a 10 entra a la condición
        //Luego, se aplica un bucle do-while, donde el valor de while se reduce en una unidad
        //Despues, se evalua si x sigue siendo mayor a 10
        if(x > 10) {
            do {
                x--;
                System.out.println(x);
            } while(x > 10);
        }
    }
}

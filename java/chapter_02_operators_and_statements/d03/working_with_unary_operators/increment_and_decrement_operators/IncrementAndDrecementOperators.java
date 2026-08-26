package ids_bootcamp.java.chapter_02_operators_and_statements.d03.working_with_unary_operators.increment_and_decrement_operators;

public class IncrementAndDrecementOperators {
    public static void main(String[] args) {
        int counter = 0;
        //Imprime el valor actual de counter
        System.out.println(counter); //Resultado: 0
        //Se le agrega una unidad al valor de counter
        System.out.println(++counter); // Resultado: 1
        //Se imprime el valor de counter que es 1 ahora
        System.out.println(counter); // Resultado 1
        //Se resta en una unidad al valor de counter pero se considera en el siguiente print
        System.out.println(counter--); // Resultado 1
        //Se imprime el valor de counter acutal, es decir 0
        System.out.println(counter); // Resultado 0

        int x = 3;
        int y = ++x * 5 / x-- + --x; //Primero x recibe el valor de 4
        //int y = 4 * 5 / x-- + --x; // x tiene asignado el valor 4
        //int y = 4 * 5 / 4 + --x; // x tiene asignado el valor 3
        //int y = 4 * 5 / 4 + 2; // x tiene asignado el valor 2
        System.out.println("x is " + x); //Resultado de 2
        System.out.println("y is " + y); //Resultado de 7
    }
}

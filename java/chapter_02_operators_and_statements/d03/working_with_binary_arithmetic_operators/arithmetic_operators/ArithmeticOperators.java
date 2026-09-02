package ids_bootcamp.java.chapter_02_operators_and_statements.d03.working_with_binary_arithmetic_operators.arithmetic_operators;

public class ArithmeticOperators {
    public static void main(String[] args) {
        int x = 2 * 5 + 3 * 4 - 8; //Primero se resuelve 2*5 y 3*4
        //int x = 10 + 12 - 8; la expresión se reduce a lo siguiente
        System.out.println(x); //Resultado 14

        int y = 2 * ((5 + 3) * 4 - 8); //Se resuelve lo primero que está en paréntesis porque es el orden de operador de precendencia
        //int y = 2 * (8 * 4 - 8); la expresión se reduce a lo siguiente
        //int x = 2 * (32 – 8);
        //int x = 2 * 24;
        System.out.println(y); //Resultado 48

        //Realiza una división con resultado entero. Puede que quede residuo pero no se considera
        //El % nos indica el residuo que quedó
        System.out.println(9 / 3); // Resultado 3
        System.out.println(9 % 3); // Resultado 0

        System.out.println(10 / 3); // Resultado 3
        System.out.println(10 % 3); // Resultado 1

        System.out.println(11 / 3); // Resultado 3
        System.out.println(11 % 3); // Resultado 2

        System.out.println(12 / 3); // Resultado 4
        System.out.println(12 % 3); // Resultado 0
    }
}

package java_core.java_core.java_core.chapter_02_operators_and_statements.d03.understanding_java_operators;

public class UnderstandingJavaOperators {
    public static void main(String[] args) {
        int y = 4;
        double x = 3 + 2 * --y; //La operación se realiza de derecha a izquierda
        System.out.println(x); //El resultado es de 9.0
        System.out.println(--y);
    }
}

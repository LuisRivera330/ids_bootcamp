package ids_bootcamp.java.chapter_02_operators_and_statements.d03.understanding_java_operators;

public class UnderstandingJavaOperators {
    public static void main(String[] args) {
        int y = 4;
        double x = 3 + 2 * --y; //La operación se realiza de derecha a izquierda. Porque se realiza primero la mútliplicación
        System.out.println(x); //El resultado es de 9.0 porque, primero resta en una unidad a y, luego multiplica *2 y al último suma el valor de 3
        System.out.println(--y); //El resultado es 2 porque, se resta en una unidad el valor actual de y
    }
}

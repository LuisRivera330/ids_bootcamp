package java_core.java_core.java_core.chapter_02_operators_and_statements.d03.understanding_java_statements.ternary_operator;

public class TernaryOperator {
    public static void main(String[] args) {
        //Ambas opciones son válidas
        /*int y = 10;
        final int x;
        if(y > 5) {
            x = 2 * y;
        } else {
            x = 3 * y;
        }
        System.out.println((y > 5) ? 21 : "Zebra");*/

        //La variable animal no compila porque el tipo de dato esperado es int y Horse es de tipo String
        /*int animal = (y < 91) ? 9 : "Horse"; // DOES NOT COMPILE
        int x = (y > 5) ? (2 * y) : (3 * y);*/

        //Solo es necesario que cumpla la primera condición para imprimir el valor de las variables
        /*int y = 1;
        int z = 1;
        final int x = y<10 ? y++ : z++;
        System.out.println(y+","+z); // Outputs 2,1*/

        //En este caso la segunda condición se cumple
        int y = 1;
        int z = 1;
        final int x = y>=10 ? y++ : z++;
        System.out.println(y+","+z); // Outputs 1,2

    }
}

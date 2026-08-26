package ids_bootcamp.java.chapter_02_operators_and_statements.d03.using_additonal_binary_operators.equality_operators;

import java.io.File;

public class EqualityOperators {
    public static void main(String[] args) {
        //No compilan los siguientes ejemplos porque son de diferentes tipos de datos
        /*boolean x = true == 3; // No compila, se compara un true con 3
        boolean y = false != "Giraffe"; // No compila se compra un booleano con un string
        boolean z = 3 == "Kangaroo"; // No compila se compra un int con un string*/

        boolean y = false;
        boolean x = (y == true);
        System.out.println(x); // Resultado true, porque se asgina a "x" el valor de "y"

        File x2 = new File("myFile.txt");
        File y2 = new File("myFile.txt");
        File z2 = x2;
        System.out.println(x2 == y2); // Resultado false, porque no apuntan a la misma referencia de objeto
        System.out.println(x2 == z2); // Resultado true, porque apuntan a la misma referencia de objeto
    }
}

package java_core.java_core.java_core.chapter_02_operators_and_statements.d03.using_additonal_binary_operators.equality_operators;

import java.io.File;

public class EqualityOperators {
    public static void main(String[] args) {
        //No compilan los siguientes ejemplos porque son de diferentes tipos de datos
        /*boolean x = true == 3; // DOES NOT COMPILE
        boolean y = false != "Giraffe"; // DOES NOT COMPILE
        boolean z = 3 == "Kangaroo"; // DOES NOT COMPILE*/

        boolean y = false;
        boolean x = (y == true);
        System.out.println(x); // Outputs true

        File x2 = new File("myFile.txt");
        File y2 = new File("myFile.txt");
        File z2 = x2;
        System.out.println(x2 == y2); // Outputs false
        System.out.println(x2 == z2); // Outputs true
    }
}

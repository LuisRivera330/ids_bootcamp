package java_core.java_core.java_core.chapter_02_operators_and_statements.d03.using_additonal_binary_operators.relational_operators;

public class RelationalOperators {
    public static void main(String[] args) {
        int x = 10, y = 20, z = 10;
        System.out.println(x < y); // Outputs true
        System.out.println(x <= y); // Outputs true
        System.out.println(x >= z); // Outputs true
        System.out.println(x > z); // Outputs false. Es falso porque a pesar de que sean iguales en valor x no es mayor que z
    }
}

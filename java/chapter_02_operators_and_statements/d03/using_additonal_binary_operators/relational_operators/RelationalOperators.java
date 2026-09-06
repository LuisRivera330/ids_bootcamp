package ids_bootcamp.java.chapter_02_operators_and_statements.d03.using_additonal_binary_operators.relational_operators;

public class RelationalOperators {
    public static void main(String[] args) {
        int x = 10, y = 20, z = 10;
        System.out.println(x < y); // Resultado true, porque x es menor que 10
        System.out.println(x <= y); // Resultado true, proque x es menor e igual que y
        System.out.println(x >= z); // Resultado true, proque x es mayor e igual que z
        System.out.println(x > z); // Resultado false. Es falso porque a pesar de que sean iguales en valor x no es mayor que z
    }
}

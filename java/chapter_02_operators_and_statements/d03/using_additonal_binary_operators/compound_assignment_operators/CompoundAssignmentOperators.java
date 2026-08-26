package ids_bootcamp.java.chapter_02_operators_and_statements.d03.using_additonal_binary_operators.compound_assignment_operators;

public class CompoundAssignmentOperators {
    public static void main(String[] args) {
        int x = 2, z = 3;
        //x = x * z; // Es un operador de asignmación simple que busca multiplicar dos variables y asignrale a la variable x
        x *= z; // Es lo mismo que la anterior línea de código. Pero en este caso solo aplica para variables ya declaradas

        long x2 = 10;
        int y = 5;
        //y = y * x2; // No compila porque el tipo de dato debe ser long
        System.out.println(y *= x2);

        //Primero asigna el valor 3 a x3. Luego ese valor de asignación de x3 lo pasa a y3
        long x3 = 5;
        long y3 = (x3=3);
        System.out.println(x3); // Resultado de "x3" 3
        System.out.println(y3); // Resultado de "y3" 3

    }
}

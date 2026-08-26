package ids_bootcamp.java.chapter_02_operators_and_statements.d03.working_with_unary_operators.logical_complement_and_negation_operators;

public class LogicalComplementAndNegationOperators {
    public static void main(String[] args) {
        //Se declara una variable booleana
        boolean x = false;
        System.out.println(x); //Resultado: false
        x = !x; //Niega el resultado actual por lo tanto el resultado pasa de false a true
        System.out.println(x); //Resultado: true

        //Se declara un tipo de dato double
        double x2 = 1.21;
        System.out.println(x2); //Resultado: 1.21
        //Cambia de signo al valor actual
        x2 = -x2;
        System.out.println(x2); //Resultado: -1.21
        //Vuelve a cambiar de signo al valor actual
        x2 = -x2;
        System.out.println(x2); //Resultado: 1.21

        /*int x3 = !5; // No compila porque no se puede realizar una inversión de un dato número
        boolean y = -true; // No compila porque no se puede negar un boolean
        boolean z = !0; // No compila porque no se puede negar un dato número para una variable de tipo boolean*/
    }
}

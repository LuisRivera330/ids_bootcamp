package java_core.java_core.java_core.chapter_02_operators_and_statements.d03.understanding_java_statements.the_if_then_else_statement;

public class TheIfThenElseStatement {
    public static void main(String[] args) {
        int hourOfDay = 12;

        //La siguiente estructura funciona pero no es eficiente
        if(hourOfDay < 11) {
            System.out.println("Good Morning");
        }
        if(hourOfDay >= 11) {
            System.out.println("Good Afternoon");
        }

        //La siguiente estructura se encuentra más optimizada
        if(hourOfDay < 11) {
            System.out.println("Good Morning");
        } else if(hourOfDay < 15) {
            System.out.println("Good Afternoon");
        } else {
            System.out.println("Good Evening");
        }

        //El siguiente código a pesar de correr. No se encuentra bien estructurado. Porque nunca va llegar a la segunda situación
        if(hourOfDay < 15) {
            System.out.println("Good Afternoon");
        } else if(hourOfDay < 11) {
            System.out.println("Good Morning"); // UNREACHABLE CODE
        } else {
            System.out.println("Good Evening");
        }

        //El siguiente código no compila porque no se evalua como una expresión booleana
        /*int x = 1;
        if(x = 5) { // DOES NOT COMPILE
            //...
        }*/
    }
}

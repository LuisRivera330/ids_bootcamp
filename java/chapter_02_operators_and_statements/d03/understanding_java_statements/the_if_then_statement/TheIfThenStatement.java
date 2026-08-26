package ids_bootcamp.java.chapter_02_operators_and_statements.d03.understanding_java_statements.the_if_then_statement;

public class TheIfThenStatement {
    public static void main(String[] args) {
        //Se declara dos variables de tipo int
        int hourOfDay = 10;
        int morningGreetingCount = 0;
        //Si hourOfDay es menor a 11 se imprime "Good Morning"
        if(hourOfDay < 11)
            System.out.println("Good Morning");
        //En este segundo if se aumenta el valor de morningGreetingCount en una unidad
        if(hourOfDay < 11){
            System.out.println("Good Morning");
            morningGreetingCount++;
            System.out.println(morningGreetingCount);
        }


    }

}

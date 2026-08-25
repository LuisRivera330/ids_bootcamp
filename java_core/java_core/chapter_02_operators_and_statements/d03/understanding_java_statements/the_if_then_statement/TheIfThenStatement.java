package java_core.java_core.java_core.chapter_02_operators_and_statements.d03.understanding_java_statements.the_if_then_statement;

public class TheIfThenStatement {
    public static void main(String[] args) {

        int hourOfDay = 10;
        int morningGreetingCount = 0;

        if(hourOfDay < 11)
            System.out.println("Good Morning");

        if(hourOfDay < 11){
            System.out.println("Good Morning");
            morningGreetingCount++;
            System.out.println(morningGreetingCount);
        }


    }

}

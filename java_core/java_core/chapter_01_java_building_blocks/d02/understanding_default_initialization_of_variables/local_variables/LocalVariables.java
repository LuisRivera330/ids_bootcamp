package java_core.java_core.java_core.chapter_01_java_building_blocks.d02.understanding_default_initialization_of_variables.local_variables;

public class LocalVariables {
    /*public int notValid() {
        int y = 10;
        int x;
        int reply = x + y; // No compila porque se debe inicializar antes de utilizar la variable
        return reply;
        } */

    public int valid() {
        int y = 10;
        int x; // x is declared here
        x = 3; // and initialized here
        int reply = x + y;
        return reply;
    }

    public void findAnswer(boolean check) {
        int answer;
        int onlyOneBranch;
        if (check) {
            onlyOneBranch = 1;
            answer = 1;
        } else {
            answer = 2;
        }
        System.out.println(answer);
       // System.out.println(onlyOneBranch); // No compila porque el valor "onlyOneBranch" puede que no se inicialice
    }
}

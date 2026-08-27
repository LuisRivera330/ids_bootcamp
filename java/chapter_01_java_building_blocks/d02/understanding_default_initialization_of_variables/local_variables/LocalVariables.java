package ids_bootcamp.java.chapter_01_java_building_blocks.d02.understanding_default_initialization_of_variables.local_variables;

public class LocalVariables {
    /*public int notValid() {
        int y = 10;
        int x;
        int reply = x + y; // No compila porque se debe inicializar antes de utilizar la variable
        return reply;
        } */

    //Se crea un método que retorna un valor de tipo int
    public int valid() {
        int y = 10;
        int x; //La variable x se declara
        x = 3; //Se inicializa con un valor 3
        int reply = x + y; //se realiza la operación
        return reply; //Resultado: 13
    }

    //El siguiente ejemplo no es válido porque puede que onlyBranch no inicialice
    public void findAnswer(boolean check) {
        int answer; //La variable answer se declara
        int onlyOneBranch; //De la la variable onlyOneBranch se declara
        if (check) { //Si check es true entra al condicioaal if
            onlyOneBranch = 1;
            answer = 1;
        } else {
            answer = 2;
        }
        System.out.println(answer);
       // System.out.println(onlyOneBranch); // No compila porque el valor "onlyOneBranch" puede que no se inicialice
    }
}

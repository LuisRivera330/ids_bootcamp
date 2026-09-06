package ids_bootcamp.java.chapter_01_java_building_blocks.d02.understanding_variable_scope;

public class Mouse {

    //Variable de clase, porque
    //Pertenece a la clase no al objeto. Porque no se crea una copia por cada objeto
    //Sino que su ciclo de vida es hasta el fin del programa
    static int MAX_LENGTH = 5;

    //Variable de instancia porque pertenece al objeto
    //Es decir se tendrá que crear una instancia para poder utilizarla
    int length;

    //inches y newSize son variables locales porque su ciclo de vida está dentro del método
    public void grow(int inches) {
        if (length < MAX_LENGTH) {
            int newSize = length + inches;
            length = newSize;
        }
    }
}

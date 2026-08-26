package ids_bootcamp.java.chapter_01_java_building_blocks.d02.understanding_variable_scope;

public class Mouse {

    //Variable de clase
    //Pertenece a la clase no al objeto
    static int MAX_LENGTH = 5;
    //Variable de instancia
    //Pertenece al objeto
    int length;

    //inches y newSize variables locales
    //Su ciclo de vida es dentro del método
    public void grow(int inches) {
        if (length < MAX_LENGTH) {
            int newSize = length + inches;
            length = newSize;
        }
    }
}

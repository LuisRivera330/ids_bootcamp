package java_core.java_core.java_core.chapter_01_java_building_blocks.d02.understanding_variable_scope;

public class Mouse {

    //Variable de clase
    static int MAX_LENGTH = 5;
    //Variable de instancia
    int length;

    //inches ay newSize variables locales
    public void grow(int inches) {
        if (length < MAX_LENGTH) {
            int newSize = length + inches;
            length = newSize;
        }
    }
}

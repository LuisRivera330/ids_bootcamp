package ids_bootcamp.java.chapter_01_java_building_blocks.d01.understanding_package_declarations_and_imports.creating_a_new_package.packageb;

//Se importa la clase A
import ids_bootcamp.java.chapter_01_java_building_blocks.d01.understanding_package_declarations_and_imports.creating_a_new_package.packagea.ClassA;

public class ClassB {
    public static void main(String[] args) {
        //Se crea un objeto de la clase "ClassA"
        //Para ello se debe importar
        ClassA a;
        System.out.println("Got it");
    }
}
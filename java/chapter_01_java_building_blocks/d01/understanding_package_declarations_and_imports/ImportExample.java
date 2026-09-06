package ids_bootcamp.java.chapter_01_java_building_blocks.d01.understanding_package_declarations_and_imports;

import java.util.Random; // La palabra import como su mismo nombre lo indica nos ayuda importar la clase Random

public class ImportExample {
    public static void main(String[] args) {
        //Se inicializa una variable de tipo Random
        //Para ello se utiliza import
        Random r = new Random();

        System.out.println(r.nextInt(10)); //Resultado: Números entre 0 y 9
    }
}

package ids_bootcamp.java.chapter_01_java_building_blocks.d01.understanding_package_declarations_and_imports.wildcards;

import java.util.*; // El * nos permite importar todas las clases de la carpeta util. Esto incluye a la clase Random

public class ImportExamples {
    public static void main(String[] args) {
        //Se inicializa una variable de tipo Random
        Random r = new Random();
        //Se imprime valores aleaotorios entre 0 y 9
        System.out.println(r.nextInt(10));
    }
}

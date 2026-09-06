package ids_bootcamp.java.chapter_01_java_building_blocks.d01.understanding_package_declarations_and_imports.redundant_imports;

import java.lang.System;  // Import innecesario, viene automaticamente
import java.lang.*; // Import innecesario, viene automaticamente
import java.util.Random; //
import java.util.*; // Import innecesario, porque ya tenemos import java.util.Random
//Se puede utilizar import java.util.Random; que importa únicamente la clase Random o import java.util.*; que importa otras clases también
public class ImportExample {
    public static void main(String[] args) {
        //Se inicializa una variable de tipo Random
        //Para ello hace el utiliza import
        Random r = new Random();
        System.out.println(r.nextInt(10)); //Resultado: Números entre 0 y 9
    }
}

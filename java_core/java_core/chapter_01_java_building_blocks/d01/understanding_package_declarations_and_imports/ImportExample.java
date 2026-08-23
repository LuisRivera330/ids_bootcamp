package java_core.java_core.java_core.chapter_01_java_building_blocks.d01.understanding_package_declarations_and_imports;

import java.util.Random; // import tells us where to find Random

public class ImportExample {
    public static void main(String[] args) {
        Random r = new Random();
        System.out.println(r.nextInt(2)); // print a number between 0 and 9
    }
}

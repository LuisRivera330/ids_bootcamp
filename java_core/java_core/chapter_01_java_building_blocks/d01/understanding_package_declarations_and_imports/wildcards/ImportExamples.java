package java_core.java_core.java_core.chapter_01_java_building_blocks.d01.understanding_package_declarations_and_imports.wildcards;

import java.util.*; // imports java.util.Random among other things

public class ImportExamples {
    public static void main(String[] args) {
        Random r = new Random();
        System.out.println(r.nextInt(10));
    }
}

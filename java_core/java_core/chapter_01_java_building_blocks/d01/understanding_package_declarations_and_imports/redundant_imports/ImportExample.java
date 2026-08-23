package java_core.java_core.java_core.chapter_01_java_building_blocks.d01.understanding_package_declarations_and_imports.redundant_imports;

import java.lang.System;  // Import innecesario, viene automaticamente
import java.lang.*; // Import innecesario, viene automaticamente
import java.util.Random; //
import java.util.*; // Import innecesario, porque ya tenemos import java.util.Random
public class ImportExample {
    public static void main(String[] args) {
        Random r = new Random();
        System.out.println(r.nextInt(10));
    }
}

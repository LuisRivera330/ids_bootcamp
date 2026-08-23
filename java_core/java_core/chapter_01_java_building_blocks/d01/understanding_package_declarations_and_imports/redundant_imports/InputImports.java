package java_core.java_core.java_core.chapter_01_java_building_blocks.d01.understanding_package_declarations_and_imports.redundant_imports;

import java.nio.file.*; // Se puede utilizar el siguiente import para ocupar ambos casos

import java.nio.file.Files;
import java.nio.file.Paths;

/* Casos que no se deben considerar:
import java.nio.*; // a wildcard only matches class names, not "file.*Files"
import java.nio.*.*; //  you can only have one wildcard and it must be at the end
import java.nio.files.Paths.*; //  you cannot import methods only class names
 */
public class InputImports {
    public void read(Files files) {
        Paths.get("name");
    }
}

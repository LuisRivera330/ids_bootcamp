package ids_bootcamp.java.chapter_01_java_building_blocks.d01.understanding_package_declarations_and_imports.redundant_imports;

import java.nio.file.*; // Se puede utilizar el siguiente import para ocupar ambos casos

import java.nio.file.Files;
import java.nio.file.Paths;

/* Casos que no se deben considerar:
import java.nio.*; //No funciona. Solo se importa clases
import java.nio.*.*; //  Solo se puede utilizar * una vez y siempre es al final
import java.nio.files.Paths.*; //  No puedes importar métodos solo clases
 */
public class InputImports {
    public void read(Files files) {
        Paths.get("name");
    }
}

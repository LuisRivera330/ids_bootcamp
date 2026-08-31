package ids_bootcamp.java.chapter_04_methods_and_encapsulation.d08.applying_access_modifiers.static_imports;

import java.util.Arrays;
import java.util.List;
// Importación estática.
//Esto significa que cada vez que hagamos referencia a 'asList' en la clase, se llamará a 'Arrays.asList()'.


//Las importaciones regulares se utilizan para importar clases.
//Las importaciones estáticas se utilizan para importar miembros estáticos de las clases.
public class Imports {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("one", "two");
    }
}

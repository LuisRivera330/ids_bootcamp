package ids_bootcamp.java.chapter_04_methods_and_encapsulation.d08.applying_access_modifiers.static_imports;

//import static java.util.Arrays; // No compila porque, se intenta usar una importación estática para importar una clase. Las importaciones estáticas
//solo sirven para importar miembros estáticos.

//static  java.util.Arrays.*; // No compila porque hay un error de sintaxis. La sintaxis correcta es import static

//import static statics.A.TYPE;
//import static statics.B.TYPE; // No compila porque se trata de importar miembros estáticos con el mismo nombre

public class BadStaticImports {
    public static void main(String[] args) {
        //Arrays.asList("one"); // No compila porque importamos el método `asList` no importamos la clase `Arrays`
        //Es decir, es correcto escribir asList("one") no Arrays.asList("one")
    }
}
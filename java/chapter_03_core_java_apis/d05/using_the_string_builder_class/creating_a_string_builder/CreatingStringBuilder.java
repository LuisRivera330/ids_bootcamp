package java_core.java_core.java_core.chapter_03_core_java_apis.d05.using_the_string_builder_class.creating_a_string_builder;

public class CreatingStringBuilder {
    //Crea un StringBuilder con una secuencia vacía de caracteres y que se asigne a sb1
    StringBuilder sb1 = new StringBuilder();
    //Crea un StringBuilder con un valor específico y que se asigne a sb2 para que apunte a él
    StringBuilder sb2 = new StringBuilder("animal");
    //indica a Java que tenemos una idea aproximada del tamaño del valor final
    // y que deseamos que el StringBuilder reserve un número determinado de espacios para caracteres.
    StringBuilder sb3 = new StringBuilder(10);
}

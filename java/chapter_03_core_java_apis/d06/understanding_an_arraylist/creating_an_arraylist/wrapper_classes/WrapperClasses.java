package ids_bootcamp.java.chapter_03_core_java_apis.d06.understanding_an_arraylist.creating_an_arraylist.wrapper_classes;

public class WrapperClasses {
    public static void main(String[] args) {
        //Convierte una cadena de texto (String) a un tipo primitivo `int`
        int primitive = Integer.parseInt("123");
        //Convierte una cadena de texto a una clase contenedora `Integer`
        //Ojo: Si la cadena de texto pasada no es válida para el tipo especificado, Java lanza una excepción
        Integer wrapper = Integer.valueOf("123");
    }

}

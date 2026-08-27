package ids_bootcamp.java.chapter_01_java_building_blocks.d01.distinguishing_between_object_references_and_primitives.reference_types;

public class References {
    //Son tipos de datos de referencia. Porque apuntan a un objeto.
    //A diferencia de los tipos primitivos, que almacenan sus valores en la memoria donde se asigna la variable
    java.util.Date today;
    String greeting;

    public static void main(String[] args) {
        References r = new References();
        //Se le deb asignar a datos de su mismo tipo
        //Ejemplo: today con un dato de tipo date
        //y greeting con un tipo de dato stringz
        r.today = new java.util.Date();
        r.greeting = "Hola Mundo";
    }
}

package java_core.java_core.java_core.chapter_03_core_java_apis.creating_and_manipulating_strings;

public class CreatingAndManipulatingStrings {
    public static void main(String[] args) {

        //Un String es una secuencia de caracteres
        String name = "Fluffy";

        //Aunque ambas parezcan igual tienen una sutil diferencia
        //La primera busca la palabra "Fluffy" dentro de la memoria heap
        String name2 = "Fluffy";
        //Al usar el operador new ordena explicitamente a Java que cree un objeto en la memoria heap
        String name3 = new String("Fluffy");
    }
}

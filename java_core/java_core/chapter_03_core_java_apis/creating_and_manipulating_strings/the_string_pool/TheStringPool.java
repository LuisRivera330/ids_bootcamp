package java_core.java_core.java_core.chapter_03_core_java_apis.creating_and_manipulating_strings.the_string_pool;

public class TheStringPool {
    public static void main(String[] args) {
        //El primero indica que se use string pool
        String name = "Fluffy";
        //El segundo indica crea un objeto aunque sea menos eficiente
        String name2 = new String("Fluffy");
    }
}

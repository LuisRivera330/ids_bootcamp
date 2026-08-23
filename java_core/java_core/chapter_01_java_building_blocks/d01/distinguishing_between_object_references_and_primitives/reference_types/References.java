package java_core.java_core.java_core.chapter_01_java_building_blocks.d01.distinguishing_between_object_references_and_primitives.reference_types;

public class References {
    java.util.Date today;
    String greeting;

    public static void main(String[] args) {
        References r = new References();
        r.today = new java.util.Date();
        r.greeting = "Hola Mundo";
    }
}

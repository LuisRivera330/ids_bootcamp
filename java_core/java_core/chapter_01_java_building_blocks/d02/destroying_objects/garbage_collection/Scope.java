package java_core.java_core.java_core.chapter_01_java_building_blocks.d02.destroying_objects.garbage_collection;

public class Scope {
    public static void main(String[] args) {
        String one, two;
        one = new String("a");
        two = new String("b");
        one = two;
        String three = one;
        one = null;
    }
}

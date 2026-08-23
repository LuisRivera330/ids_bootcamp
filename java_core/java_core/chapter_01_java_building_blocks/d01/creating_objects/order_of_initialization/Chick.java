package java_core.java_core.java_core.chapter_01_java_building_blocks.d01.creating_objects.order_of_initialization;

public class Chick {
    private String name = "Fluffy";
    {
        System.out.println("setting field");
    }
    public Chick() {
        name = "Tiny";
        System.out.println("setting constructor");
    }
public static void main(String[] args) {
        Chick chick = new Chick();
        System.out.println(chick.name);
    }
}

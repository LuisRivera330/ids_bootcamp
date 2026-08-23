package java_core.java_core.java_core.chapter_01_java_building_blocks.d01.creating_objects.order_of_initialization;

public class Egg {
    public Egg() {
        number = 5;
    }
    public static void main(String[] args) {
        Egg egg = new Egg();
        System.out.println(egg.number);
    }
    private int number = 3;
    {
        number = 4;
    }
    //Imprimir 5
}


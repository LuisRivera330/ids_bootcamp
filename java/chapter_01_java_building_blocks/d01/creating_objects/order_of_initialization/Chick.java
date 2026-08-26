package ids_bootcamp.java.chapter_01_java_building_blocks.d01.creating_objects.order_of_initialization;

public class Chick {
    //Se inicializa el atributo name con valor "Fluffy"
    private String name = "Fluffy";
    {
        System.out.println("setting field");
    }
    //Se crea el constructor
    //Recordar que siempre el constructor se va ejecutar al final
    public Chick() {
        //Se reasigna un nuevo valor a name
        name = "Tiny";
        //Se coloca el print para mostrar el seguimiento del resultado
        System.out.println("setting constructor");
    }
public static void main(String[] args) {
        //Se crea un objeto de tipo Chick
        Chick chick = new Chick();
        //Se imprime el atributo name
        System.out.println(chick.name);
    }
}

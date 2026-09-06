package ids_bootcamp.java.chapter_01_java_building_blocks.d01.creating_objects.order_of_initialization;

public class Egg {
    //En el constructor se inicializa number con valor de 5. Siempre se va ejecutar al final
    //El orden de ejecución si importa en los atributos y métodos
    //no el contructor
    public Egg() {
        number = 5;
    }
    public static void main(String[] args) {
        //Se crea un objeto de tipo egg
        Egg egg = new Egg();
        //Se imprime el atributo number
        System.out.println(egg.number);
    }
    private int number = 3;
    {
        number = 4;
    }
    //Resultado: 5
}


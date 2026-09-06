package ids_bootcamp.java.chapter_01_java_building_blocks.d02.destroying_objects.garbage_collection;

public class Scope {
    public static void main(String[] args) {
        //Se declara la variable one and two
        String one, two;
        //one inicializa su valor con "a"
        one = new String("a");
        //two inicializa su valor con "b"
        two = new String("b");
        //one ahora apunta a la referencia de two
        one = two;
        //Se crea la variable three que inicializa con one, que a su vez está con two
        String three = one;
        //Se declara a one como nulo
        //"a" sea elegible para recolección de basura
        one = null;
        //Java propociona el siguiente método para la recolección de basura
        //No porque se ejecute el siguiente comando va recolectar la basura
        //Solo brinda una sugerencia
        //System.gc();
    }
}

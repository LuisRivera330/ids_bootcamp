package ids_bootcamp.java.chapter_04_methods_and_encapsulation.d09.creating_constructors.order_of_initialization;

public class YetMoreInitializationOrder {
    //Se aplica la regla número 2 porque la primera no comple, no hay una super clase
    //Se imprime el bloques estáticos add(2) que imprime el valor de 2
    //Luego, se llama el bloque estático add(4) que imprime el valor de 4
    //Después, el bloque estático new YetMoreInitializationOrder() llama al constructor (pasa al último)
    //Continuamos con la regla número 3, es decir examinar las variables e inicializadores de instancia. add(6) y add(8)
    //Finalmente, la regla número 4. El cual es llamar al constructor. Imprime 5
    static { add(2); }
    static void add(int num) { System.out.print(num + " "); }
    YetMoreInitializationOrder() { add(5); }
    static { add(4); }
    { add(6); }
    static { new YetMoreInitializationOrder(); }
    { add(8); }
    public static void main(String[] args) { }
    //Resultado:2 4 6 8 5
}

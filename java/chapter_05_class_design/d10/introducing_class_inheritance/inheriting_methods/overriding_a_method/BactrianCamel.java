package ids_bootcamp.java.chapter_05_class_design.d10.introducing_class_inheritance.inheriting_methods.overriding_a_method;

public class BactrianCamel extends Camel {
    // No compila porque, en primer lugar viola la segunda regla de sobreescritura de métodos:
    // el método hijo debe ser al menos tan accesible como el padre
    //En el ejemplo el método padre utiliza el modificador protected. En cambio, el hijo está en private
    //El otro motivo es que el tipo de retorno del padre (String) es diferente al del hijo(int)
    /*private int getNumberOfHumps() {
        return 2;
    }*/
}

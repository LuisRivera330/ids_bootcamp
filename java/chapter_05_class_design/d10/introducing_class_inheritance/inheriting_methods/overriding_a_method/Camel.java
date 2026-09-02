package ids_bootcamp.java.chapter_05_class_design.d10.introducing_class_inheritance.inheriting_methods.overriding_a_method;
//Se crea la clase Camel
//Dentro se define el método getNumberOfHumps que retorna un valor de String.
//Su tipo de acceso es protected. Es decir solo pueden acceder a él clases heredadas y que esten en el mismo paquete
public class Camel {
    protected String getNumberOfHumps() {
        return "Undefined";
    }
}
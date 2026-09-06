package ids_bootcamp.java.chapter_05_class_design.d10.introducing_class_inheritance.inheriting_methods.overriding_a_method.wrong_overriding_a_method;

public class Snake extends Reptile {

    //No compila porque, el método hijo getHeight() lanza un Exception, la cual no es una subclase de InsufficientDataException

    /*protected double getHeight() throws Exception {
        return 2;
    }*/

    //No compila porque, en el método padre getLength() no lanza una excepcion y en este sí. Por lo tanto se viola la tercera regla
    /*protected int getLength() throws InsufficientDataException {
        return 10;
    }*/
}

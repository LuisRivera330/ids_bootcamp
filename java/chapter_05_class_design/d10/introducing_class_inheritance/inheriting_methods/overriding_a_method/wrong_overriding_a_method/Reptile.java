package ids_bootcamp.java.chapter_05_class_design.d10.introducing_class_inheritance.inheriting_methods.overriding_a_method.wrong_overriding_a_method;

public class Reptile {
    //El método hasLegs() lanza una excepción InsufficientDataException
    protected double getHeight() throws InsufficientDataException {
        return 2;
    }
    //El método getLength() no lanza una excepción en la clase padre
    protected int getLength() {
        return 10;
    }
}

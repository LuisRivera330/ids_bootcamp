package ids_bootcamp.java.chapter_05_class_design.d10.introducing_class_inheritance.inheriting_methods.overriding_a_method;

//Se crea la clase padre Reptile
public class Reptile {
    //El método hasLegs() lanza una excepción InsufficientDataException
    protected boolean hasLegs() throws InsufficientDataException {
        throw new InsufficientDataException();
    }
    //El método getWeight() lanza una excepción en la clase padre Exception
    protected double getWeight() throws Exception {
        return 2;
    }
}
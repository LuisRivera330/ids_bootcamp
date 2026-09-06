package ids_bootcamp.java.chapter_05_class_design.d10.introducing_class_inheritance.inheriting_methods.overriding_a_method;

//La clase Snake hereda de Reptile
public class Snake extends Reptile {
    //No lanza una excepción InsufficientDataException
    //Compila con normalidad ya que, no infringe la tercera regla de sobreescritura de métodos
    //es decir se define ninguna excepción nueva
    protected boolean hasLegs() {
        return false;
    }
    //En el método hijo lanza un InsufficientDataException
    //No genera ningún error de compilación, ya que InsufficientDataException es una subclase de Exception
    protected double getWeight() throws InsufficientDataException{
        return 2;
    }
}

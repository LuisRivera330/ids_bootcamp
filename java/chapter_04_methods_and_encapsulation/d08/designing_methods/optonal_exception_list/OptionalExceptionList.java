package ids_bootcamp.java.chapter_04_methods_and_encapsulation.d08.designing_methods.optonal_exception_list;

public class OptionalExceptionList {

    //En Java, el código puede indicar que algo salió mal lanzando una excepción.
    //Es importante mencionar que que las excepciones son opcionales.
    //Asismimo, se puede enumerar varios tipos de excepciones
    public void zeroExceptions() { } //Método sin excepciones
    public void oneException() throws IllegalArgumentException { } //Método con una excepción
    public void twoExceptions() throws IllegalArgumentException, InterruptedException { } //Método con dos excepciones
}

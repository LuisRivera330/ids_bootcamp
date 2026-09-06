package ids_bootcamp.java.chapter_06_exceptions.d14.calling_methods_that_throw_exceptions;

class NoMoreCarrotsException extends Exception {}
public class Bunny {
    //Se declara la excepción en el método main
    public static void main(String[] args) throws NoMoreCarrotsException {
        eatCarrot(); //Con compila porque NoMoreCarrotsException es una excepción verificada. Por lo tanto, debe ser manejada o declarada

        /*try {
            eatCarrot();
        } catch (NoMoreCarrotsException e ) {// Se maneja la excepción con un bloque try/catch
            System.out.print("sad rabbit");
        }*/



    }
    //Se declara la función eatCarrot(), la cual puede lanzar la excepción de NoMoreCarrotsException
    /*private static void eatCarrot() throws NoMoreCarrotsException{

    }*/

    /*public void bad() {
        try {
            eatCarrot();
        } catch (NoMoreCarrotsException e ) {// No compila, ya que eatCarrot() nunca lanza la excepción NoMoreCarrotsException por lo tanto, nunca se llega el bloque catch.
            System.out.print("sad rabbit");
        }
    }*/

    //Se declara el método good(). Y a diferencia del bloque try/cach. En este método indica que si ocurre la excepción NoMoreCarrotsException
    // se va manejar el método que lo llame
    public void good() throws NoMoreCarrotsException {
        eatCarrot();
    }

    //El nuevo método eatCarrot no declara una excepción verificada
    private static void eatCarrot() { }


}

package ids_bootcamp.java.chapter_06_exceptions.d13.understanding_exceptions.throwing_an_exception;

public class ThrowingAnException {
    public static void main(String[] args) {
        //Se crea un Array con elementos de tipo String. Su longitud del String es 0
        String[] animals = new String[1];
        //Se trata de imprimir el primer elemento de array. Pero, como su longitud es de 0
        //Imprime un error: Index 0 out of bounds for length 0
        System.out.println(animals[0]);

        //Se pueden lanzar excepciones explícitamente
        //Se puede lanzar con un mensaje
        //throw new Exception();
        //throw new Exception("¡Ay! Me caí.");
        throw new RuntimeException();
        //throw new RuntimeException("¡Ay! Me caí.");
    }
}

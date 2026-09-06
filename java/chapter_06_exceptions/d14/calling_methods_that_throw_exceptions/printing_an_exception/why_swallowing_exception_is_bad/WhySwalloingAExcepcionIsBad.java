package ids_bootcamp.java.chapter_06_exceptions.d14.calling_methods_that_throw_exceptions.printing_an_exception.why_swallowing_exception_is_bad;

import java.io.IOException;

public class WhySwalloingAExcepcionIsBad {
    public static void main(String[] args) {
        //Se crea la variable textInFile con un valor inicial nulo
        //Luego, se invoca al método readInFile en el bloque try
        //Se lanza la excepción y se maneja en en bloque catch
        //Dentro de la estructura catch se ignora la excepción
        //Aunque Java no proporciona información sobre la IOException
        //ya que si bien se manejó de forma deficiente, se manejó.
        //No es una solución eficiente. La mejor opción era lanzar directamente la IOException
        String textInFile = null;
        try {
            readInFile();
        } catch (IOException e) {
        }

        System.out.println(textInFile.replace(" ", ""));
    }

    //Se crea el método readInFile(), el cual lanza una excepción verificada IOException()
    private static void readInFile() throws IOException {
        throw new IOException();
    }
}

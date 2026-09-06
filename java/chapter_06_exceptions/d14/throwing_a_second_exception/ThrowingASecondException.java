package ids_bootcamp.java.chapter_06_exceptions.d14.throwing_a_second_exception;

import java.io.FileReader;
import java.io.IOException;

public class ThrowingASecondException {
    public static void main(String[] args) {
        //En el método main se declara una serie de instrucciones.
        //Se crea un objeto de tipo FileReader con un valor inicial de null
        FileReader reader = null;
        //Se ejecuta un bloque try/catch
        //Situaciones:
        //El método read no lanza ninguna excepción. Se ejecuta solo el bloque try. Catch se omite
        //El método read lanza una excepción NullPointerException. La estructura catch no maneja el error ya que, no es un error tipo IOException
        //El método read lanza una excepción IOException. La estructura catch atrapa el error. Dentro de este último se crea un nuevo try/cach
            //La estructura try trata de cerrar el documento. Si todo sale bien, El sistema continua su proceso
            //Caso contrario, Java busca más bloques catch. Si no encuentra. Lanza una excepción al método main
        /*try {
            reader = read();
        } catch (IOException e) {
            try {
                if (reader != null) reader.close();
            } catch (IOException inner) {
            }
        }

        private static FileReader read() throws IOException {
            //codigo aqui
        }*/


        //Se crea un bloque try/catach
        //1. Dentro de try se lanza una excepción
        //2. El bloque catch atrapa esa excepción y vuelve a lanzar una nueva excepción
        //3. Finalmente, se ejecuta el bloque finally, la cual lanza una nueva excepción. Enmascarando a la excepción de catch
        /*try {
            throw new RuntimeException();
        } catch (RuntimeException e) {
            throw new RuntimeException();
        } finally {
            throw new Exception();
        }*/


        //1. Se crea el método exceptions. Devuelve un valor de tipo String
        //2. Se declara dos variables de tipo String: Result inicializada con un valor igual a una cadena vacía. y String con un valor null
        //3. Se crea una estructura try/catch.
        //4. Dentro de try. Se agrega a la variable result el valor de "before". Luego, aparece un error por querer obtener la longitud de un valor null
        //5. Este error es atrapado en la estructura catch. Dentro se agrega a la cadena result el valor de "catch". Luego, se vuelve a lanzar una excepción RuntimeException
        //6. Después, se ejecuta el bloque de finally. Se agrega dentro de este bloque a result el valor de "finally" y se vuelve a lanzar una nueva excepción
        //7. Esta excepción es capturado por el catch de más afuera. Se agrega un nuevo valor a result "done".
        //8. Finalmente, se retorna result.
        //Resultado: before catch finally done
        /*public String exceptions() {
            String result = "";
            String v = null;
            try {
                try {
                    result += "before";
                    v.length();
                    result += "after";
                } catch (NullPointerException e) {
                    result += "catch";
                    throw new RuntimeException();
                } finally {
                    result += "finally";
                    throw new Exception();
                }
            } catch (Exception e) {
                result += "done";
            }
            return result;
        }*/
    }



}


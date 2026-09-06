package ids_bootcamp.java.chapter_06_exceptions.d14.recognizing_common_exception_types.error;

public class Error {
    //Los errores extienden la clase Error. No deben ser manejados ni declarados

    //ExceptionInInitializerError:
    //La primera vez que se usa una clase Java corre los inicializadores estáticos. Si uno de los estáticos lanza una excepción
    //Java no puede utilizar la clase. Lanza la excepción de ExceptionInInitializerError

    //Java lanza el error de java.lang.ExceptionInInitializerError y el motivo java.lang.ArrayIndexOutOfBoundsException: Index -1 out of bounds for length 3
    //ya que, se está tratando de acceder a un elemento de la lista con valor negativo
    /*static {
        int[] countsOfMoose = new int[3];
        int num = countsOfMoose[-1];
    }*/

    public static void main(String[] args) {
        //doNotCodeThis(5);
    }

    //StackOverflowError:
    //Ocurre cuando un método se llama infinitamente
    //Excepción lanzada: Exception in thread "main" java.lang.StackOverflowError
    public static void doNotCodeThis(int num) {
        doNotCodeThis(1);
    }

    //NoClassDefFoundError:
    //Ocurre cuando Java no puede encontrar la clase al momento de ejecutar
}

package ids_bootcamp.java.chapter_06_exceptions.d13.understanding_exceptions.the_role_of_exceptions;

public class Zoo {
    //Se crea el método main, con String[] args, donde se envía los argumentos que deben ser colocados en consola
    public static void main(String[] args) {
        //Se imprime el primer y segundo argumento
        System.out.println(args[0]);
        System.out.println(args[1]);
        //Como solo se llegó a pasar un argumento "Zoo"
        //La línea 9 mostrará un error de ejecución. El cual es: java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1
    }
}

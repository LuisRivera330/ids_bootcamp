package ids_bootcamp.java.chapter_06_exceptions.d14.recognizing_common_exception_types.runtime_exceptions;

public class RuntimeExceptions {
    public static void main(String[] args) {
        //ArithmeticException: La JVM intenta dividir un entero entre cero produce un resultado indefinido.
        //int answer = 11 / 0; //Da como resultado Exception in thread "main" java.lang.ArithmeticException: / by zero. Ya que, no se puede dividir entre 0


        //ArrayIndexOutOfBoundsException: Los índices de los arrays empiezan en 0 y llegan hasta 1 menos que la longitud del array.
        //No existen índices negativos.
        //int[] countsOfMoose = new int[3];
        //System.out.println(countsOfMoose[-1]); //Resultado: java.lang.ArrayIndexOutOfBoundsException: Index -1 out of bounds for length 3

        //El problema en este ejercicio es el <=
        //ya que al momento de analizar cada elemento del array. Este sobrepasa la longitud.
        //Si bien la longitud del array es de 3. Su índice máximo es de 2
        //Resultado: java.lang.ArrayIndexOutOfBoundsException: Index 3 out of bounds for length 3
        /*int total = 0;
        int[] countsOfMoose = new int[3];
        for (int i = 0; i <= countsOfMoose.length; i++)
            total += countsOfMoose[i];*/

        //ClassCastException: Java intenta protegerte de conversiones de tipo imposibles
        //No compila porque Integer no es una subclase de String
        /*String type = "123";
        Integer number = (Integer) type;*/

        //Lanza un error en tiempo de ejecución.
        //java.lang.ClassCastException: class java.lang.String cannot be cast to class java.lang.Integer
        /*String type = "moose";
        Object obj = type;
        Integer number = (Integer) obj;*/


        //IllegalArgumentException: Se genera cuando se ha pasado un argumento no válido o inapropiado
        //El siguiente método setter es un extracto de la clase Swan. En este caso todo está correcto
        //Pero se puede mejorar, indicandole al usuario colocar un dato válido
        /*public void setNumberEggs(int numberEggs) {
            if (numberEggs >= 0)
                this.numberEggs = numberEggs;
        }*/

        //En este nuevo bloque de código se evalua si numberEggs es menor a cero. Si lo es se lanza una excepción
        //el cual indica que #huevos no puede ser negativo
        /*public static void setNumberEggs(int numberEggs) {
            if (numberEggs < 0)
                throw new IllegalArgumentException(
                        "# eggs must not be negative");
            this.numberEggs = numberEggs;
        }*/

        //NullPointerException: Hay una referencia nula donde se requiere un objeto.
        //Lanza un error de NullPointerException porque, se trata de utilizar el método length de una referencia nula
        /*String name;
        public void printLength() throws NullPointerException {
            System.out.println(name.length());
        }*/

        //NumberFormatException: Java proporciona métodos para convertir cadenas de texto a números.
        // Cuando se les pasa un valor no válido, lanzan una excepción NumberFormatException.

        Integer.parseInt("abc"); //Aparece un error de ejecución ya que, el string que se trata de convertir a Integer no es válido
        //java.lang.NumberFormatException: For input string: "abc"






    }



}

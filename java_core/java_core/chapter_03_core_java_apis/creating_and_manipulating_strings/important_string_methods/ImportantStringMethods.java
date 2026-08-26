package java_core.java_core.java_core.chapter_03_core_java_apis.creating_and_manipulating_strings.important_string_methods;

public class ImportantStringMethods {


    public static void main(String[] args) {
        //Length()
        //Se declara la variable string
        String string = "animals";
        //En el print se realiza la longitud del string, el cual es 7
        System.out.println(string.length());

        //charAt()
        //La función charAt() nos manda el caracter específico de la ubicación enviada
        System.out.println(string.charAt(0)); // Resultado: a
        System.out.println(string.charAt(6)); // Resultado: s
        // Lanza una excepción ya que si bien la longitud de la palabra es 7. La última letra esta ubicada en la posición 6 (inicia desde 0)
        //System.out.println(string.charAt(7));

        //indexOf()
        //El método index examina los caracteres de la cadena y encuentra la primera coincidencia
        //Puede comenzar desde una posición específica y puede trabajar con una cadena

        //El índice comienz desde cero, la primera 'a' coincide con esa posición
        System.out.println(string.indexOf('a')); // 0
        //Busca una subcadena más específica por eso aparece más adelante
        System.out.println(string.indexOf("al")); // 4
        //Indica que no debe buscar el caracter hasta llegar al índica 4
        System.out.println(string.indexOf('a', 4)); // 4
        //Indica que no debe buscar el caracter hasta llegar al indice 5. En este caso como no lo encuentra su valor es -1
        System.out.println(string.indexOf("al", 5)); // -1

        //substring()
        //Devuelve partes de la cadena
        //Firmas de los métodos
        //int substring(int beginIndex)
        //int substring(int beginIndex, int endIndex)

        //animals
        //El primer parámetro es el índice de inicio de la cadena devuelta
        System.out.println(string.substring(3)); // mals
        //Se utiliza la función indexOf que permite encontrar la letra m y desde ahí considerar la subcadena
        System.out.println(string.substring(string.indexOf('m'))); // mals
        //Inicia desde la ubicación 3 hasta el 4. No considera este último
        System.out.println(string.substring(3, 4)); // m
        //Inicia desde la ubicación 3 hasta el 7. Considera todo
        System.out.println(string.substring(3, 7)); // mals

        //Imprime un empty porque se comienza en la posición 3 y se termina en la misma, el final no se considera por lo tanto es vacío
        //System.out.println(string.substring(3, 3)); // Resultado: empty string
        //Lanza una excepción no se puede colocar índices invertidos
        //System.out.println(string.substring(3, 2)); // Resultado: throws exception
        //Lanza una excepción porque no existe posición 8. Tampoco existe la ubicación 7 pero como no se considera, toma hasta el final
        //System.out.println(string.substring(3, 8)); // throws exception

        //toLowerCase() and toUpperCase()
        //Firma de métodos
        //String toLowerCase(String str)
        //String toUpperCase(String str)

        //toUpperCase convierte el String a mayúscula
        System.out.println(string.toUpperCase()); // Resultado: ANIMALS
        //toLowerCase convierte cualquier caracter de mayúscula a minúscula
        System.out.println("Abc123".toLowerCase()); // Resultado: abc123

        //equals() and equalsIgnoreCase()
        //boolean equals(String str)
        //boolean equalsIgnoreCase(String str)

        //Al comparar ambos string evalua también si están en mayúscula o mínuscula. En este caso a pesar de tener los mismos caracteres no se considera
        System.out.println("abc".equals("ABC")); //Resultado: false
        //En este caso el resultado es true, porque ambos strings son identicos
        System.out.println("ABC".equals("ABC")); //Resultado: true
        //Como su nombre lo indica ignora el case. Esto quiere decir que no importa si está en mayúscula o minúscula ambos tiene los mismos caracteres
        System.out.println("abc".equalsIgnoreCase("ABC")); //Resultado: true


        //startsWith() and endsWith()
        //boolean startsWith(String prefix)
        //boolean endsWith(String suffix)
        //En este caso el primero es true porque comienza con el caracter 'a' además está en minúscula
        System.out.println("abc".startsWith("a")); //Resultado: true
        //El segundo es false porque la letra que se escribe está con mayúscula
        System.out.println("abc".startsWith("A")); //Resultado: false
        //El resultado es true porque termina con la letra indicada, además está en mínúscula
        System.out.println("abc".endsWith("c")); //Resultado: true
        //El resultado es false porque termina con la letra c y se está buscando la letra a
        System.out.println("abc".endsWith("a")); //Resultado: false


        //contains()
        //Es true porque si encuentra coincidencia con la palabra que busca. Además está en minúscula
        System.out.println("abc".contains("b")); //Resultado: true
        //Es false porque a pesar de tener la letra 'b', esta última se encuentra en minúscula
        System.out.println("abc".contains("B")); //Resultado: false


        //replace()
        //Firma de los métodos
        //String replace(char oldChar, char newChar)
        //String replace(CharSequence oldChar, CharSequence newChar)
        //Reemplaza la letra 'a' minúscula por la letra 'A' mayúscula
        System.out.println("abcabc".replace('a', 'A')); //Resultado: AbcAbc
        //Reemplaza la letra 'a' minúscula por la cadena "AC" mayúscula
        System.out.println("abcabc".replace("a", "AC")); //Resultado: ACbcACbc


        //trim()
        //El primer ejemplo no elimina nada porque no hay espacios ni al inicio ni al final
        System.out.println("abc".trim()); // abc
        //El segundo ejemplo elimina la tabulación del inicio y el salto del último. Deja
        //el espacio entre cada letra
        System.out.println("\t a b c\n".trim()); // a b c

    }

}

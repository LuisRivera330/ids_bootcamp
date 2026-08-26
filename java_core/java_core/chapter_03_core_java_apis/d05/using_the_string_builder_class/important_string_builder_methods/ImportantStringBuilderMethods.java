package java_core.java_core.java_core.chapter_03_core_java_apis.d05.using_the_string_builder_class.important_string_builder_methods;

public class ImportantStringBuilderMethods {
    public static void main(String[] args) {
        //Primero se crea un objeto de tipo StringBuilder. Con un valor inicial de "animals"
        StringBuilder sb = new StringBuilder("animals");
        //Se crea una variable de tipo string. Se utiliza el método substring para obtener una subcadena
        //va a partir de 'a' hasta 'al', este último no se considera
        String sub = sb.substring(sb.indexOf("a"), sb.indexOf("al"));
        //En la variable len se almacena la longitud de la cadena
        int len = sb.length();
        //Con el método charAt se obtiene el caracter en la ubicación 6 's'
        char ch = sb.charAt(6);
        //Se imprime el resultado de los métodos
        System.out.println(sub + " " + len + " " + ch); //Resultado: anim 7 s

        //append()
        //Firma del método
        //StringBuilder append(String str)
        //El método append permite agregar cualquier tipo de dato
        //Primerio es un número 1
        //Luego un chart c
        //Luego una cadena -
        //Finalmente un tipo booleano
        StringBuilder sb2 = new StringBuilder().append(1).append('c');
        sb2.append("-").append(true);
        System.out.println(sb2); //Resultado: 1c-true


        //insert()
        //Firma del método
        //StringBuilder insert(int offset, String str)
        StringBuilder sb3 = new StringBuilder("animals");
        //Se agrega un "-" en la cadena. Especificamente al final
        sb3.insert(7, "-"); // sb = animals-
        //Se agrega un "-" pero esta vez al inicio
        sb3.insert(0, "-"); // sb = -animals-
        //Se agrega un "-" entre la i y la m, ya que al añadir el anterior caracter cambio de longitud
        sb3.insert(4, "-"); // sb = -ani-mals
        System.out.println(sb3);

        //delete() and deleteCharAt()
        //Firmas de los métodos
        //StringBuilder delete(int start, int end)
        //StringBuilder deleteCharAt(int index)

        StringBuilder sb4 = new StringBuilder("abcdef");
        //Eliminamos los caracteres desde el indice 1 hasta el 3(no considera el último).
        sb4.delete(1, 3); // sb = adef
        //Como solo hay ahora 4 caracteres. Se lanza un error
        //sb4.deleteCharAt(5); // throws an exception


        //reverse()
        //Firma del método
        //StringBuilder reverse()
        StringBuilder sb5 = new StringBuilder("ABC");
        //Como su mismo nombre lo indica coloca al reves los caracteres de la cadena
        sb5.reverse();
        System.out.println(sb5);//Resultado: CBA


        //toString()
        //Firma del método
        //String toString()
        //Convierte un StringBuilder en un String
        String s = sb.toString();



    }
}

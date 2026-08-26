package java_core.java_core.java_core.chapter_03_core_java_apis.understanding_java_arrays.creating_an_array_of_primitives.creating_an_array_with_reference_variable;

public class ArrayType {
    public static void main(String args[]) {
        //Se instancia un array de tipo String con valores definidos
        String [] bugs = { "cricket", "beetle", "ladybug" };
        //Se crea un nuevo array haciendo referencia al anterior
        String [] alias = bugs;
        //Obtenemos como resultado true porque hacen referencia al mismo objeto
        System.out.println(bugs.equals(alias)); //Resultado: true
        //Imprime la referencia
        System.out.println(bugs.toString()); //Resultado: [Ljava.lang.String;@160bc7c0

        //Crea un array tipo String. Con un valor inicial de 1 elemento
        String[] strings = { "stringValue" };
        //No requiere una conversión porque Object es un tipo más amplio que String
        Object[] objects = strings;
        //En la siguiente línea se necesita una conversión porque se está pasando a un dato más específico
        String[] againStrings = (String[]) objects;
        //Genera un error porque un string no es igual que un StringBuilder
        //againStrings[0] = new StringBuilder(); //Resultado: No compila
        //El IDE acepta la siguiente declaración. Porque un StringBuilder es un Object
        //Pero no tenemos un array de tipo Object sino String
        //lanza una excepción
        //objects[0] = new StringBuilder(); //
    }

    class Names {
        //Es una variable con refencia a nulo. Nunca se llegó instanciar
        //Un array de tipo String
        String names[];

        //Es un array de tipo String. Con una longitud de 2.
        //Actualmente esos espacios son nulos
        String names2[] = new String[2];
    }


}

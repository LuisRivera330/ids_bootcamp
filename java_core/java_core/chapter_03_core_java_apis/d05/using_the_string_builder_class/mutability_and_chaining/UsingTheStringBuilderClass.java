package java_core.java_core.java_core.chapter_03_core_java_apis.d05.using_the_string_builder_class.mutability_and_chaining;

public class UsingTheStringBuilderClass {
    public static void main(String[] args) {
        //Se declara la variable alpha con valor vacío
        String alpha = "";
        //Se crea un bucle for simple
        //Inicializador en a
        //Se ejecuta mientras current sea menor o igual a 'z'
        //el valor de current aumenta en una unidad
        for(char current = 'a'; current <= 'z'; current++)
            //se concatena la palabra alpha con el valor actual de current
            alpha += current;
        //Imprime el valor de alpha
        System.out.println(alpha);//Resultado: El alfabeto completo

        //A diferencia del ejemplo anterior no crea una cadena intermediaria
        StringBuilder alpha2 = new StringBuilder();
        for(char current = 'a'; current <= 'z'; current++)
            //agrega el valor de current en cada iteración del bucle for
            alpha2.append(current);
        //Imprime el alfabeto completo
        System.out.println(alpha2);

        //Crea un objeto de tipo StringBuilder inicia su valor con start
        StringBuilder sb = new StringBuilder("start");
        //Agrega en la parte del medio la palabra "+middle"
        sb.append("+middle"); // sb = "start+middle"
        //Agrega posteriomrente la palabra "+end"
        //same y sb apuntan al mismo objeto
        StringBuilder same = sb.append("+end"); // "start+middle+end"
        System.out.println(same); //Resulado: "start+middle+end"


        //Ejemplo 01:
        //Se crea un objeto de tripo StringBuilder. Se le asigna el valor de 'abc'
        StringBuilder a = new StringBuilder("abc");
        //El objeto 'b' hace referencia al objeto 'a' agregando "de"
        StringBuilder b = a.append("de");
        //Posteriormente 'b' se agrega "f" y "g"
        b = b.append("f").append("g");
        //Como solo se creo un objeto y ambas variables apuntan al mismo
        //El resultado es igual
        System.out.println("a=" + a);
        System.out.println("b=" + b);
    }

}

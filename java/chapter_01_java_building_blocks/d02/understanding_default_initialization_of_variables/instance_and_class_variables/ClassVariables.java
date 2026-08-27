package ids_bootcamp.java.chapter_01_java_building_blocks.d02.understanding_default_initialization_of_variables.instance_and_class_variables;

public class ClassVariables {
    //Las siguientes variables son de clase
    //porque su ciclo de vida inicia junto al del programa y acaba junto con este
    //para ello se utiliza la palabra reservada static
    //estas no requieren inicialización.
    //Tan pronto como se declaren se les asigna un valor predeterminado
    static boolean r;
    static byte byteVariable;
    static char charVariable;

    public static void main (String[] abc){
        //No es necesario que se inicialice un objeto para poder imprimir  para imprimirlo
        //Porque su ciclo de vida alcanza hasta el fin del programa
        //Este al ser un tipo de dato primitivo. Imprime el valor booleano por defecto, es decir false
        System.out.println(r);
        //Este al ser un tipo de dato primitivo. Imprime el valor byte por defecto, es decir 0
        System.out.println(byteVariable);
        //Este al ser un tipo de dato primitivo. Imprime el valor char por defecto, es decir el caracter null
        System.out.println(charVariable);
    }
}

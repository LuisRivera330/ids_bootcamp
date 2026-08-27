package ids_bootcamp.java.chapter_01_java_building_blocks.d02.understanding_default_initialization_of_variables.instance_and_class_variables;

public class ClassVariables {
    //Las siguientes variables son de clase
    //No es necesario que se inicialice un objeto porque tienen la palabra reservada 'static'
    static boolean r;
    static byte byteVariable;
    static char charVariable;

    public static void main (String[] abc){
        //No es necesario que se inicialice un objeto para imprimirlo
        //Porque su ciclo de vida alcanza hasta el fin del programa
        //Imprime el valor booleano por defecto, es decir false
        System.out.println(r);
        //Imprime el valor byte por defecto, es decir 0
        System.out.println(byteVariable);
        //Imprime el valor char por defecto, es decir el caracter null
        System.out.println(charVariable);
    }
}

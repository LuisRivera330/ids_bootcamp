package ids_bootcamp.java.chapter_01_java_building_blocks.d02.understanding_default_initialization_of_variables.instance_and_class_variables;

public class ClassVariables {
    //Las siguientes variables son de clase
    //No es necesario que se inicialice un objeto
    static boolean r;
    static byte byteVariable;
    static char charVariable;

    public static void main (String[] abc){
        //No es necesario que se inicialice un objeto para imprimirlo
        System.out.println(r);
        System.out.println(byteVariable);
        System.out.println(charVariable);
    }
}

package ids_bootcamp.java.chapter_01_java_building_blocks.d01.distinguishing_between_object_references_and_primitives.primitive_types;

public class Primitive {
    public static void main(String[] args) {
        //Imprime el máximo valor para el tipo int 2147483647
        System.out.println(Integer.MAX_VALUE);
        //Imprime 56, en base 10
        System.out.println(56); // 56
        //Imprime 3 en base binaria 0b
        System.out.println(0b11); // 3
        //Indica base 8 imprime 15
        System.out.println(017); //
        //Indica base 16. Imprime 31
        System.out.println(0x1F); // 31
        //Las siguientes variables son iguales. Los _ sirven para mejorar la legibilidad
        int million1 = 1000000;
        int million2 = 1_000_000;


        //double notAtStart = _1000.00; // Genera un error porque no puede ir "_" al inicio
        //double notAtEnd = 1000.00_; // Genera un error porque no puede ir "_" al final
        //double notByDecimal = 1000_.00; // Genera un error porque no puede ir "_" antes del punto decimal
        double annoyingButLegal = 1_00_0.0_0; // Este ejemplo si compila con normalidad
    }

}

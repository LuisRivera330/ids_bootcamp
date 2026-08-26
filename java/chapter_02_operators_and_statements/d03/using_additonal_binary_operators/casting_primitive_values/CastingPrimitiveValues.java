package ids_bootcamp.java.chapter_02_operators_and_statements.d03.using_additonal_binary_operators.casting_primitive_values;

public class CastingPrimitiveValues {
    public static void main(String[] args) {
        //Se castea los valores al tipo de valor deseado
        int x = (int)1.0; //Imprime 1
        short y = (short)1921222; // Se guarda como 20678
        int z = (int)9l; //Imprime 9
        long t = 192301398193810323L; //Imprime 192301398193810323

        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
        System.out.println(t);

        short x2 = 10;
        short y2 = 3;
        short z2 = (short) (x2 * y2); // A pesar que el resultado no puede caber en un tipo de dato short. Lo forzamos
        System.out.println(z2);
    }
}

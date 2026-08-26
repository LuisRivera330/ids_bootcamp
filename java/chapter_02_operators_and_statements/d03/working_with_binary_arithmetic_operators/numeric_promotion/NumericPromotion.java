package ids_bootcamp.java.chapter_02_operators_and_statements.d03.working_with_binary_arithmetic_operators.numeric_promotion;

public class NumericPromotion {
    public static void main(String[] args) {
        /*int x = 1;
        long y = 33;
        long t = x * y;
        System.out.println(t); //Como "long" es más grande que "int" el resultado será long

        double f = 39.21;
        float g = 2.1; // Hay un error de compilación, ya que si no se coloca una "f" al final el IDE lo tomará como si fuera un double
        double u = f * g; //El tipo de dato sería double
        System.out.println(u);

        short n = 10;
        short m = 3;
        int d = n / m; //Al ser tipo de datos pequeños el resultado se vuelve en int
        System.out.println(d);*/

        short x = 14; //Se convertirá automaticamente en int porque short es muy pequeño
        float y = 13; // El subresultado será de tipo float
        double z = 30; // El resultado será de tipo double porque es más grande
        double t = x * y / z;
        System.out.println(t); //Imprime  6.066666666666666
    }
}

package ids_bootcamp.java.chapter_03_core_java_apis.d05.creating_and_manipulating_strings.method_chaining;

public class MethodChaining {
    public static void main(String[] args) {
        //Se declara la variable start de tipo String
        String start = "AniMaL ";
        //Se elimina el espacio en blanco del final con la función trim
        String trimmed = start.trim(); // "AniMaL"
        //Convierte toda la palabra en minúscula
        String lowercase = trimmed.toLowerCase(); // "animal"
        //Reemplaza toda la letra 'a' con la 'A' mayúscula
        String result = lowercase.replace('a', 'A'); //Resultado: "AnimAl"
        System.out.println(result);

        //El siguiente ejemplo realiza lo mismo de arriba solo que lo ejecuta en una sola línea
        String result2 = "AniMaL ".trim().toLowerCase().replace('a', 'A');
        System.out.println(result2);

        //Ejemplo 02:
        //Asignamos a 'a' el valor "abc"
        String a = "abc";
        //Se asigna a 'b' el valor de 'a' pero se coloca en mayúscula
        String b = a.toUpperCase();
        //Se reemplaza la palabra 'B' y 'C' por los números '2' y '3' respectivamente
        b = b.replace("B", "2").replace('C', '3');
        //Se imprime el valor de a
        System.out.println("a=" + a); //a=abc
        //Se imprime el valor de b
        System.out.println("b=" + b); //b=A23
    }
}

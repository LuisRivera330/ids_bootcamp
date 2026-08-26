package java_core.java_core.java_core.chapter_03_core_java_apis.d05.creating_and_manipulating_strings.concatenation;

public class Concatenation {
    public static void main(String[] args) {
        //El primer ejemplo suma ambos valores porque son números.
        System.out.println(1 + 2); // Resultado: 3
        //El segundo ejemplo concatena porque ambos valores son tipo String
        System.out.println("a" + "b"); // Resultado: ab
        //El tercer ejemplo concatena. Es una mezcla de 2 String con un valor numérico
        System.out.println("a" + "b" + 3); // Resultado: ab3
        //El cuarto ejemplo al comienzo suma ambos valores númericos y luego concatena con el string
        System.out.println(1 + 2 + "c"); // Resultado: 3c

        //En el siguiente ejemplo se declara una variable tipo int, con valor inicial de 3
        int three = 3;
        //El String tiene un valor inicial de "4"
        String four = "4";
        //El resultado suma los valores numéricos y luego concatena con la variable four
        System.out.println(1 + 2 + three + four); //Resultado 64

        //El siguiente ejemplo es una especie de concatenación implícita
        String s = "1";
        //La siguiente expresión s += "2" significa s = s + "2". Como ambos son String se concatena
        s += "2";
        //De la misma manera la siguiente expresión s += 3 significa s = s + 3. A diferencia del anterior 3 es númerico
        //Pero como es una suma de un dato número más un String simplemente se concatena
        s += 3;
        System.out.println(s); //Resultado: 123
    }
}

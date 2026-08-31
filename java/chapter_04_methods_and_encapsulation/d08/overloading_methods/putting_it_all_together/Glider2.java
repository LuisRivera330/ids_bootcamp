package ids_bootcamp.java.chapter_04_methods_and_encapsulation.overloading_methods.putting_it_all_together;

public class Glider2 {
    //Resultado final: 142
    //La primera llamada "a" coincide con la firma, tomando una sola cadena porque es la coincidencia más específica
    //La segunda llamada "a", "b" coincide con la firma, tomando dos parámetros de cadena
    //La tercera llamada "a", "b", "c" usa la versión con argumentos variables, ya que no encuentra una coincidencia directa
    public static String glide(String s) {
        return "1";
    }
    public static String glide(String... s) {
        return "2";
    }
    public static String glide(Object o) {
        return "3";
    }
    public static String glide(String s, String t) {
        return "4";
    }
    public static void main(String[] args) {
        System.out.print(glide("a"));
        System.out.print(glide("a", "b"));
        System.out.print(glide("a", "b", "c"));
    }
}

package ids_bootcamp.java.chapter_04_methods_and_encapsulation.d08.applying_access_modifiers.static_vs_instance;

public class Static {
    //3. Otra solución habría sido llamar a `third` como un método de instancia
    private static String name = "Static class";
    public static void first() { }
    public static void second() { }
    //2. El método third hace referencia a un método no estático llamado 'name.
    // Para solucionar ello, se puede colocar al miembro name como estático
    public static void third() { System.out.println(name); }
    public static void main(String args[]) {
        first();
        second();
        //1. No compilará ya que, se intenta hacer una referencia estática a un método no estático.
        //  Se puede solucionar colocando la palabra static. Pero a su vez genera otro error
        third();
    } }

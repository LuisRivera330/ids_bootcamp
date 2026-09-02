package ids_bootcamp.java.chapter_04_methods_and_encapsulation.d08.overloading_methods.putting_it_all_together;

public class TooManyConversions {
    public static void play(Long l) { }
    public static void play(Long... l) { }
    public static void main(String[] args) {
        //play(4); // No compila porque, no se  puede realizar la conversión en dos pasos: primero a un long (primitivo) y luego a Long(objeto)
        play(4L); // En es este caso no hay problema porque, la conversión es explícita Long(objeto)

    }
}

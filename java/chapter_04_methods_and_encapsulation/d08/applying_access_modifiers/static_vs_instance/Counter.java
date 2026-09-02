package ids_bootcamp.java.chapter_04_methods_and_encapsulation.d08.applying_access_modifiers.static_vs_instance;

public class Counter {
    //Se crea una variable de instancia de tipo int
    private static int count;
    //En el constructor de la clase cada vez que se le llame.
    //la variable count aumentará en una unidad
    public Counter() {
        count++;
    }

    //En este caso se está llamando 3 veces al constructor. Por lo tanto, el resultado count imprime un valor de 3
    public static void main(String[] args) {
        Counter c1 = new Counter();
        Counter c2 = new Counter();
        Counter c3 = new Counter();
        System.out.println(count); //Resultado: 3
    }
}

package ids_bootcamp.java.chapter_04_methods_and_encapsulation.d08.applying_access_modifiers.designing_static_methods_and_fields;

public class Koala {
    public static int count = 0; // Variable estática que contiene un valor de tipo int. Valor incial de 0
    public static void main(String[] args) { //método estático
        System.out.println(count);
    }
}

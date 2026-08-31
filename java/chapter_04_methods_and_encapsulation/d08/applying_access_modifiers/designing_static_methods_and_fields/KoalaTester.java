package ids_bootcamp.java.chapter_04_methods_and_encapsulation.d08.applying_access_modifiers.designing_static_methods_and_fields;

public class KoalaTester {
    //Podemos tener un KoalaTester que simplemente llame al método main().
    //Al ejecutar KoalaTester, este llama al método main() de Koala, que imprime el valor de count
    //El método `main()` se puede llamar como cualquier otro método estático.
    public static void main(String[] args) {
        Koala.main(new String[0]);
    }
}

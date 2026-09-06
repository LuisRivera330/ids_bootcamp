package ids_bootcamp.java.chapter_04_methods_and_encapsulation.d08.applying_access_modifiers.protected_access.shore;

public class Bird {
    protected String text = "floating"; // Se coloca el atributo text en acceso "protected"
    protected void floatInWater() { // Se coloca el método floatInWater en acceso "protected". Dentro de este método se imprime la variable text
        System.out.println(text);
    }
}

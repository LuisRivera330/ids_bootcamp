package ids_bootcamp.java.chapter_04_methods_and_encapsulation.d09.creating_constructors.final_fields;

public class MouseHouse {
    private final int volume;
    private final String name = "The Mouse House";
    //El siguiente bloque de código es válido porque, el constructor forma parte del proceso de inicialización,
    // por lo que se permite asignar variables de instancia finales en él.
    //Cuando el constructor finaliza, todas las variables de instancia finales deben haber recibido un valor.
    public MouseHouse(int length, int width, int height) {
        volume = length * width * height;
    }
}
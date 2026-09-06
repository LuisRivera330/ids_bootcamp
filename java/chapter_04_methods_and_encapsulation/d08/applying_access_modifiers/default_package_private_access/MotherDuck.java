package ids_bootcamp.java.chapter_04_methods_and_encapsulation.d08.applying_access_modifiers.default_package_private_access;

public class MotherDuck {

    //Se crea una variable instancia con acceso de tipo 'default'
    String noise = "quack";
    //Se crea un método de acceso por 'default'. No retorna ningún valor. E imprime noise
    void quack() {
        System.out.println(noise); // default access is ok
    }
    //el método makeNoise() es de tipo privado
    private void makeNoise() {
        quack(); // default access is ok
    } }